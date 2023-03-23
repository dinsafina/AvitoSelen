package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import property.PropertyVars;
import property.Values;
import java.time.Duration;

public class CommonActions {
    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        Values values = PropertyVars.getProperty();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(values.getImplicit_wait()));
        return driver;
    }
}
