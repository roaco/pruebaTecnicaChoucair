package co.com.choucair.certification.pruebatecnica.questions;

import co.com.choucair.certification.pruebatecnica.tasks.RegisterUser;
import co.com.choucair.certification.pruebatecnica.userinterface.UTestRegisterUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }


    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(UTestRegisterUser.FINISH_BUTTON).viewedBy(actor).asString();
        if(question.equals(nameCourse)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
