package group.revealed.steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class StepDefinitions {

    private final Base base;
    //Sportsdirect
    @Given("I navigate to Sportsdirect Homepage")
    public void iNavigateToSportsdirectHomepage()
    {
        base.getDriver().get("https://rs.sportsdirect.com/");
    }

    @When("I choose Nike Sale")
    public void iChooseNikeSale() {
        base.getSportsdirectHomepage().chooseNikeSale();
    }

    @Then("relevant products are shown")
    public void relevantProductsAreShown() throws InterruptedException
    {
        base.getSportsdirectNikeSalePage().checkNikeSale();
    }
}
