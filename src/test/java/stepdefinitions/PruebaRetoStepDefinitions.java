package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebDriver;
import tasks.AbrirElBrowser;
import userinterfaces.InicioPage;

public class PruebaRetoStepDefinitions {

    @Managed(driver="chrome")//Definir el drive para la prueba
    private WebDriver browser;

    private Actor julio=Actor.named("Julio");

    @Page
    private InicioPage inicioPage;


    @Before //Lo que ejecuta antes de la prueba
    public void setUP(){
        julio.can(BrowseTheWeb.with(browser));
    }

    @Given("^que el usuario desea ingresar al portal de empleos de choucair$")
    public void InicioPage() {
        julio.wasAbleTo(AbrirElBrowser.on(inicioPage));
    }

    @When("^ingresa a la url de empleos-testing$")
    public void QueesChoucair() {
        julio.attemptsTo(tasks.QueesChoucair.queesChoucair());
    }

    @Then("^el usuario puede visualizar la pagina de empleos$")
        public void PrepararseAplicar() {
            julio.attemptsTo(tasks.PrepararseAplicar.prepararseAplicar());
        }

}