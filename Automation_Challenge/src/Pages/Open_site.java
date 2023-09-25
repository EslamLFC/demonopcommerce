package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Open_site {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eslamgk\\Downloads\\chromedriver v109\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
}
