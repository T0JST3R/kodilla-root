package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public final static  String XPATH_FIRSTNAME = "//div[contains(@class , \"mbm _1iy_ _a4y _3-90 lfloat _ohe\")]/div/div/input";
    public final static  String XPATH_LASTNAME = "//div[contains(@class , \"mbm _1iy_ _a4y rfloat _ohf\")]/div/div/input";
    public final static  String XPATH_WAITFOR = "//div[contains(@class , \"fb_content clearfix \")]";
    public final static  String XPATH_MAILORPHONENUM = "//input[contains(@id , \"u_0_q\")]";
    public final static  String XPATH_SELECTORS = "//span[contains(@class , \"_5k_4\")]/span";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);

        driver.get("https://www.facebook.com/");
        while (!driver.findElement(By.xpath(XPATH_WAITFOR)).isDisplayed());

        WebElement firstname = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        WebElement lastname = driver.findElement(By.xpath(XPATH_LASTNAME));
        WebElement mailorphonenum = driver.findElement(By.xpath(XPATH_MAILORPHONENUM));
        WebElement selector1 = driver.findElement(By.xpath(XPATH_SELECTORS + "/select[1]"));
        WebElement selector2 = driver.findElement(By.xpath(XPATH_SELECTORS + "/select[2]"));
        WebElement selector3 = driver.findElement(By.xpath(XPATH_SELECTORS + "/select[3]"));
        Select selectorr1 = new Select(selector1);
        Select selectorr2 = new Select(selector2);
        Select selectorr3 = new Select(selector3);
        firstname.sendKeys("TEST");
        lastname.sendKeys("TEST");
        mailorphonenum.sendKeys("TEST@MAIL.COM");
        selectorr1.selectByIndex(3);
        selectorr2.selectByIndex(12);
        selectorr3.selectByIndex(44);

    }
}
