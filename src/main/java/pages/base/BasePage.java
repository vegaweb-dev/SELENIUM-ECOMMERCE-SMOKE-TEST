package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverManager;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return DriverManager.getDriver();
    }

    protected WebElement find(By locator) {
        /*WebElement element = driver.findElement(locator);
        return element;*/
        return driver.findElement(locator);
    }


    protected void set(By locator, String value) {
        WebElement element = find(locator);
        element.sendKeys(value);
    }


    protected void click(By locator) {
        find(locator).click();
    }


}
