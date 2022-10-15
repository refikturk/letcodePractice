package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Letcode_Input {

    public Letcode_Input() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "fullName")
    public WebElement fullName;

    @FindBy(id = "join")
    public WebElement passTextAndPressTab;

    @FindBy(id = "getMe")
    public WebElement getAttribute;

    @FindBy(id = "clearMe")
    public WebElement clearMe;

    @FindBy(id = "noEdit")
    public WebElement isDisabled;

    @FindBy(id = "dontwrite")
    public WebElement isReadOnly;




}
