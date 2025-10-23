package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement find(By locator) {
        WebElement element = driver.findElement(locator);
        return element;
    }


    protected void set(By locator, String value) {
        WebElement element = find(locator);
        element.sendKeys(value);
    }


    protected void click(By locator) {
        find(locator).click();
    }


}
