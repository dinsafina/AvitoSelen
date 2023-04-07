package base;

import common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import pages.LocationChoose;
import pages.MainPage;
import pages.ProductsPage;
import pages.base.BasePage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    private final WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LocationChoose locationChoose = new LocationChoose(driver);
    protected MainPage mainPage = new MainPage(driver);
    protected ProductsPage productsPage = new ProductsPage(driver);

    @AfterAll
    public void close() {
        driver.close();
    }
}
