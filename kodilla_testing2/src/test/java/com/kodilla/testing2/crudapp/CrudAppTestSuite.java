package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class CrudAppTestSuite {
    public final static String BASE_URL = "tojsterr15.github.io";
    public final static String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
    public final static String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
    public final static String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
    WebDriver driver;
    Random generator;

    @Before
    public void testInit() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
        generator = new Random();
    }

    @Test
    public String createCrudAppTestTask() throws InterruptedException {

        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + "content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);
        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement taskButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        taskButton.click();
        Thread.sleep(2000);
        return taskName;
    }

    @Test
    public void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(By.xpath("//form(@class=\"database__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"database__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {

        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
        deleteTaskFromCrudd(taskName);
    }

    private boolean checkTaskExistsInTrello(String taskname) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("BLABLABLALOGIN");
        driverTrello.findElement(By.id("password").).sendKeys("BLABLAPASSWORD");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.click());

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskname))
                .collect(Collectors.toList())
                .size() > 0;
        driverTrello.close();


        return result;
    }

    private void deleteTaskFromCrudd(String taskName) throws InterruptedException {
        driver.navigate().refresh();
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed()) ;

        driver.findElements(By.xpath("//form(@class=\"database_row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"database_field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {

                    WebElement buttonDeleteCard =
                            theForm.findElement(By.xpath("/html/body/main/section[2]/div/form[1]/div/fieldset[1]/button[4]"));
                    buttonDeleteCard.click();
                });
        Thread.sleep(5000);
    }

}

