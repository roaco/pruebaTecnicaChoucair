package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.questions.Answer;
import co.com.choucair.certification.pruebatecnica.tasks.Login;
import co.com.choucair.certification.pruebatecnica.tasks.OpenUp;
import co.com.choucair.certification.pruebatecnica.tasks.RegisterUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class uTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Rodrigo wants to register in uTest$")
    public void thanRodrigoWantsToRegisterInUTest() {
        OnStage.theActorCalled("Rodrigo").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }

    @When("^He clicks on the Join Today button$")
    public void heClicksOnTheJoinTodayButton(String registeredUser) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.the(registeredUser));

    }

    @Then("^he opens the registration form$")
    public void heOpensTheRegistrationForm(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
