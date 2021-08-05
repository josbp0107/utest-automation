package co.com.choucair.signup.utest.questions;

import co.com.choucair.signup.utest.userinterface.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {

    public static Answer value(){
        return new Answer();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String question = "Welcome to the world's largest community of freelance software testers!";
        String welcome = Text.of(WelcomePage.WELCOME_HEADER).viewedBy(actor).asString();
        if(question.equals(welcome)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
