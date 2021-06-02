package utils;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverAgent {

    protected static WebDriver driver;
    public static String browser, implicitWaitTime;

    public static WebDriver getDriver(){
        PropertiesFile.readPropertiesFile();
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        if(browser.equals("headless")){
            WebDriverManager.firefoxdriver().setup();
            driver = new HtmlUnitDriver();
        }

        driver.manage().timeouts().implicitlyWait(Long.parseLong(implicitWaitTime), TimeUnit.SECONDS);

        return driver;
    }

    public static void closeBrowser(){
        driver.quit();
    }

}
