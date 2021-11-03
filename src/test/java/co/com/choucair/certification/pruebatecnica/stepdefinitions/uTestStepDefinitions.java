package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.model.UTestData;
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

import java.util.List;

public class uTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Rodrigo wants to register in uTest$")
    public void thanRodrigoWantsToRegisterInUTest() throws Exception{
        OnStage.theActorCalled("Rodrigo").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }

    @When("^He clicks on the (.*) button$")
    public void heClicksOnTheJoinTodayButton(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.the(
                uTestData.get(0).getStrFirstName(),
                uTestData.get(0).getStrLastName(),
                uTestData.get(0).getStrEmailAddress(),
                uTestData.get(0).getStrMonthBirth(),
                uTestData.get(0).getStrDayBirth(),
                uTestData.get(0).getStrYearBirth(),
                uTestData.get(0).getStrInputLanguage(),
                uTestData.get(0).getStrInputCity(),
                uTestData.get(0).getStrInputZIP(),
                uTestData.get(0).getStrInputCountry(),
                uTestData.get(0).getStrPassword(),
                uTestData.get(0).getStrConfirmPassword()
        ));

    }

    @Then("^he opens the registration (.*)$")
    public void heOpensTheRegistrationForm(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrFirstName())));
    }

}
