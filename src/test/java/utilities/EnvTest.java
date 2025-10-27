package utilities;

public class EnvTest {
    public static void main(String[] args) {
        System.out.println("URL: " + System.getenv("URL"));
        System.out.println("APP_USER: " + System.getenv("APP_USER"));
        System.out.println("PASSWORD: " + System.getenv("PASSWORD"));
        System.out.println("BROWSER: " + System.getenv("BROWSER"));
    }
}
