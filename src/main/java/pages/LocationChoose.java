package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class LocationChoose extends BasePage {

    public LocationChoose(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='index-rightWrapper-_z7uN']")
    private WebElement chooseCity;

    @FindBy(xpath = "//input[@placeholder='Город или регион']")
    private WebElement inputCity;

    @FindBy(xpath = "//li[@data-marker='suggest(0)']")
    private WebElement firstCityResult;

    @FindBy(xpath = "//button[@data-marker='popup-location/save-button']")
    private WebElement showResultsBtn;

    public void clickCity() {
        chooseCity.click();
    }


    public void enterCity(String city) {
        inputCity.click();
        inputCity.clear();
        inputCity.sendKeys(city);
    }

    public void chooseCity() {
        WebElement element = this.waitElementIsClickable(firstCityResult);
        element.click();
    }

    public void showResults() {
        for (int i = 0; i < 10; i++) {
            try {
                WebElement element1 = this.waitElementIsClickable(showResultsBtn);
                element1.click();
                break;
            } catch (StaleElementReferenceException e) {
                WebElement element2 = this.waitElementIsClickable(showResultsBtn);
                element2.click();
            }
        }
        new LocationChoose(driver);
    }
}