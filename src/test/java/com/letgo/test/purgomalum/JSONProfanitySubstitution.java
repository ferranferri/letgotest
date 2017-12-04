package com.letgo.test.purgomalum;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.json.JSONObject;
import org.junit.Assert;

public class JSONProfanitySubstitution extends PurgomalumRESTRequestHelper {

    private String response = "";

    @Then("^\"([^\"]*)\" is returned from API$")
    public void method_json_is_called_with_text(String expected_response) {
        Assert.assertEquals(expected_response, response);
    }


    @When("^Method json is called with text: \"([^\"]*)\"$")
    public void is_returned_from_API(String text)  {
        String jsonResponseString = makeRequestAndProcess("json", text);
        response = processResponse(jsonResponseString);
    }


    @When("^Method json is called with text: \"([^\"]*)\" and added words \"([^\"]*)\"$")
    public void methodJsonIsCalledWithTextAndAddedWords(String text, String words) {
        String jsonResponseString = addWordAndmakeRequestAndProcess("json", text, words);
        response = processResponse(jsonResponseString);
    }

    @When("^Method json is called with text: \"([^\"]*)\" and added words \"([^\"]*)\" and \"([^\"]*)\"$")
    public void methodJsonIsCalledWithTextAndAddedWordsAnd(String text, String words, String replace_char) {
        String jsonResponseString = makeRequestWithFillCharAndProcess("json", text, replace_char, words);
        response = processResponse(jsonResponseString);

    }

    private String processResponse(String jsonREsponse) {
        JSONObject jsonObject = new JSONObject(jsonREsponse);
        if (!jsonObject.has("error")) {
            return jsonObject.getString("result");
        } else {
            Assert.fail("API returned and error: " + jsonObject.getString("error"));
            return "";
        }
    }

    @When("^Method json is called with text: \"([^\"]*)\" and added words \"([^\"]*)\" and only one \"([^\"]*)\"$")
    public void methodJsonIsCalledWithTextAndAddedWordsAndOnlyOne(String text, String words, String replace_word) {
        // Write code here that turns the phrase above into concrete actions
        String jsonResponseString = makeRequestWithCensoredTermAndProcess("json", text, replace_word, words);
        response = processResponse(jsonResponseString);
    }
}
