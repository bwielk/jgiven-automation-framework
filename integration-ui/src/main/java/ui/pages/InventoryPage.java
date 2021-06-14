package ui.pages;

import ui.browseractions.ElementCheckActions;
import ui.content.InventoryPageContent;
import ui.selector.InventoryPageSelectors;
import org.springframework.stereotype.Component;

@Component
public class InventoryPage {

    public InventoryPage checkCartButtonIsVisible(){
        ElementCheckActions.checkElementDisplayed(InventoryPageSelectors.CART_CONTAINER);
        return this;
    }

    public InventoryPage checkHeaderIsDisplayed(){
        ElementCheckActions.checkTextDisplayed(InventoryPageSelectors.PAGE_TITLE, InventoryPageContent.INVENTORY_HEADER);
        return this;
    }
}
