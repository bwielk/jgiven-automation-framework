package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.browseractions;


import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.waits.Waits;

import static com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.commons.WebElementComponent.getElementByCssSelector;

public class ClickableActions {

    public static void clickElement(String cssSelector){
        Waits.waitUntilElementClickable(cssSelector);
        getElementByCssSelector(cssSelector).click();
    }
}
