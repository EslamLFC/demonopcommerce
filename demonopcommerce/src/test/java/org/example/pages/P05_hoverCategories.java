package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class P05_hoverCategories {
    Random random = new Random();
    int randomMainCategory = random.nextInt(3);
    List<WebElement> element;
    public void mainCategory(){
        Actions action = new Actions(Hooks.driver);
        element = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li"));
        action.moveToElement(element.get(randomMainCategory)).build().perform();
    }
    int listNumber = randomMainCategory+1;

  public List<WebElement> sub_Category(){
        return Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li["+listNumber+"]/ul/li"));
    }

    String textOfSubCategory;
    String textOfPageTitle;
    int randomSub_Category = random.nextInt(3);
    public void subCategoryText(){
        textOfSubCategory = sub_Category().get(randomSub_Category).getText().toLowerCase().trim();
    }
    public void selectSubCategory(){
        sub_Category().get(randomSub_Category).click();
    }
    public void pageTitleText(){
        WebElement element;
        element = Hooks.driver.findElement(By.cssSelector("div[class='page-title'] h1"));
        textOfPageTitle = element.getText().toLowerCase().trim();
    }
    public void textAssertion(){
        Assert.assertEquals(textOfSubCategory,textOfPageTitle);

    }

    }

