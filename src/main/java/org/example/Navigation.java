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


}
