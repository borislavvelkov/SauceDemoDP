package saucedemo.com.frontend.negative;

import org.testng.annotations.Test;
import saucedemo.com.frontend.BaseTest;
import saucedemo.com.frontend.components.cart.Cart;
import saucedemo.com.frontend.errormessages.AuthenticationErrorMessage;
import saucedemo.com.frontend.utils.Item;
import saucedemo.com.pages.frontend.Login;
import saucedemo.com.utils.Checkout;

public class LoginTests extends BaseTest {

    @Test
    public void loggingWithInvalidUserName() {
        Login.navigate();
        Login.login("notstandartuser", "secret_sauce");
        AuthenticationErrorMessage.
                verifyAuthenticationErrorMessage
                        ( "expectedErrorMessageText", "messageOnFailure");
    }
    @Test
    public void checkingoutWithoutName() {
        Login.navigate();
        Login.login("standard_user", "secret_sauce");
        Item.addToBag();
        Cart.openCart();
        Checkout.checkout();
        Checkout.checkoutWithoutName();
    }
}

