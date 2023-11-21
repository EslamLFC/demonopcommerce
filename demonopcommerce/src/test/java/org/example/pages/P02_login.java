package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class P02_login {

    public WebElement loginLink(){
        return Hooks.driver.findElement(By.cssSelector("*[class='ico-login']"));
    }
    public WebElement enterMail(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement enterPassword(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement clickLoginButton(){
        return Hooks.driver.findElement(By.cssSelector("*[class='button-1 login-button']"));
    }

    public void successfulLoginAssertion(){
        SoftAssert softAssert = new SoftAssert();
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualURL  = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(actualURL,expectedUrl);
        softAssert.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());
        softAssert.assertAll();
    }

    public void unSuccessfulLogin(){
        SoftAssert softAssert = new SoftAssert();
        WebElement element;
        element = Hooks.driver.findElement(By.cssSelector("*[class='message-error validation-summary-errors']"));
        String actualErrorMessage;
        actualErrorMessage = element.getText().toLowerCase();
        softAssert.assertTrue(actualErrorMessage.contains("login was unsuccessful"));
        String actualColor;
        String hexColor;
        String expectedHexColor = "#e4434b";
        actualColor = element.getCssValue("color");
        hexColor = Color.fromString(actualColor).asHex();
        softAssert.assertEquals(hexColor,expectedHexColor);
        softAssert.assertAll();

    }
}
