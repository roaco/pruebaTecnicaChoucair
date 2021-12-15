package co.com.choucair.certification.pruebatecnica.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestRegisterUser extends PageObject {

    public static final Target INPUT_FIRST_NAME = Target.the("where the user will enter their name").located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("where the user will enter their last name").located(By.id("lastName"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where the user will enter their email address").located(By.id("email"));

    public static final Target SELECT_MONTH = Target.the("where the user selects their month of birth").located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("where the user selects their day of birth").located(By.id("birthDay"));

    public static final Target SELECT_YEAR = Target.the("where the user selects their year of birth").located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGES = Target.the("where the user enters the languages he speaks").located(By.className("ui-select-match"));

    public static final Target NEXT_BUTTON_LOCATION = Target.the("Buttom Next Location").located(By.xpath("//span[text()='Next: Location']"));

    //public static final Target NEXT_BUTTON_LOCATION = Target.the("Buttom Next Location").located(By.xpath("//a[@aria-label='Next step - define your location']"));

    public static final Target INPUT_CITY = Target.the("Where the user enters the city").located(By.id("city"));

    public static final Target INPUT_POSTAL_CODE = Target.the("Where the user enters the postal code").located(By.id("zip"));

    public static final Target SELECT_COUNTRY = Target.the("Where the user selects the country ").located(By.className("ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required auto-detected open"));

    public static final Target NEXT_BUTTON_DEVICES = Target.the("Button devices").located(By.xpath("//a[@aria-label='Next step - select your devices']"));

    public static final Target SELECT_OS_COMPUTER = Target.the("Where the user selects the computer's OS").located(By.xpath("//div[@name='osId']//div[@placeholder]"));

    public static final Target SELECT_VERSION = Target.the("Where the user selects OS version").located(By.xpath("//div[@name='osVersionId']//div[@placeholder]"));

    public static final Target SELECT_LANGUAGE = Target.the("Where the user selects OS language").located(By.xpath("//div[@name='osLanguageId']//div[@placeholder]"));

    public static final Target SELECT_MOBILE_DEVICE = Target.the("Where the user selects mobile device ").located(By.xpath("//div[@name='handsetMakerId']//div[@placeholder]"));

    public static final Target SELECT_MODEL = Target.the("Where the user selects the mobile device model ").located(By.xpath("//div[@name='handsetModelId']//div[@placeholder]"));

    public static final Target SELECT_OS_MOBILE = Target.the("Where the user selects OS of the mobile device ").located(By.xpath("//div[@name='handsetOSId']//div[@placeholder]"));

    public static final Target NEXT_BUTTON_LAST_STEP = Target.the("Button Final Step ").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/i"));

    public static final Target CREATE_PASSWORD = Target.the("where the user enters a new password").located(By.xpath("//*[@id=\"password\"]"));

    public static final Target CONFIRM_PASSWORD = Target.the("where the user confirms the new password").located(By.xpath("//*[@id=\"confirmPassword\"]"));

    public static final Target CONFIRM_STAY_INFORMED = Target.the("where the user confirms if they want to receive information").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CONFIRM_TERMS = Target.the("where the user confirms the terms").located(By.xpath("//*[@id=\"termOfUse\"]"));

    public static final Target CONFIRM_PRIVACY = Target.the("where the user confirms privacy and policies ").located(By.xpath("//*[@id=\"privacySetting\"]"));

    public static final Target FINISH_BUTTON = Target.the("Button Finish").located(By.xpath("//span[text()='Complete Setup']"));

}
