package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import Pages.*;


public class Scenario {



    @Test
    public void steps(){

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eslamgk\\Downloads\\chromedriver v109\\chromedriver.exe");
        driver.get("https://www.saucedemo.com/");

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginbutton = driver.findElement(By.cssSelector(".submit-button"));

        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginbutton.click();

        driver.findElement(By.xpath("//*[@id='header_container']/div[2]/div/span/select/option[3]")).click();
        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']")).click();

        driver.findElement(By.cssSelector(".shopping_cart_link")).click();

        driver.findElement(By.id("checkout")).click();

        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement zipCodeInput = driver.findElement(By.id("postal-code"));

        firstNameInput.sendKeys("LFC");
        lastNameInput.sendKeys("YNWA");
        zipCodeInput.sendKeys("18921");

        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        WebElement orderCompleteMessage = driver.findElement(By.cssSelector(".complete-header, .complete-text"));
        if (orderCompleteMessage.isDisplayed()) {
            System.out.println("Order completed successfully!");
        } else {
            System.out.println("Order completion failed!");
        }


    }

}
