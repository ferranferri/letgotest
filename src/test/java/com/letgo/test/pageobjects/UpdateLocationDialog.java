package com.letgo.test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdateLocationDialog {
    WebDriver driver;

    public UpdateLocationDialog(WebDriver driver) {
        this.driver = driver;
    }

    public void stayAtUS() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-test='update-location-cancel']")));
        Thread.sleep(2000);
        element.click();
    }

}

