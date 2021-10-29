package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestJoinTodayPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to register a new user ").located(By.className("unauthenticated-nav-bar__sign-up"));

   }
