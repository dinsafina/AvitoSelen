package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import property.PropertyVars;
import property.Values;


public class PagesTest extends BaseTest {
    final String PRODUCT = "Планшет";
    final String CITY= "Казань";
    final int COUNT = 3;

    final Values values = PropertyVars.getProperty();

    @Test
    public void chooseTheMostExpensiveTabletInKazan(){
        basePage.goToUrl(values.getUrl());
        mainPage.enterProduct(PRODUCT);
        mainPage.searchProductClick();

        locationChoose.clickCity();
        locationChoose.enterCity(CITY);
        locationChoose.chooseCity();
        locationChoose.showResults();

        productsPage.dropDownClick();
        productsPage.chooseExpensive();
        productsPage.checkBoxClick();
        productsPage.outputResults(COUNT);
    }
}
