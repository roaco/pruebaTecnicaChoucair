package co.com.choucair.certification.pruebatecnica.tasks;

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

    private String registeredUser;
    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strMonthBirth;
    private String strDayBirth;
    private String strYearBirth;
    private String strInputLanguage;
    private String strInputCity;
    private String strInputZIP;
    private String strInputCountry;
    private String strPassword;
    private String strConfirmPassword;

    public RegisterUser(String strFirstName, String strLastName, String strEmailAddress, String strMonthBirth, String strDayBirth, String strYearBirth, String strInputLanguage, String strInputCity, String strInputZIP, String strInputCountry, String strPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strMonthBirth = strMonthBirth;
        this.strDayBirth = strDayBirth;
        this.strYearBirth = strYearBirth;
        this.strInputLanguage = strInputLanguage;
        this.strInputCity = strInputCity;
        this.strInputZIP = strInputZIP;
        this.strInputCountry = strInputCountry;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public RegisterUser(String registeredUser) {
        this.registeredUser = registeredUser;
    }

    public static RegisterUser the(String strFirstName, String strLastName, String strEmailAddress, String strMonthBirth, String strDayBirth, String strYearBirth, String strInputLanguage, String strInputCity, String strInputZIP, String strInputCountry, String strPassword, String registeredUser){
        return Tasks.instrumented(RegisterUser.class, registeredUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo( Enter.theValue(strFirstName).into(UTestRegisterUser.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UTestRegisterUser.INPUT_LAST_NAME),
                Enter.theValue(strEmailAddress).into(UTestRegisterUser.INPUT_EMAIL_ADDRESS),
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
                Click.on(UTestRegisterUser.FINISH_BUTTON));
    }
}
