package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.browseractions;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.waits.Waits;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.commons.WebElementComponent.getElementByCssSelector;

public class SelectDropDownActions {

    public static void selectOption(String cssSelectorDropdown, String optionToSelect){
        Waits.waitUntilElementVisible(cssSelectorDropdown);
        WebElement selectDropdown = getElementByCssSelector(cssSelectorDropdown);
        Select select = new Select(selectDropdown);
        select.selectByValue(optionToSelect);
    }
}
