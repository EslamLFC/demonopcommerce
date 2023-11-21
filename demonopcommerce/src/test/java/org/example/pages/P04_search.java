package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;

public class P04_search {


    public WebElement searchFiled() {
        return Hooks.driver.findElement(By.cssSelector("*[name='q']"));
    }

    public void waiting() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("*[class='button-1 newsletter-subscribe-button']")));
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("window.scrollBy(0,300)");
        js.executeScript("arguments[0].scrollIntoView()", Hooks.driver.findElement(By.cssSelector("*[class='button-1 newsletter-subscribe-button']")));

    }

    public void urlAssertion() {
        String actualURl;
        actualURl = Hooks.driver.getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualURl.contains("https://demo.nopcommerce.com/search?q="));
    }

    public void searchResultAssertion() {

        WebElement element;
        List<WebElement> elements1;
        WebElement element1;
        element = Hooks.driver.findElement(By.cssSelector("*[aria-label='Select number of products per page']"));
        Select select = new Select(element);
        select.selectByValue("18");
        elements1 = Hooks.driver.findElements(By.cssSelector("div[class='product-item'] h2[class='product-title']"));
        int count = elements1.size();
        element1 = Hooks.driver.findElement(By.cssSelector("*[id='q']"));
        String expectedResultText = element1.getAttribute("value").toLowerCase();
        String actualResultsText;
        for (int i = 0; i < count; i++) {
            actualResultsText = elements1.get(i).getText().toLowerCase();
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(actualResultsText.contains(expectedResultText));
            System.out.println(actualResultsText);
            System.out.println(expectedResultText);

        }


    }

    public WebElement searchResultProduct(){
       return Hooks.driver.findElement(By.cssSelector("h2[class='product-title'] a"));

    }

    public void skuOfProductAssertion(){
        WebElement element;
        element = Hooks.driver.findElement(By.cssSelector("div[class='sku'] span[class='value']"));
        String actual_sku = element.getText();
        Hooks.driver.navigate().back();
        WebElement element1 = Hooks.driver.findElement(By.cssSelector("*[id='q']"));
        String expected_sku = element1.getAttribute("value");
        Assert.assertEquals(actual_sku,expected_sku);
        System.out.println(actual_sku);
        System.out.println(expected_sku);

    }


}
