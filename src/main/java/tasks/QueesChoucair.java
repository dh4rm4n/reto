package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterfaces.EmpleosPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class QueesChoucair implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(EmpleosPage.lnkQueEsChoucair),
                Click.on(EmpleosPage.lnkPrepararseAplicar),
                Click.on(EmpleosPage.btnIrAlPortalEmpleos)
        );
    }
    public static QueesChoucair queesChoucair(){
        return instrumented(QueesChoucair.class);
    }
}