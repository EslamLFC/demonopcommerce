package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class P01_register {
    public WebElement registerlink()
    {
        return  Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement chooseGenderType(){
        return Hooks.driver.findElement(By.cssSelector("div[id='gender'] span[class='male']"));
    }
    public WebElement enterFirstname (){
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement enterLastname (){
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public void dayOfBirth() {
        Select select = new Select(Hooks.driver.findElement(By.cssSelector("*[name='DateOfBirthDay']")));
        select.selectByValue("19");
    }
    public void monthOfBirth (){
        Select select = new Select(Hooks.driver.findElement(By.cssSelector("*[name='DateOfBirthMonth']")));
        select.selectByValue("12");
    }
    public void yearOfBirth (){
        Select select = new Select(Hooks.driver.findElement(By.cssSelector("*[name='DateOfBirthYear']")));
        select.selectByValue("1997");

    }
    public WebElement enterEmail (){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement enterPassword (){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword (){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement clickRegister(){
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public void successAssertion(){
        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualColor;
        actualColor = Hooks.driver.findElement(By.cssSelector("*[class='result']")).getCssValue("color");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualColor,expectedColor);
    }




}

