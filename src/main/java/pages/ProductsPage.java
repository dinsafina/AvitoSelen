package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class, 'desktop-1209suv')]")
    private WebElement dropDown;

    @FindBy(xpath = "//option[text()= 'Дороже']")
    private WebElement expensive;

    @FindBy(xpath = "//h3[@itemprop=\"name\"]")
    private List<WebElement> productsTitle;

    @FindBy(xpath = "//span[@class=\"price-text-_YGDY text-text-LurtD text-size-s-BxGpL\"]")
    private List<WebElement> productsPrice;

    @FindBy(xpath = "//*[text() = 'Только в названиях']")
    private WebElement checkBox;

    public void checkBoxClick(){
        WebElement element = this.waitElementIsClickable(checkBox);
        element.click();
    }

    public void dropDownClick() {
        WebElement element = this.waitElementIsClickable(dropDown);
        element.click();
    }

    public void chooseExpensive() {
        WebElement element = this.waitElementIsClickable(expensive);
        element.click();
    }

    public void outputResults(int count) {
        for (int i = 0; i <= count-1; i++) {
            String productName = productsTitle.get(i).getText();
            String price = productsPrice.get(i).getText();
            System.out.println("Товар: " + productName + ". Цена: " + price);
        }
    }
}
