package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_lowest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//*[@id='header_container']/div[2]/div/span/select/option[3]")).click();
        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']")).click();
    }
}
