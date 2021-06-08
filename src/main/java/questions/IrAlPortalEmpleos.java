package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.CarritoPage.lblResultadoCarrito;


public class IrAlPortalEmpleos implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(lblResultadoCarrito).viewedBy(actor).asString();
    }

    public static IrAlPortalEmpleos irAlPortalEmpleos() {
        return new IrAlPortalEmpleos();
    }
}