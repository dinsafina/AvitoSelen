package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LocationChoose;
import property.Values;


public class PagesTest extends BaseTest {
    final String PRODUCT = "Планшет";
    final String CITY= "Казань";
    final int COUNT = 3;

    Values values = propertyVars.getProperty();

    @Test
    public void chooseTheMostExpensiveTabletInKazan(){

        basePage.goToUrl(values.getUrl());
        mainPage.enterProduct(PRODUCT);
        mainPage.searchProductClick();

        locationChoose.clickCity();
        locationChoose.enterCity(CITY);
        LocationChoose locationChoose1 = locationChoose.chooseCity();
        locationChoose1.showResults();

        productsPage.dropDownClick();
        productsPage.chooseExpensive();
        productsPage.checkBoxClick();
        productsPage.outputResults(COUNT);
    }
}
