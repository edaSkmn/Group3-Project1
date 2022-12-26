package StepDefinition;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US8_DepartmentsSteps {
    LeftNav ln = new LeftNav();

    DialogContent dc = new DialogContent();

    @When(": user Fields  name as {string}  Code as {string}")
    public void userFieldsNameAsCodeAs(String name, String code) {

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput_VA", name);
        new Actions(GWD.getDriver()).sendKeys(Keys.TAB).sendKeys(code).perform();
       // dc.findAndSend("codeInputHB", code);
        dc.findAndClick("saveButton");

    }

    @When("User Delete name as {string}")
    public void userDeleteNameAs(String name) {

        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }
}
