package login;

import base.BaseTest;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.login.LoginPage;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @Test
    public void shouldLoginSuccessfullyAndRedirectToInventoryPage() {
        String url = "https://www.saucedemo.com";
        driver.get(url);
        loginPage = new LoginPage(driver);
        loginPage.setUser("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Login test failed: Expected user to be redirected to the Inventory page after successful login.");
    }
}
