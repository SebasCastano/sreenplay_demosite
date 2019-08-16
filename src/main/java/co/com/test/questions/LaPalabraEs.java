package co.com.test.questions;

import co.com.test.userinterface.DemoSiteWebTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaPalabraEs implements Question<String> {

    public static Question es() {
        return new LaPalabraEs();
    }

    @Override
    public String answeredBy(Actor actor) {
        String palabra = Text.of(DemoSiteWebTable.TEXTO_TABLAS).viewedBy(actor).asString();
        return palabra;
    }
}
