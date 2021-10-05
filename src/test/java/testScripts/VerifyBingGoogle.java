package testScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import uiElement.pages.GenericPage;

public class VerifyBingGoogle {

    GenericPage genericPage = new GenericPage();

    @Test (groups="Smoke")
    public void justGoogle(){

        genericPage.navigateToTheURL("https://google.com/");
        genericPage.sleepFor(2);
        genericPage.refreshBrowser();

    }

    @Test (groups="Regression")
    public void justBing(){

        genericPage.navigateToTheURL("https://bing.com/");
        genericPage.sleepFor(3);
        genericPage.refreshBrowser();

    }

    @AfterClass
    public void closeBrowser(){

        genericPage.closeBrowser();

    }

}
