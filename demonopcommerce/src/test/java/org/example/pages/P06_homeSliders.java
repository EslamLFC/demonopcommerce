package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class P06_homeSliders {
    String expectedUrl1 = "https://demo.nopcommerce.com/iPhone-14-Pro";
    String actualUrl1;
    String expectedUrl2 = "https://demo.nopcommerce.com/Galaxy-S22-Ultra";
    String actualUrl2;
    public WebElement chooseFirstSlider(){
        return Hooks.driver.findElement(By.cssSelector("a[rel='0']"));
    }
    public WebElement firstSlider(){
        return Hooks.driver.findElement(By.cssSelector("div[id='nivo-slider']"));
    }
    public WebElement chooseSecondSlider(){
        return Hooks.driver.findElement(By.cssSelector("a[rel='1']"));
    }
    public WebElement secondSlider(){
        return Hooks.driver.findElement(By.cssSelector("div[id='nivo-slider']"));
    }

    public void waiting(){
        WebElement element = Hooks.driver.findElement(By.cssSelector("button[id='vote-poll-1']"));
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void firstSliderAssertion (){
        waiting();
        actualUrl1 = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl1,expectedUrl1);
    }
    public void secondSliderAssertion(){
        waiting();
        actualUrl2 = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualUrl2,expectedUrl2);
    }


}
