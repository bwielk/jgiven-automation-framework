package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.pages;

import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.browseractions.ElementCheckActions;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.content.InventoryPageContent;
import com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.selector.InventoryPageSelectors;
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
