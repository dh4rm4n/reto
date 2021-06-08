package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.EmpleosPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PrepararseAplicar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                Click.on(EmpleosPage.lnkPrepararseAplicar)
        );
    }
    public static PrepararseAplicar prepararseAplicar(){
        return (PrepararseAplicar) instrumented(PrepararseAplicar.class);
    }


}
