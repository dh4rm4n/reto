package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userinterfaces.EmpleosPage.lnkQueEsChoucair;

public class QueesChoucair implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(lnkQueEsChoucair).viewedBy(actor).asString();
    }

    public static QueesChoucair queesChoucair() {
        return new QueesChoucair();
    }
}