package uiElement.pages;

import org.openqa.selenium.support.PageFactory;
import uiElement.locator.GenericPageLocator;

public class GenericPage extends GenericPageLocator {

    public GenericPage(){
        PageFactory.initElements(driver,this);
    }

}
