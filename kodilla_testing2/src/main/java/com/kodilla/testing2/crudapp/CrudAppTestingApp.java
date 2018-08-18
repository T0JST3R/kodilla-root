package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CrudAppTestingApp {
    public static String XPATH_INPUT = "/html/body/main/section[1]/form/fieldset[1]/input";
    public static String XPATH_TEXTAREA = "/html/body/main/section[1]/form/fieldset[2]/textarea";
    public static String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_SELECT = "//div[contains(@class , \"task-container\")]/form/div/fieldset/select[1]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://tojsterr15.github.io/");

        WebElement element = driver.findElement(By.xpath(XPATH_INPUT));
        element.sendKeys("New Robotic Task");
        WebElement content = driver.findElement(By.xpath(XPATH_TEXTAREA));
        content.sendKeys("New Robotic Content");
        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());
        WebElement select = driver.findElement(By.xpath(XPATH_SELECT));
        Select select1 = new Select(select);
        select1.selectByIndex(1);
    }
}
