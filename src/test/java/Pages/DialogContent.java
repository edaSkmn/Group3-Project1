package Pages;

import Utilities.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css = "span[class='mat-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(css = "button[class='consent-give']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteDialogBtn;

    @FindBy(xpath ="//div[contains(text(),'successfully')]")
    private WebElement successMessageHB;


    @FindBy(xpath ="//div[contains(text(),'already exists')]")
    private WebElement alreadyExistHB;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInputHB;

    @FindBy(xpath ="(//ms-text-field//input)[4]")
    private WebElement codeInputHB;

    @FindBy(xpath ="//ms-add-button//button")
    private WebElement addButtonHB;

    @FindBy(xpath ="(//ms-text-field//input)[1]")
    private WebElement searchNameHB;

    @FindBy(xpath ="(//mat-select/div)[3]/div/span")
    private WebElement stageHB;
    @FindBy(xpath ="//span[text()=' Employment ']")
    private WebElement employmentHB;
    @FindBy(xpath ="(//div[@class='cdk-overlay-pane'])[2]")
    private WebElement certificateHB;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameEs;

    @FindBy(css = "[data-placeholder='IBAN']")
    private WebElement ibanEs;

    @FindBy(xpath = "(//mat-select[@role='combobox']//div//div)[7]")
    private WebElement currencyEs;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[4]")
    private WebElement currencyTRYEs;

    @FindBy(xpath ="//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement integrationCodeEs;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;


    WebElement myElement;
    public void findAndSend(String strElement, String value) {

        switch (strElement) {

            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "nameInputHB": myElement = nameInputHB;break;
            case "codeInputHB": myElement = codeInputHB;break;
            case "searchNameHB": myElement = searchNameHB;break;
            case "nameEs": myElement = nameEs;break;
            case "ibanEs": myElement = ibanEs;break;
            case "integrationCodeEs": myElement = integrationCodeEs;break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        switch (strElement) {

            case "loginButton": myElement = loginButton;break;
            case "addButton": myElement = addButton;break;
            case "acceptCookies": myElement = acceptCookies;break;
            case "searchButton": myElement = searchButton;break;
            case "deleteButton": myElement = deleteButton;break;
            case "deleteDialogBtn": myElement = deleteDialogBtn;break;
            case "saveButton": myElement = saveButton;break;
            case "editButton": myElement = editButton;break;
            case "addButtonHB": myElement = addButtonHB;break;
            case "stageHB": myElement = stageHB;break;
            case "employmentHB": myElement = employmentHB;break;
            case "certificateHB": myElement = certificateHB;break;
            case "currencyEs": myElement = currencyEs;break;
            case "currencyTRYEs": myElement = currencyTRYEs;break;

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

            case "txtTechnoStudy": myElement = txtTechnoStudy;break;
            case "successMessageHB": myElement = successMessageHB;break;
            case "alreadyExistHB": myElement = alreadyExistHB;break;
            case "successMessage": myElement = successMessage;break;


        }
        verifyContainsTextFunction(myElement, text);
    }
    public void findAndDelete(String searchText) {
    }
    public void findAndDeleteHB(String searchName) {

        findAndSend("searchNameHB",searchName);
        findAndClick("searchButton");
        waitUntilLoading();
        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");


    }
    public void findAndEditHB( String name){

        waitUntilLoading();
        findAndClick("editButton");
        waitUntilVisible(nameInputHB);
        nameInputHB.clear();
        findAndSend("nameInputHB",name);
        findAndClick("saveButton");


    }



}