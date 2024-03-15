package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    private static WebDriver driver;

    public static synchronized WebDriver getInstance() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments(ConfigManager.getProperty("en_lang"));
            options.addArguments(ConfigManager.getProperty("incognito_mode"));
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }
}