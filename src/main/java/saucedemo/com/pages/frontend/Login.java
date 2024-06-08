package saucedemo.com.pages.frontend;

import org.openqa.selenium.By;
import saucedemo.com.utils.Browser;

public class Login {

    /**
     * It opens the website saucedemo.com
     */

    public static void navigate() {
        Browser.driver.get("https://www.saucedemo.com/");
    }


    /**
     * Logs in the website saucedemo.com by the provided credentials as argument
     * @param username the username you would like to login with
     * @param password the password you would like to login with
     */
    public static void login(String username, String password) {
        Browser.driver.findElement(By.id("user-name")).sendKeys(username);
        Browser.driver.findElement(By.id("password")).sendKeys(password);
        Browser.driver.findElement(By.id("login-button")).click();
    }
}
