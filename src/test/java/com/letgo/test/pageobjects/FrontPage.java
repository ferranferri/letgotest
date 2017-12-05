package com.letgo.test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public UpdateLocationDialog getUpdateLocationWindow() throws InterruptedException {
        UpdateLocationDialog updateLocationDialog = new UpdateLocationDialog(this.driver);
        return updateLocationDialog;
    }

    public LoginDialog getLoginDialog() {
        LoginDialog loginDialog = new LoginDialog(driver);
        return loginDialog;
    }

    public void close() {
        driver.quit();
    }

    public void clickLoginButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-test='login']")));
        Thread.sleep(500);
        element.click();
    }

    public void makeSearch(String searchTerm) throws InterruptedException {
        Thread.sleep(500);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("searchField")));
        element.sendKeys(searchTerm);
    }
}
