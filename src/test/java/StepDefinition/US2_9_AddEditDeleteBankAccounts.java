package StepDefinition;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class US2_9_AddEditDeleteBankAccounts {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("User sends the keys in Bank Accounts")
    public void userSendsTheKeysInBankAccounts(DataTable elemanlar) {
        List<List<String>> listElemanlar = elemanlar.asLists(String.class);
        for (int i = 0; i < listElemanlar.size(); i++)
            dc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1));
    }

    @And("Click on the element in left nav")
    public void clickOnTheElementInLeftNav(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);
        for (String strButtonName : listElemanlar) {
            ln.findAndClick(strButtonName);
        }
    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);
        for (String strButtonName : listElemanlar) {
            dc.findAndClick(strButtonName);
        }
    }

    @And("User search item from Dialog")
    public void userSearchItemFromDialog(DataTable elemanlar) {
        List<List<String>> listElemanlar = elemanlar.asLists(String.class);
        for (int i = 0; i < listElemanlar.size(); i++)
            dc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1));
    }
}
