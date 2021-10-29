package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.userinterface.UTestJoinTodayPage;
import co.com.choucair.certification.pruebatecnica.userinterface.UTestRegisterUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterUser implements Task {

    private String registeredUser;


    public RegisterUser(String registeredUser) {
        this.registeredUser = registeredUser;
    }

    public static RegisterUser the(String registeredUser){
        return Tasks.instrumented(RegisterUser.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo( Enter.theValue("enterYourName").into(UTestRegisterUser.INPUT_FIRST_NAME),
                Enter.theValue("enterYourLastName").into(UTestRegisterUser.INPUT_LAST_NAME),
                Enter.theValue("enterYourEmail").into(UTestRegisterUser.INPUT_EMAIL_ADDRESS),
                Click.on(UTestRegisterUser.SELECT_MONTH),
                Click.on(UTestRegisterUser.SELECT_DAY),
                Click.on(UTestRegisterUser.SELECT_YEAR),
                Click.on(UTestRegisterUser.INPUT_LANGUAGES),
                Click.on(UTestRegisterUser.NEXT_BUTTON_LOCATION),
                Enter.theValue("enterYourCity").into(UTestRegisterUser.INPUT_CITY),
                Enter.theValue("enterPostalCode").into(UTestRegisterUser.INPUT_POSTAL_CODE),
                Click.on(UTestRegisterUser.SELECT_COUNTRY),
                Click.on(UTestRegisterUser.NEXT_BUTTON_DEVICES),
                Click.on(UTestRegisterUser.SELECT_OS_COMPUTER),
                Click.on(UTestRegisterUser.SELECT_VERSION),
                Click.on(UTestRegisterUser.SELECT_LANGUAGE),
                Click.on(UTestRegisterUser.SELECT_MOBILE_DEVICE),
                Click.on(UTestRegisterUser.SELECT_MODEL),
                Click.on(UTestRegisterUser.SELECT_OS_MOBILE),
                Click.on(UTestRegisterUser.NEXT_BUTTON_LAST_STEP),
                Enter.theValue("enterPassword").into(UTestRegisterUser.CREATE_PASSWORD),
                Enter.theValue("enterConfirmPassword").into(UTestRegisterUser.CONFIRM_PASSWORD),
                Click.on(UTestRegisterUser.CONFIRM_STAY_INFORMED),
                Click.on(UTestRegisterUser.CONFIRM_TERMS),
                Click.on(UTestRegisterUser.CONFIRM_PRIVACY),
                Click.on(UTestRegisterUser.FINISH_BUTTON));
    }
}
