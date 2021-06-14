package ui.browseractions;


import ui.waits.Waits;

import static ui.commons.WebElementComponent.getElementByCssSelector;

public class ClickableActions {

    public static void clickElement(String cssSelector){
        Waits.waitUntilElementClickable(cssSelector);
        getElementByCssSelector(cssSelector).click();
    }
}
