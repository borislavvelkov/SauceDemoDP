package saucedemo.com.utils;

import org.openqa.selenium.By;

public class Checkout {
    public static void checkout() {
        Browser.driver.findElement(By.id("checkout")).click();
    }
}
