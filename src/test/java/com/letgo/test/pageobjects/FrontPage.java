package com.letgo.test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FrontPage {

    private static final String FRONT_PAGE_URL = "https://us.letgo.com/en";
    protected WebDriver driver;


    public FrontPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void open() {
        driver.get(FRONT_PAGE_URL);
    }

    public void selectButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-test='update-location-cancel']")));
        //WebElement searchBox = driver.findElement(By.cssSelector("button[data-test='update-location-cancel']"));
        String a = element.getText();
        element.click();

    }

    public void close() {
        driver.quit();
    }
}
