package co.com.choucair.certification.pruebatecnica.tasks;

import co.com.choucair.certification.pruebatecnica.model.UTestData;
import co.com.choucair.certification.pruebatecnica.userinterface.UTestJoinTodayPage;
import co.com.choucair.certification.pruebatecnica.userinterface.UTestRegisterUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.security.Key;

public class RegisterUser implements Task {
    UTestData uTestData;

    public RegisterUser(UTestData uTestData) {
        this.uTestData = uTestData;
    }

    public static RegisterUser the(UTestData uTestData) {
        return Tasks.instrumented(RegisterUser.class,uTestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo( Enter.theValue(uTestData.getStrFirstName()).into(UTestRegisterUser.INPUT_FIRST_NAME),
                Enter.theValue(uTestData.getStrLastName()).into(UTestRegisterUser.INPUT_LAST_NAME));
                /*Enter.theValue(strEmailAddress).into(UTestRegisterUser.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(strMonthBirth).from(UTestRegisterUser.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDayBirth).from(UTestRegisterUser.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYearBirth).from(UTestRegisterUser.SELECT_YEAR),
                Click.on(UTestRegisterUser.INPUT_LANGUAGES),
                Click.on(UTestRegisterUser.NEXT_BUTTON_LOCATION),
                Enter.theValue(strInputCity).into(UTestRegisterUser.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UTestRegisterUser.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UTestRegisterUser.INPUT_CITY),
                Enter.theValue(strInputZIP).into(UTestRegisterUser.INPUT_POSTAL_CODE),
                SelectFromOptions.byVisibleText(strInputCountry).from(UTestRegisterUser.SELECT_COUNTRY),
                //Click.on(UTestRegisterUser.SELECT_COUNTRY),
                Click.on(UTestRegisterUser.NEXT_BUTTON_DEVICES),
                Click.on(UTestRegisterUser.SELECT_OS_COMPUTER),
                Click.on(UTestRegisterUser.SELECT_VERSION),
                Click.on(UTestRegisterUser.SELECT_LANGUAGE),
                Click.on(UTestRegisterUser.SELECT_MOBILE_DEVICE),
                Click.on(UTestRegisterUser.SELECT_MODEL),
                Click.on(UTestRegisterUser.SELECT_OS_MOBILE),
                Click.on(UTestRegisterUser.NEXT_BUTTON_LAST_STEP),
                Enter.theValue(strPassword).into(UTestRegisterUser.CREATE_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UTestRegisterUser.CONFIRM_PASSWORD),
                Click.on(UTestRegisterUser.CONFIRM_STAY_INFORMED),
                Click.on(UTestRegisterUser.CONFIRM_TERMS),
                Click.on(UTestRegisterUser.CONFIRM_PRIVACY),
                Click.on(UTestRegisterUser.FINISH_BUTTON));*/
    }
}
