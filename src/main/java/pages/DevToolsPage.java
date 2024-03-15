package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DevToolsPage extends BaseFormClass {
    @FindBy(xpath = "//*[contains(@class, 'content-section__title')]")
    private WebElement uniqueElemenet;

    public boolean assertPage() {
        return uniqueElemenet.isDisplayed();
    }
}
