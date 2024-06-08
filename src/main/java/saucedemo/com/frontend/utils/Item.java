package saucedemo.com.frontend.utils;

import org.openqa.selenium.By;
import saucedemo.com.utils.Browser;

public class Item {
    public static void addToBag() {
        Browser.driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
}
