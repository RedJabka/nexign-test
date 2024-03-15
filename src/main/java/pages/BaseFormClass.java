package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BaseFormClass {
    public BaseFormClass(){
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public boolean assertPage(){
        return true;
    }


}