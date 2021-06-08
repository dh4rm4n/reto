package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EmpleosPage extends PageObject {

    public static final Target lnkQueEsChoucair = Target.the("Que es Choucair").located(By.xpath("//h3/a[.='¿Qué es ser Choucair?']"));
    public static final Target lnkPrepararseAplicar = Target.the("Prepararse Aplicar").located(By.xpath("//h3/a[.='Prepararse para aplicar']"));
    public static final Target btnIrAlPortalEmpleos = Target.the("PortalEmpleos").located(By.xpath("//*[.='Ir al portal de empleos']"));

}
