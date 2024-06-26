package saucedemo.com.frontend.possitive;

import org.testng.annotations.Test;
import saucedemo.com.frontend.BaseTest;
import saucedemo.com.frontend.assertions.Verify;
import saucedemo.com.frontend.components.cart.Cart;
import saucedemo.com.frontend.utils.Item;
import saucedemo.com.pages.frontend.Login;
import saucedemo.com.pages.frontend.components.Header;
import saucedemo.com.utils.Checkout;

public class LoginTests extends BaseTest {


    @Test
    public void successfulLogin() {

        Login.navigate();
        Login.login("standard_user", "secret_sauce");
        Header.verifyCartAvailability("Swag Labs", "the button was not present, so logging in failed");

    }

    @Test
    public void successfulAddingToCart() {
        Login.navigate();
        Login.login("standard_user", "secret_sauce");
        Item.addToBag();
        Verify.itemsIsInTheCart("1", "the item is not added to cart");
    }

    @Test
    public void checkingOut() {
        Login.navigate();
        Login.login("standard_user", "secret_sauce");
        Item.addToBag();
        Cart.openCart();
        Checkout.checkout();
        Verify.successfulCheckOut("Checkout: Your Information", "epic fail xD");
    }


    @Test
    public void completeCheckout() {
        Login.navigate();
        Login.login("standard_user", "secret_sauce");
        Item.addToBag();
        Cart.openCart();
        Checkout.checkout();
        Checkout.yourInformation();
        Verify.completeOrderWithoutName();
    }
}
