package ui.selector;

public class CartPageSelectors {

    public static final String CART_ITEM = "[class=\"cart_item\"]";
    public static final String CART_ITEM_DESCRIPTION = CART_ITEM+"[class=\"inventory_item_desc\"]";
    public static final String CART_ITEM_REMOVE = CART_ITEM+"[data-test=\"remove-sauce-labs-backpack\"]";
    public static final String CART_ITEM_QUANT = CART_ITEM+"[class=\"cart_quantity\"]";
    public static final String CHECKOUT_BUTTON = "button[id=\"checkout\"]";
    public static final String CONTINUE_SHOPPING_BUTTON = "button[data-test=\"continue-shopping\"]";
}
