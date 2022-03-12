package co.com.bancolombia.certificacion.tuboleta.util.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MyDriver {

    private static WebDriver driver;

    public static MyDriver web() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/andresrios/Documents/AndresRios/AutomationGuild/ejemplo_screenplay_serenity_gradle_juinit_tuBolete/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito", "--star-maximized", "--disable-infobars");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return new MyDriver();
    }

    public WebDriver enLaPagina(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}
