package org.example;

import com.microsoft.playwright.*;


public class Main {
    public static void main(String[] args) {

        Navigation nav = new Navigation(1000);

        // Homepage
//        nav.navigateHomeQa2();
//        String title = nav.getPage().title();
//        String URL = nav.getPage().url();
//        Locator logoLocator = nav.createLocator("#header > div > a > img.large");
//        logoLocator.click();
//        nav.navigateToChelseeTee();
//        nav.getPage().goBack();
//        nav.getPage().goForward();
//        nav.getPage().reload();
//        nav.navigateClose();

        // Account
//        nav.navigateHomeQa2();
//        Locator accountButton = nav.getPage().locator("div[class='account-cart-wrapper']");
//        accountButton.click();
//        accountButton = nav.getPage().locator("#header-account > div > ul > li.first > a");
//        accountButton.click();
//        nav.navigateClose();

        // Search
//        nav.navigateHomeQa2();
//        Locator searchInput = nav.getPage().locator("#search");
//        searchInput.fill("woman");
//        Locator searchButton = nav.getPage().locator("#search_mini_form > div.input-box > button");
//        searchButton.click();
//        nav.navigateClose();

        // New Product List
        nav.navigateHomeQa2();
        nav.printProductsInList("body > div > div > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul");
        nav.navigateClose();




    }
}