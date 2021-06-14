package ui.browseractions;

import lombok.extern.slf4j.Slf4j;
import ui.waits.Waits;

import static ui.commons.WebElementComponent.getElementByCssSelector;

@Slf4j
public class TextFieldActions {

    public static void fillTextWithContent(String cssSelector, String textToEnter){
        log.info(String.format("Looking for text input of cssSelector: %s", cssSelector));
        Waits.waitUntilElementVisible(cssSelector);
        log.info(String.format("Typing in text %s", textToEnter));
        getElementByCssSelector(cssSelector).sendKeys(textToEnter);
    }
}
