package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import property.PropertyVars;
import property.Values;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    final Values values = PropertyVars.getProperty();

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public WebElement waitElementIsClickable(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(values.getExplicit_wait())).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }
}