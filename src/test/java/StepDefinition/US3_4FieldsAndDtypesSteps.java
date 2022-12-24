package StepDefinition;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class US3_4FieldsAndDtypesSteps {

    LeftNav ln = new LeftNav();

    DialogContent dc = new DialogContent();


    @When(": User Fields  name as {string}  Code as {string}")
    public void userFieldsNameAsCodeAs(String name, String code) {

             dc.findAndClick("addButtonHB");
            dc.findAndSend("nameInputHB",name);
            dc.findAndSend("codeInputHB",code);
           dc.findAndClick("saveButton");
    }

    @Then("Success Message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessageHB", "success");
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dc.findAndContainsText("alreadyExistHB", "already");

    }


    @When("user delete name as {string}")
    public void userDeleteNameAs(String name) {
        dc.findAndDeleteHB(name);
    }


    @When(": User Fields  name as {string}  as Edit")
    public void userFieldsNameAsAsEdit(String name) {
        dc.findAndEditHB(name);
    }


    @When(":User Document types  name as {string} as add")
    public void userDocumentTypesNameAsAsAdd(String name) {

        dc.findAndClick("addButtonHB");
        dc.findAndSend("nameInputHB",name);
        dc.findAndClick("stageHB");
        dc.findAndClick("employmentHB");
        dc.findAndClick("certificateHB");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
        dc.findAndClick("saveButton");

  }
}
