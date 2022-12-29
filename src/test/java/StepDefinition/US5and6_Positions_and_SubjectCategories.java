package StepDefinition;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class US5and6_Positions_and_SubjectCategories {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();



    @And("User  should edit item in the name Dialog")
    public void userShouldEditItemInTheNameDialog(DataTable elemanlar) {
        List<String> listElemanlar= elemanlar.asList(String.class);

        for(String strButtonName : listElemanlar)
            dc.findAndEditnameF(strButtonName);
    }

    @And("User  should edit item in the shortName Dialog")
    public void userShouldEditItemInTheShortNameDialog(DataTable elemanlar) {
        List<String> listElemanlar= elemanlar.asList(String.class);

        for(String strButtonName : listElemanlar)
    dc.findAndEditshortnameF(strButtonName);
    }

    @And("User delete items from Dialog")
    public void userDeleteItemsFromDialog(DataTable elemanlar) {
        List<String> listElemanlar= elemanlar.asList(String.class);

        for(String strButtonName : listElemanlar)
            dc.findAndDeleteF(strButtonName);
    }

    @And("User  should edit item in the code Dialog")
    public void userShouldEditItemInTheCodeDialog(DataTable elemanlar) {
        List<String> listElemanlar= elemanlar.asList(String.class);

        for(String strButtonName : listElemanlar)
            dc.findAndEditCodeF(strButtonName);
    }
}
