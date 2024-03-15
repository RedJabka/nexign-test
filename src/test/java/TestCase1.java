import org.junit.Assert;
import org.junit.Test;
import pages.DevToolsPage;
import utils.Driver;

public class TestCase1 extends BaseTestClass{
    @Test
    public void test() {
        mainPage.clickStore();
        Assert.assertTrue(mainPage.storeOpen());

        mainPage.clickDevProducts();
        DevToolsPage devProducts = new DevToolsPage();
        Assert.assertTrue(devProducts.assertPage());
    }
}
