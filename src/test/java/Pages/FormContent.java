package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {

        }
        clickFunction(myElement);
    }
    public void findAndSend(String strElement, String value) {

        switch (strElement) {

        }
        sendKeysFunction(myElement,value);
    }
}