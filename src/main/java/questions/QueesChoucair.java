package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.ObjectUtils;


public class QueesChoucair implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(lblResultadoCarrito).viewedBy(actor).asString();
    }

    public static QueesChoucair queesChoucair() {
        return new QueesChoucair();
    }
}