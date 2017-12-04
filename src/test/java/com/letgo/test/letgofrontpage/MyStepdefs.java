package com.letgo.test.letgofrontpage;

import com.letgo.test.pageobjects.FrontPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    private WebDriver driver;

    @Before
    public void createDriver() throws IOException {
        driver = ChromeDriverHelper.getDriver();

    }

    @After
    public void quitDriver() {
        ChromeDriverHelper.dispose();
    }


    @Given("^ChromeDriverIsStarted$")
    public void chromedriverisstarted() throws Exception {
        FrontPage frontPage = new FrontPage(driver);
        frontPage.open();

        frontPage.selectButton();
        Thread.sleep(2000);
        frontPage.close();
    }

    @Then("^API returns Hola$")
    public void apiReturnsHola() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
