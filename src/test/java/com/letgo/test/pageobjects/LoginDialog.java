package com.letgo.test.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginDialog {
    WebDriver driver;

    public LoginDialog(WebDriver driver) {
        this.driver= driver;
    }

    public void clickSignUpButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/button[1]")));
        element.click();
    }

    public void insertEmail(String email) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
        element.sendKeys(email);
    }

    public void insertPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        element.sendKeys(password);
    }

    public void insertFullName(String name) throws InterruptedException {
        Thread.sleep(500);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("name")));
        element.sendKeys(name);
    }

    public void clickContinueButton() throws InterruptedException {
        Thread.sleep(500);
        WebElement element = driver.findElement(By.cssSelector("button[data-test='login-email-submit']"));
        element.click();
    }

    public void clickCompleteSignUpButton() throws InterruptedException {
        Thread.sleep(500);
        WebElement element = driver.findElement(By.cssSelector("button[data-test='login-email-submit']"));
        element.click();
    }

}
