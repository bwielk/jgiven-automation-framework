package ui.browseractions;

import lombok.extern.slf4j.Slf4j;
import ui.waits.Waits;

import static ui.commons.WebElementComponent.getElementByCssSelector;

@Slf4j
public class ElementCheckActions {

    public static void checkTextDisplayed(String cssSelector, String textToCheck){
        log.info(String.format("Looking for element located by: %s with text: %s ",
                cssSelector, textToCheck));
        Waits.waitUntilElementVisible(cssSelector);
        assert getElementByCssSelector(cssSelector).getText().equals(textToCheck);
    }

    public static void checkElementDisplayed(String cssSelector){
        log.info(String.format("Looking for element displayed located by: %s",
                cssSelector));
        Waits.waitUntilElementVisible(cssSelector);
        assert getElementByCssSelector(cssSelector).isDisplayed();
    }
}
