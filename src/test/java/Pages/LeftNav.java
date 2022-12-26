package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setUpOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath="(//span[text()='Setup'])[2]")
    private WebElement setUpTwo;

    @FindBy(xpath="(//span[text()='Setup'])[3]")
    private WebElement setUpThreeEs;

    @FindBy(xpath="(//span[text()='Fields'])[1]")
    private WebElement fieldsOneHB;

    @FindBy(xpath="//span[text()='Document Types']")
    private WebElement documentTypesHB;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccountsEs;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement attestationsEs;

    @FindBy(xpath="(//span[text()='Setup'])[3]")
    private WebElement setUpThreeN;
    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategoriesN;
    @FindBy(xpath = "(//span[text()='Discounts'])[1]")
    private WebElement discountsN;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;
    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c252-9 ng-star-inserted']")
    private WebElement schoolSetup;
    @FindBy(xpath = "//span[normalize-space()='Departments']")
    private WebElement departments;

    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "setUpOne": myElement = setUpOne;break;
            case "parameters": myElement = parameters;break;
            case "setUpTwo" : myElement=setUpTwo;break;
            case "humanResources" : myElement=humanResources;break;
            case "fieldsOneHB" : myElement=fieldsOneHB;break;
            case "documentTypesHB" : myElement=documentTypesHB;break;
            case "bankAccountsEs" : myElement=bankAccountsEs;break;
            case "attestationsEs" : myElement=attestationsEs;break;
            case "setUpThreeEs" : myElement=setUpThreeEs;break;

            case "setUpThreeN" : myElement=setUpThreeN;break;
            case "positionCategoriesN" : myElement=positionCategoriesN;break;
            case "discountsN" : myElement=discountsN;break;
            case "nationalities" : myElement=nationalities;break;
            case "schoolSetup" : myElement=schoolSetup;break;
            case "departments" : myElement=departments;break;

        }

        clickFunction(myElement);
    }
}