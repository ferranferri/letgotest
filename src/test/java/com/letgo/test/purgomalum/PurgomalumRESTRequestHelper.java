package com.letgo.test.purgomalum;

import com.letgo.test.utils.RESTRequestHelper;

/**
 * Helps test purgomalum API
 */
class PurgomalumRESTRequestHelper extends RESTRequestHelper {

    private static final String BASE_URL = "www.purgomalum.com";

    PurgomalumRESTRequestHelper() {
        super(BASE_URL);
    }

    String makeRequestWithFillCharAndProcess(String method, String textToCheck, String censoredChar)  {
        return makeRequestURIAndProcess(method, "text=" + textToCheck + "&fill_char=" + censoredChar);
    }

    String makeRequestWithFillCharAndProcess(String method, String textToCheck, String censoredChar, String wordsToAdd)  {
        return makeRequestURIAndProcess(method, "text=" + textToCheck + "&fill_char=" + censoredChar + "&add=" + wordsToAdd);
    }

    String makeRequestWithCensoredTermAndProcess(String method, String textToCheck, String censoredTerm)  {
        return makeRequestURIAndProcess(method, "text=" + textToCheck + "&fill_text=" + censoredTerm);
    }

    String makeRequestWithCensoredTermAndProcess(String method, String textToCheck, String censoredTerm, String wordsToAdd) {
        return makeRequestURIAndProcess(method, "text=" + textToCheck + "&fill_text=" + censoredTerm + "&add=" + wordsToAdd);
    }

    String addWordAndmakeRequestAndProcess(String method, String textToCheck, String wordsToAdd) {
        return makeRequestURIAndProcess(method, "text=" + textToCheck + "&add=" + wordsToAdd);
    }

    String makeRequestAndProcess(String method, String textToCheck)  {
        textToCheck = textToCheck.replace(" ", "%20");
        return makeRequestURIAndProcess(method, "text=" + textToCheck);
    }
}
