package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {


        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.simple.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if (threadBrowserName.get() == null)
            threadBrowserName.set("chrome");

        if (threadDriver.get() == null) {

            switch (threadBrowserName.get()) {

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;

//                case "safari" :
//                    WebDriverManager.safaridriver().setup();
//                    threadDriver.set(new SafariDriver());
//                    break;
//
//                case "edge" :
//                    WebDriverManager.edgedriver().setup();
//                    threadDriver.set(new EdgeDriver());
//                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
            }
        }
        return threadDriver.get();
    }

    public static void quitDriver() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }
    }

    public static void setThreadBrowserName(String browserName) {
        GWD.threadBrowserName.set(browserName);
    }

    public static String getThreadBrowserName() {
        return GWD.threadBrowserName.get();
    }
}
