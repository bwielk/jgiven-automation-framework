package com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.springjgivenseleniumsuite.springjgivenseleniumsuite.ui.commons.WebDriverComponent.getDriver;

public class Waits {

    public static void waitUntilElementVisible(String cssSelector){
        new WebDriverWait(getDriver(), 60).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
    }

    public static void waitUntilElementClickable(String cssSelector){
        new WebDriverWait(getDriver(), 60).until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelector)));
    }
}
