package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class P03_homePage {

    public void selectEuroCurrency() {

        WebElement element;
        element = Hooks.driver.findElement(By.id("customerCurrency"));
        Select select = new Select(element);
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,100)");
        WebElement element2;
        element2 = Hooks.driver.findElement(By.cssSelector("*[class='product-grid home-page-product-grid']"));
        js.executeScript("arguments[0].scrollIntoView()", element2);
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("*[class='product-grid home-page-product-grid']")));

    }

    public void resultsAssertion(){
        List<WebElement> element1 = Hooks.driver.findElements(By.cssSelector("*[class='product-item']"));
        List<WebElement> element2 = Hooks.driver.findElements(By.cssSelector("*[class='price actual-price']"));
        int number;
        int i;
        String actualResult;
        number = element1.size();
        System.out.println(number);
        for (i = 0; i < number; i++ ){
            actualResult = element2.get(i).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("€"));

        }
    }



}
