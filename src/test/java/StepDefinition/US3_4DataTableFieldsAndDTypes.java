package StepDefinition;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US3_4DataTableFieldsAndDTypes {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Click  on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);
        for (String eleman : listElemanlar)
            ln.findAndClick(eleman);
    }

    @And("Click  on the element in the Dialog Content")
    public void clickOnTheElementInTheDialogContent(DataTable elemanlar) {
        List<String> listElemanlar = elemanlar.asList(String.class);
        for (String eleman : listElemanlar)
            dc.findAndClick(eleman);
    }

    @And("User  sending the keys ibn the Dialog Content")
    public void userSendingTheKeysIbnTheDialogContent(DataTable elemanlar) {
        List<List<String>> listElemanlar = elemanlar.asLists(String.class);

        for (int i = 0; i < listElemanlar.size(); i++) {

            dc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1));
        }
    }
}
