import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;
import utils.ConfigManager;
import utils.Driver;

public class BaseTestClass {
    public static MainPage mainPage;

    @BeforeClass
    public static void setup() {
        Driver.getInstance().get(ConfigManager.getProperty("url"));

        mainPage = new MainPage();
        Assert.assertTrue(mainPage.assertPage());
    }

    @Test
    public void test() {

    }

    @AfterClass
    public static void finish() {
        Driver.getInstance().quit();
    }
}
