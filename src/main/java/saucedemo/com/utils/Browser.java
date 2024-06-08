package saucedemo.com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browser {

    public static WebDriver driver;

    /**
     * Opens a new default Chrome browser window and sets an implicit wait of 10 seconds and maximize the window
     */

    public static void open() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    /**
     * Quits the browser process by closing all associated windows
     */
    public static void quit() {
        driver.quit();
    }

}
