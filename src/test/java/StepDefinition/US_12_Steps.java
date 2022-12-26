package StepDefinition;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_12_Steps {
    LeftNav ln = new LeftNav();

    DialogContent dc = new DialogContent();

    @When(":User Nationalities name as {string} as add")
    public void userNationalitiesNameAsAsAdd(String name) {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput_VA", name);
        dc.findAndClick("saveButton");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage_VA", "success");
    }

    @When(": User Fields  name as {string}  as Edit Nationalities")
    public void userFieldsNameAsAsEditNationalities(String name) {
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput_VA", name);
        dc.findAndClick("saveButton");
    }

    @When("User delete name as {string}")
    public void userDeleteNameAs(String name) {
        dc.findAndSend("searchInput_VA", name);
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }


}

