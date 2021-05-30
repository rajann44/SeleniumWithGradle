package testScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import uiElement.pages.GenericPage;

public class VerifyAmazonFlipkart {

    GenericPage genericPage = new GenericPage();

    @Test(groups="Smoke")
    public void justAmazon(){

        genericPage.navigateToTheURL("https://amazon.com/");
        genericPage.sleepFor(2);
        genericPage.refreshBrowser();

    }

    @Test (groups="Regression")
    public void justFlipkart(){

        genericPage.navigateToTheURL("https://flipkart.com/");
        genericPage.sleepFor(2);
        genericPage.refreshBrowser();

    }

    @AfterClass
    public void closeBrowser(){

        genericPage.closeBrowser();

    }

}
