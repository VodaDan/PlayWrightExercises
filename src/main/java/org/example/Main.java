package org.example;

import com.microsoft.playwright.*;


public class Main {
    public static void main(String[] args) {

        Navigation nav = new Navigation(500);

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
//        nav.navigateHomeQa2();
//        nav.printProductsInList("body > div > div > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul");
//        nav.navigateClose();

        // Navigation
//        nav.navigateHomeQa2();
//        Locator saleHeadline = nav.getPage().locator("#nav > ol > li.level0.nav-5.parent");
//        saleHeadline.hover();
//        Locator menSale = nav.getPage().locator("#nav > ol > li.level0.nav-5.parent > ul > li.level1.nav-5-2");
//        menSale.click();
//        nav.navigateClose();

        // Add product to cart
//        nav.addConfigurableItemToCart();
//        nav.navigateClose();

        // Remove product from cart
        nav.addConfigurableItemToCart();
        nav.navigateHomeQa2();
        nav.createLocatorAndClick("body > div > div > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(2) > a > img");
        nav.createLocatorAndClick("#swatch16 > span.swatch-label > img");
        nav.createLocatorAndClick("#swatch79 > span.swatch-label");
        nav.createLocatorAndClick("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button");
        nav.createLocatorAndClick("#shopping-cart-table > tbody > tr.first.odd > td.a-center.product-cart-remove.last > a");
        nav.navigateClose();
    }
}