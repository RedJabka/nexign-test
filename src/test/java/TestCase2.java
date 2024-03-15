import org.junit.Assert;
import org.junit.Test;
import utils.ConfigManager;

public class TestCase2 extends BaseTestClass{
    @Test
    public void test() {
        int count = mainPage.countSubstring(ConfigManager.getVariable("toFind").toLowerCase());
        Assert.assertEquals("Количество упоминаний слова 'Nord' на главной странице сайта", 1, count);
    }
}
