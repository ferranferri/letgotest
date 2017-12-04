package com.letgo.test.purgomalum;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Step definition and glue code
 */
public class SimpleProfanityDetection extends PurgomalumRESTRequestHelper{

    private String response = "";
    private String addWord = "";

    @Then("^API returns \"([^\"]*)\"$")
    public void api_returns(String expectedResponse){
        Assert.assertEquals(expectedResponse, response);
    }

    @When("^I call containsprofanity method with this \"([^\"]*)\"$")
    public void i_call_method_with_this(String text) throws Exception {
        if (addWord.isEmpty()) {
            response = makeRequestAndProcess("containsprofanity", text);
        } else {
            response = addWordAndmakeRequestAndProcess("containsprofanity", text, addWord);
        }
    }



    @When("^I add \"([^\"]*)\" term to profanitylist$")
    public void iAddTermToProfanitylist(String wordToAdd) {
        addWord = wordToAdd;
    }

}
