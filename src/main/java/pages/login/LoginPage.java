package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.inventory.InventoryPage;

public class LoginPage extends BasePage {
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By clickButton = By.id("login-button");
    private By errorMessage = By.xpath("//*[contains(@class,'error')]//*[contains(text(),'Epic')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void setUser(String user) {
        waitForVisibility(usernameField, 10);
        set(usernameField, user);
    }

    public void setPassword(String password) {
        waitForVisibility(passwordField, 10);
        set(passwordField, password);
    }

    public void enterCredentials(String user, String password) {
        setUser(user);
        setPassword(password);
    }

    public void clickLoginButton() {
        waitForClickable(clickButton, 10);
        click(clickButton);
    }

    public String errorMessage(String user, String password) {
        waitForVisibility(errorMessage, 10);
        setUser(user);
        setPassword(password);
        clickLoginButton();
        return "Epic sadface: Username and password do not match any user in this service";
    }

    public InventoryPage loginPage(String user, String password) {
        setUser(user);
        setPassword(password);
        clickLoginButton();
        return new InventoryPage(driver);
    }
}


