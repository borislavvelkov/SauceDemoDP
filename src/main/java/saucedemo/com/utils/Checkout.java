package saucedemo.com.utils;

import org.openqa.selenium.By;

public class Checkout {
    public static void checkout() {
        Browser.driver.findElement(By.id("checkout")).click();
    }

    public static void yourInformation() {
        Browser.driver.findElement(By.id("first-name")).sendKeys("Borislav");
        Browser.driver.findElement(By.id("last-name")).sendKeys("Velkov");
        Browser.driver.findElement(By.id("postal-code")).sendKeys("1234");
        Browser.driver.findElement(By.id("continue")).click();
        Browser.driver.findElement(By.id("finish")).click();
    }
}
