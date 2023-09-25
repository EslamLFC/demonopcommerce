package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Data {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement zipCodeInput = driver.findElement(By.id("postal-code"));

        firstNameInput.sendKeys("LFC");
        lastNameInput.sendKeys("YNWA");
        zipCodeInput.sendKeys("18921");
    }
}
