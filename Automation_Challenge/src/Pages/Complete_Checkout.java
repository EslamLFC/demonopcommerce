package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complete_Checkout {
    public static void main(String[] args) {
        WebDriver driver = null;
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
    }
}
