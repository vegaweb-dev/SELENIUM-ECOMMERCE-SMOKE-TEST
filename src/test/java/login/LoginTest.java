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
        String url = ConfigReader.get("url");
        driver.get(url);
        loginPage = new LoginPage(driver);
        loginPage.setUser(System.getenv("APP_USER"));
        loginPage.setPassword(System.getenv("PASSWORD"));
        loginPage.clickLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Login test failed: Expected user to be redirected to the Inventory page after successful login.");
    }
}
