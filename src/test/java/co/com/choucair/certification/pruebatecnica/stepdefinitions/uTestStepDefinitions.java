package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class uTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Rodrigo wants to register in uTest$")
    public void thanRodrigoWantsToRegisterInUTest() {
        OnStage.theActorCalled("Rodrigo").wasAbleTo(OpenUp.thePage());

    }

    @When("^He clicks on the Join Today button$")
    public void heClicksOnTheJoinTodayButton() {

    }

    @Then("^he opens the registration form$")
    public void heOpensTheRegistrationForm() {

    }

    @Given("^than Rodrigo inserts data in the form$")
    public void thanRodrigoInsertsDataInTheForm() {

    }

    @When("^He starts the record$")
    public void heStartsTheRecord() {

    }

    @Then("^He creates a new user on uTest page$")
    public void heCreatesANewUserOnUTestPage() {

    }

}
