package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
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

    WebElement myElement;
    public void findAndSend(String strElement, String value) {

        switch (strElement) {

            case "username": myElement = username;break;
            case "password": myElement = password;break;

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

        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

            case "txtTechnoStudy": myElement = txtTechnoStudy;break;

        }
        verifyContainsTextFunction(myElement, text);
    }
    public void findAndDelete(String searchText) {

    }
}