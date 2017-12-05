package com.letgo.test.letgofrontpage;

import com.letgo.test.pageobjects.FrontPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AddUserAndSearchItem {

    private WebDriver driver;
    private FrontPage frontPage;

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



    }

    @Then("^API returns Hola$")
    public void apiReturnsHola() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Chrome Driver Is Started$")
    public void chromeDriverIsStarted() throws Throwable {
        frontPage = new FrontPage(driver);
        frontPage.open();
    }

    @And("^URL \"([^\"]*)\" is loaded$")
    public void urlIsLoaded(String URL) throws Throwable {
        frontPage.open();
    }

    @Then("^Select stay at US$")
    public void selectStayAtUS() throws Throwable {
        frontPage.getUpdateLocationWindow().stayAtUS();





    }

    @And("^Click login$")
    public void clickLogin() throws Throwable {
        frontPage.clickLoginButton();
    }

    @And("^Click Sing Up$")
    public void clickSingUp() throws Throwable {
        frontPage.getLoginDialog().clickSignUpButton();
    }

    @And("^Fill email and password$")
    public void fillEmailAndPassword() throws Throwable {
        Random random = new Random();
        String generatedEmail = "letgouser" + random.nextInt(1000000) + "@mailprovider.com";
        frontPage.getLoginDialog().insertEmail(generatedEmail);
        frontPage.getLoginDialog().insertPassword("12345");
        frontPage.getLoginDialog().clickContinueButton();

        //frontPage.close();
    }

    @And("^Fill Full Name Field$")
    public void fiillFullNameField() throws Throwable {
        frontPage.getLoginDialog().insertFullName("My Full Name");

    }

    @And("^Click Complete button$")
    public void clickCompleteButton() throws Throwable {
        frontPage.getLoginDialog().clickCompleteSignUpButton();
    }

    @And("^Fill a word in search box$")
    public void fillAWordInSearchBox() throws Throwable {
        frontPage.makeSearch("ipad");
    }
}
