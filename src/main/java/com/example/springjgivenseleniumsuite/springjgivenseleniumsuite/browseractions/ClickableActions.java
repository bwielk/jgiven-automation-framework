package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.browseractions;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.waits.Waits;

import static com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.commons.WebElementComponent.getElementByCssSelector;

public class ClickableActions {

    public static void clickElement(String cssSelector){
        Waits.waitUntilElementClickable(cssSelector);
        getElementByCssSelector(cssSelector).click();
    }
}
