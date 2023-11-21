package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Set;

public class P07_followUs {

    public WebElement facebookButton(){
        return Hooks.driver.findElement(By.cssSelector("[class='facebook'] a"));
    }
    public WebElement twitterButton(){
        return Hooks.driver.findElement(By.cssSelector("[class='twitter'] a"));
    }
    public WebElement rssButton(){
        return Hooks.driver.findElement(By.cssSelector("[class='rss'] a"));
    }
    public WebElement youtubeButton(){
        return Hooks.driver.findElement(By.cssSelector("[class='youtube'] a"));
    }

    public String actual_url;
    public void getActual_url(){
        Set<String> windowHandles = Hooks.driver.getWindowHandles();
        String firstTab = (String)windowHandles.toArray()[0];
        String secondTab = (String)windowHandles.toArray()[1];
        actual_url = Hooks.driver.switchTo().window(secondTab).getCurrentUrl();
        Hooks.driver.close();

    }

}
