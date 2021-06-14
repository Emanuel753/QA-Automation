package StepDefinitions;

import Navigation.NavigateTo;
import Questions.ValidarPrecioQuestion;
import Task.AceptarCookiesTask;
import Task.IngresarSeccionTVTask;
import Task.OrdenarDeMenorAMayorTask;
import Task.SeleccionarTVTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.core.IsEqual.equalTo;
import org.openqa.selenium.WebDriver;

public class StepCompararPrecio {
    @Managed(driver = "chrome")
    WebDriver driver;

    Actor actor = Actor.named("El usuario");

    @Before
    public void prepararActor(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Dado("el usuario ingresa a la home")
    public void el_usuario_ingresa_a_la_home() {
        actor.attemptsTo(NavigateTo.theHomePage());
        actor.attemptsTo(AceptarCookiesTask.con());
    }

    @Cuando("ingresa a la seccion de televisores")
    public void ingresa_a_la_seccion_de_televisores() {
        actor.attemptsTo(IngresarSeccionTVTask.con());
    }

    @Cuando("ingresa al ultimo articulo de la lista")
    public void ingresa_al_ultimo_articulo_de_la_lista() throws InterruptedException {
        actor.attemptsTo(OrdenarDeMenorAMayorTask.con());
        Thread.sleep(4000);
        actor.attemptsTo(SeleccionarTVTask.con());
    }

    @Entonces("se muestra el siguiente precio (.*)")
    public void se_muestra_el_siguiente_precio(String precioEsperado){
        actor.should(
                GivenWhenThen.seeThat("Valido el precio mostrado", ValidarPrecioQuestion.value(actor), equalTo(precioEsperado))
        );
    }

}
