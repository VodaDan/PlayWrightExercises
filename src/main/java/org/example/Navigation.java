package org.example;

import com.microsoft.playwright.*;


public class Navigation {

    private String env="qa2";
    private Playwright playwright;
    private Browser browser;
    private Page page;

    public Navigation(int slowMoValue) {
        this.playwright = Playwright.create();
        this.browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(slowMoValue));
        this.page = browser.newPage();
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public void navigateHomeQa2(){
        this.page.navigate("http://qa2magento.dev.evozon.com/");
        this.env = "qa2";
    }

    public void navigateHomeQa3(){
        this.page.navigate("http://qa3magento.dev.evozon.com/");
        this.env = "qa3";
    }

    public void navigateToChelseeTee(){
        this.page.navigate("http://"+this.env+"magento.dev.evozon.com/chelsea-tee-737.html");
    }

    public void navigateTo(String link) {
        this.page.navigate(link);
    }

    public void navigateClose(){
        this.page.close();
        this.browser.close();
        this.playwright.close();
    }

    public void printProductsInList(String selector) {
        Locator list = this.page.locator(selector);
        Locator options = list.locator("li.item");
        int numberOfProducts = options.count();
        System.out.println(numberOfProducts + " Options in list.");

        for (int i = 0; i < numberOfProducts; i++) {
            Locator linkLocator = options.nth(i).locator("a.product-image");
            String title = linkLocator.getAttribute("title");
            System.out.println((i + 1) + ". " + title);
        }
    }

    public void createLocatorAndClick(String selector){
        Locator newLocator = this.page.locator(selector);
        newLocator.click();
    }

    public void createLocatorAndHover(String selector){
        Locator newLocator = this.page.locator(selector);
        newLocator.click();
    }

    public void addConfigurableItemToCart(){
        this.navigateHomeQa2();
        createLocatorAndHover("#nav > ol > li.level0.nav-2.parent > a"); // man menu
        createLocatorAndClick("#nav > ol > li.level0.nav-2.parent > ul > li.level1.nav-2-1.first > a"); // new arrivals
        createLocatorAndClick("#product-collection-image-410"); // chelsee tee image
        createLocatorAndClick("#swatch27 > span.swatch-label > img"); // blue color
        createLocatorAndClick("#swatch79 > span.swatch-label"); // M
        Locator qtyField = this.getPage().locator("#qty");
        qtyField.fill("2");
        createLocatorAndClick("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button"); // add to cart
    }




}
