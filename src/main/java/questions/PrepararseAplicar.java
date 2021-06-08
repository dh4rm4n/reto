package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static userinterfaces.EmpleosPage.lnkPrepararseAplicar;


public class PrepararseAplicar implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(lnkPrepararseAplicar).viewedBy(actor).asString();
    }

    public static PrepararseAplicar prepararseAplicar() {
        return new PrepararseAplicar();
    }
}