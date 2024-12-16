package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class browserActions {
    static WebDriver driver;

    public static WebDriver Webactions(String browser, boolean maximize, boolean headless) {

        if (browser.equalsIgnoreCase("chrome") && !headless) {
            System.out.println("Chrome Driver initialized");
            driver = new ChromeDriver();
            System.out.println("Chrome Driver Opened");
        } else if (browser.equalsIgnoreCase("edge") && !headless) {
            System.out.println("Edge Driver initialized");
            driver = new EdgeDriver();
            System.out.println("Edge Driver Opened");
        } else if (browser.equalsIgnoreCase("chrome") && headless) {
            System.out.println("HeadLess Chrome Driver initialized");
            ChromeOptions options= new ChromeOptions();
            options.addArguments("headless");
            driver = new ChromeDriver(options);
            System.out.println("Title is: " +driver.getTitle());
            System.out.println("Headless Chrome Driver opened");
        }
        if (maximize) {
            System.out.println("Window maximized");
            driver.manage().window().maximize();
            System.out.println(driver.manage().window().getSize());
        } else {
            System.out.println("Window isn't maximized");
            System.out.println(driver.manage().window().getSize());
        }
        return driver;
    }

}
