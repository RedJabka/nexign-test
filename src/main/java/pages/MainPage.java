package pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigManager;
import utils.Driver;

public class MainPage extends BaseFormClass{
    @FindBy(xpath = "//*[contains(@class,'welcome-banner__content-title')]")
    private WebElement uniqueElement;
    @FindBy(xpath = "//*[contains(@class,'store')]")
    private WebElement store;
    private WebElement body = Driver.getInstance().findElement(By.tagName("body"));
    public void clickStore() {
        store.click();
    }
    public boolean storeOpen() {
        return store.getAttribute(ConfigManager.getVariable("attribute1")).contains("active");
    }

    public void clickDevProducts() {
        store.findElement(By.xpath(ConfigManager.getVariable("DevProducts"))).click();
    }

    public boolean assertPage(){
        return Driver.getInstance().getTitle().contains("лавная");
    }

    public int countSubstring(String toFind){
        String pageText = body.getText().toLowerCase();
        System.out.println(pageText);
        return StringUtils.countMatches(pageText, toFind);
    }
}
