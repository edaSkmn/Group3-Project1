package StepDefinition;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class US1and11_DataTableSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();


    @And("Click on the element in the left nav")
    public void clickOnTheElementInTheLeftNav(DataTable elemanlar) {
        List<String> listElemanlar= elemanlar.asList(String.class);

        for(String strButtonName : listElemanlar) {
            //System.out.println("eleman = " + eleman);
            ln.findAndClick(strButtonName);
        }
    }

    @And("Click on the element in the dialog content")
    public void clickOnTheElementInTheDialogContent(DataTable elemanlar) {
        List<String> listElemanlar= elemanlar.asList(String.class);

        for(String strButtonName : listElemanlar)
            dc.findAndClick(strButtonName);
    }


    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elemanlar) {
        List<List<String>> listElemanlar= elemanlar.asLists(String.class);

        for(int i=0;i< listElemanlar.size() ; i++ )
            dc.findAndSend(listElemanlar.get(i).get(0), listElemanlar.get(i).get(1) );

    }


    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elemanlar) {
        List<String> listElemanlar= elemanlar.asList(String.class);

        for(String strButtonName : listElemanlar)
            dc.findAndDeleteN(strButtonName);
    }


    @And("User edit item in the Dialog")
    public void userEditItemInTheDialog(DataTable elemanlar) {

        List<String> listElemanlar= elemanlar.asList(String.class);

        for(String strButtonName : listElemanlar)
            dc.findAndEditN(strButtonName);
    }

}
