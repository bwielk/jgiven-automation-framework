package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.browseractions;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.waits.Waits;

import static com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.commons.WebElementComponent.getElementByCssSelector;

public class TextFieldActions {

    public static void fillTextWithContent(String cssSelector, String textToEnter){
        Waits.waitUntilElementVisible(cssSelector);
        getElementByCssSelector(cssSelector).sendKeys(textToEnter);
    }
}
