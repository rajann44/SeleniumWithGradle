package config;

import uiElement.pages.BasePage;
import utils.WebDriverAgent;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

    public static void readPropertiesFile(){
        Properties prop = new Properties();
        try {
            InputStream inputStream = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/config/config.properties");
            prop.load(inputStream);
            BasePage.explicitWaitTime = prop.getProperty("explicitWait");
            WebDriverAgent.browser = prop.getProperty("browser");
            WebDriverAgent.implicitWaitTime = prop.getProperty("implicitWait");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
