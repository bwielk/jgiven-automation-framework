package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.browseractions;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.waits.Waits;

import static com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.commons.WebElementComponent.getElementByCssSelector;

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
