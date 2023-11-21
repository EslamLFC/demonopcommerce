package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class P08_wishList {
    public WebElement wishlistButton(){
        return Hooks.driver.findElement(By.cssSelector("div[data-productid='18'] button[title='Add to wishlist']"));
    }
    public WebElement wish_list_tab(){
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    WebElement success_message;
    public void successMessageAssertion(){
        success_message = Hooks.driver.findElement(By.cssSelector("div[class='bar-notification success']"));
        String expected_color = "rgba(75, 176, 122, 1)";
        String actual_color = success_message.getCssValue("background-color");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(success_message.isDisplayed());
        softAssert.assertEquals(actual_color,expected_color);
    }
    WebElement closeButton;

    public void wishList_tab(){
        closeButton = Hooks.driver.findElement(By.cssSelector("span[class='close']"));
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(closeButton));
        wish_list_tab().click();
    }
    public void wishlistQuantity(){
        WebElement element;
        int quantity;
        element = Hooks.driver.findElement(By.cssSelector("td[class='quantity'] input"));
        quantity = Integer.parseInt(element.getAttribute("value"));
        Assert.assertTrue(quantity > 0);
    }


}
