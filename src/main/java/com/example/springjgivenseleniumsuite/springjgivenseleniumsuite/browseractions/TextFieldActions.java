package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.browseractions;


import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.waits.Waits;

import static com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.commons.WebElementComponent.getElementByCssSelector;

public class TextFieldActions {

    public static void fillTextWithContent(String cssSelector, String textToEnter){
        Waits.waitUntilElementVisible(cssSelector);
        getElementByCssSelector(cssSelector).sendKeys(textToEnter);
    }
}
