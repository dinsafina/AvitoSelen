package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@data-marker='search-form/suggest']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@data-marker='search-form/submit-button']")
    private WebElement searchProductBtn;

    public MainPage enterProduct(String text){
        searchInput.click();
        searchInput.sendKeys(text);
        return this;
    }

    public MainPage searchProductClick(){
        searchProductBtn.click();
        return this;
    }
}
