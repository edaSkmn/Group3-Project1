package StepDefinition;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class US7_10SchoolSetupSteps {
    DialogContent dc = new DialogContent();

    @When(":User Locations  name as {string} short name as {string} capasity as {string}")
    public void userLocationsNameAsShortNameAsCapasityAs(String name, String shortname, String capasity) {
        dc.findAndSend("nameInputHB",name);
        dc.findAndSend("codeInputAT",shortname);
        dc.findAndSend("capasityAT",capasity);

    }

    @When(":User Locations  name as {string} short name as {string} order as {string}")
    public void userLocationsNameAsShortNameAsOrderAs(String name, String shortname, String order) {
        dc.findAndSend("nameInputHB",name);
        dc.findAndSend("codeInputAT",shortname);
        dc.findAndSend("capasityAT",order);
    }
}
