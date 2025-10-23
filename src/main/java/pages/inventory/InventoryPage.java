package pages.inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class InventoryPage extends BasePage {
    // I understand that SauceDemo is intentionally designed with stable test IDs
    // to facilitate automation testing. However, since I always aim for scalability
    // and locator robustness, I would normally prefer the following resilient XPath:

    // 👉 👉👉👉👉 private By titleInventoryPageLocator = By.xpath("//*[contains(@class,'header')]//*[contains(.,'Product')]");


    // For this specific exercise, I will stick to the professional best practices
    // aligned with SauceDemo AUT (using the provided test IDs).


    private  By titleInventoryPageLocator = By.cssSelector("[data-test='title']");
    public InventoryPage(WebDriver driver){
        super(driver);
    }


    public Boolean isInventoryPageDisplayed(){
        return find(titleInventoryPageLocator).isDisplayed();
    }
}
