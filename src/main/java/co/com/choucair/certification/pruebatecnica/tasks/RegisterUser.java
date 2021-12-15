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
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

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
                Enter.theValue(uTestData.getStrLastName()).into(UTestRegisterUser.INPUT_LAST_NAME),
                Enter.theValue(uTestData.getStrEmailAddress()).into(UTestRegisterUser.INPUT_EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(uTestData.getStrMonthBirth()).from(UTestRegisterUser.SELECT_MONTH),
                SelectFromOptions.byVisibleText(uTestData.getStrDayBirth()).from(UTestRegisterUser.SELECT_DAY),
                SelectFromOptions.byVisibleText(uTestData.getStrYearBirth()).from(UTestRegisterUser.SELECT_YEAR),
                Click.on(UTestRegisterUser.INPUT_LANGUAGES),
                //WaitUntil.the(UTestRegisterUser.NEXT_BUTTON_LOCATION, isEnabled()),
                WaitUntil.the(UTestRegisterUser.NEXT_BUTTON_LOCATION,
                            isCurrentlyEnabled()).forNoMoreThan(20).seconds(),
                Click.on(UTestRegisterUser.NEXT_BUTTON_LOCATION),
                WaitUntil.the(UTestRegisterUser.INPUT_CITY,
                                isCurrentlyEnabled()).forNoMoreThan(15).seconds(),
                Enter.theValue(uTestData.getStrInputCity()).into(UTestRegisterUser.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UTestRegisterUser.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UTestRegisterUser.INPUT_CITY),
                WaitUntil.the(UTestRegisterUser.INPUT_POSTAL_CODE,
                                isCurrentlyEnabled()).forNoMoreThan(15).seconds(),
                Enter.theValue(uTestData.getStrInputZIP()).into(UTestRegisterUser.INPUT_POSTAL_CODE),

                Click.on(UTestRegisterUser.NEXT_BUTTON_DEVICES),
                Click.on(UTestRegisterUser.SELECT_OS_COMPUTER),
                Click.on(UTestRegisterUser.SELECT_VERSION),
                Click.on(UTestRegisterUser.SELECT_LANGUAGE),
                Click.on(UTestRegisterUser.SELECT_MOBILE_DEVICE),
                Click.on(UTestRegisterUser.SELECT_MODEL),
                Click.on(UTestRegisterUser.SELECT_OS_MOBILE),
                Click.on(UTestRegisterUser.NEXT_BUTTON_LAST_STEP),

                Enter.theValue(uTestData.getStrPassword()).into(UTestRegisterUser.CREATE_PASSWORD),
                Enter.theValue(uTestData.getStrConfirmPassword()).into(UTestRegisterUser.CONFIRM_PASSWORD),

                Click.on(UTestRegisterUser.CONFIRM_STAY_INFORMED),
                Click.on(UTestRegisterUser.CONFIRM_TERMS),
                Click.on(UTestRegisterUser.CONFIRM_PRIVACY),
                WaitUntil.the(UTestRegisterUser.FINISH_BUTTON,
                            isCurrentlyEnabled()).forNoMoreThan(40).seconds(),
                Click.on(UTestRegisterUser.FINISH_BUTTON));
    }
}
