package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.asserts.SoftAssert;
public class Assertion {

    private static SoftAssert softAssert;
    public static void main(String[] args) {
        WebDriver driver = null;
        WebElement orderCompleteMessage = driver.findElement(By.cssSelector(".complete-header, .complete-text"));
        softAssert.assertEquals(orderCompleteMessage.isDisplayed(),true,"order completed");
    }
}
