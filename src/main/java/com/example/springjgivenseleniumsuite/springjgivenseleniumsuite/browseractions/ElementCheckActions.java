package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.browseractions;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.waits.Waits;

import static com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.commons.WebElementComponent.getElementByCssSelector;

public class ElementCheckActions {

    public static void checkTextDisplayed(String cssSelector, String textToCheck){
        Waits.waitUntilElementVisible(cssSelector);
        assert getElementByCssSelector(cssSelector).getText().equals(textToCheck);
    }

    public static void checkElementDisplayed(String cssSelector){
        Waits.waitUntilElementVisible(cssSelector);
        assert getElementByCssSelector(cssSelector).isDisplayed();
    }
}
