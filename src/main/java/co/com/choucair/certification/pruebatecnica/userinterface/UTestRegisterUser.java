package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestRegisterUser extends PageObject {

    public static final Target INPUT_FIRST_NAME = Target.the("where the user will enter their name").located(By.className("ng-pristine ng-empty ng-invalid ng-invalid-required ng-valid-pattern ng-valid-minlength ng-touched"));

    public static final Target INPUT_LAST_NAME = Target.the("where the user will enter their last name").located(By.className("ng-pristine ng-empty ng-invalid ng-invalid-required ng-valid-pattern ng-valid-minlength ng-touched"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where the user will enter their email address").located(By.className("ng-pristine ng-empty ng-valid-email ng-invalid ng-invalid-required ng-valid-pattern ng-touched"));

    public static final Target SELECT_MONTH = Target.the("where the user selects their month of birth").located(By.className("ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched"));

    public static final Target SELECT_DAY = Target.the("where the user selects their day of birth").located(By.xpath("//*[@id=\"birthDay\"]"));

    public static final Target SELECT_YEAR = Target.the("where the user selects their year of birth").located(By.className("ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched"));

    public static final Target INPUT_LANGUAGES = Target.the("where the user enters the languages he speaks").located(By.className("ui-select-search input-xs ng-pristine ng-valid ng-empty ng-touched"));

    public static final Target NEXT_BUTTON_LOCATION = Target.the("Where the user will advance to the next form").located(By.className("btn btn-blue"));

    public static final Target INPUT_CITY = Target.the("Where the user enters the city").located(By.xpath("//*[@id=\"city\"]"));

    public static final Target SELECT_REGION = Target.the("Where the user selects the region").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span/span[2]"));

    public static final Target INPUT_POSTAL_CODE = Target.the("Where the user enters the postal code").located(By.xpath("//*[@id=\"zip\"]"));

    public static final Target SELECT_COUNTRY = Target.the("Where the user selects the country ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target NEXT_BUTTON_DEVICES = Target.the("Where the user advances to the next form ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target SELECT_OS_COMPUTER = Target.the("Where the user selects the computer's OS").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span/i"));

    public static final Target SELECT_VERSION = Target.the("Where the user selects OS version").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));

    public static final Target SELECT_LANGUAGE = Target.the("Where the user selects OS language").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span"));

    public static final Target SELECT_MOBILE_DEVICE = Target.the("Where the user selects mobile device ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span/i"));

    public static final Target SELECT_MODEL = Target.the("Where the user selects the mobile device model ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));

    public static final Target SELECT_OS_MOBILE = Target.the("Where the user selects OS of the mobile device ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));

    public static final Target NEXT_BUTTON_LAST_STEP = Target.the("Where the user advances to the next form ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target CREATE_PASSWORD = Target.the("where the user enters a new password").located(By.xpath("//*[@id=\"password\"]"));

    public static final Target CONFIRM_PASSWORD = Target.the("where the user confirms the new password").located(By.xpath("//*[@id=\"confirmPassword\"]"));

    public static final Target CONFIRM_STAY_INFORMED = Target.the("where the user confirms if they want to receive information").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/input"));

    public static final Target CONFIRM_TERMS = Target.the("where the user confirms the terms").located(By.xpath("//*[@id=\"termOfUse\"]"));

    public static final Target CONFIRM_PRIVACY = Target.the("where the user confirms privacy and policies ").located(By.xpath("//*[@id=\"privacySetting\"]"));

    public static final Target FINISH_BUTTON = Target.the("where the user ends the process and registers ").located(By.xpath("//*[@id=\"laddaBtn\"]"));

}
