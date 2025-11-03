package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        try (FileInputStream input = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(input);
            System.out.println("config.properties loaded successfully");
        } catch (IOException e) {
            System.out.println("config.properties not found, I go back to environment variables right now");
        }
    }

    public static String get(String key) {
        String envValue = System.getenv(key);
        if (envValue != null && !envValue.isEmpty()) {
            return envValue;
        }

        envValue = System.getenv(key.toUpperCase());
        if (envValue != null && !envValue.isEmpty()) {
            return envValue;
        }

        String propValue = properties.getProperty(key);
        if (propValue != null) {
            return propValue;
        }

        System.err.println("Missing key" + key + "--return empty value");
        return "";
    }
}
