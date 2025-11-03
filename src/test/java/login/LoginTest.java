package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.login.LoginPage;
import utilities.ConfigReader;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @Test
    public void shouldLoginSuccessfullyAndRedirectToInventoryPage() {
        String url = ConfigReader.get("APP_URL");
        String user = ConfigReader.get("APP_USER");
        String password = ConfigReader.get("APP_PASSWORD");
        driver.get(url);
        loginPage = new LoginPage(driver);
        loginPage.setUser(user);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Login test failed: Expected user to be redirected to the Inventory page after successful login.");
    }
}
