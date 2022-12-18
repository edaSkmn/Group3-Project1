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


    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "setUpOne": myElement = setUpOne;break;
            case "parameters": myElement = parameters;break;
            case "setUpTwo" : myElement=setUpTwo;break;
            case "humanResources" : myElement=humanResources;break;

        }

        clickFunction(myElement);
    }
}