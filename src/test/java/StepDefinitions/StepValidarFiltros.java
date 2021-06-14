package StepDefinitions;

import Navigation.NavigateTo;
import Questions.ValidarFiltrosQuestion;
import Questions.ValidarPrecioQuestion;
import Task.AceptarCookiesTask;
import Task.IngresarMarcaXIAOMITask;
import Task.IngresarSeccionCelularesTask;
import Task.SeleccionarFiltroAzulTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.core.IsEqual.equalTo;

public class StepValidarFiltros {
    @Managed
    WebDriver driver;

    Actor actor = Actor.named("El usuario");

    @Before
    public void prepararActor(){
        actor.can(BrowseTheWeb.with(driver));
        actor.attemptsTo(NavigateTo.theHomePage());
        actor.attemptsTo(AceptarCookiesTask.con());
    }

    @Dado("que el usuario ingresa a la categoria celulares")
    public void que_el_usuario_ingresa_a_la_categoria_celulares() {
        actor.attemptsTo(IngresarSeccionCelularesTask.con());
    }

    @Cuando("selecciona los filtros <Xiaomi> y <Azul>")
    public void selecciona_los_filtros_Xiaomi_y_Azul() {
        actor.attemptsTo(IngresarMarcaXIAOMITask.con());
        actor.attemptsTo(SeleccionarFiltroAzulTask.con());
    }

    @Entonces("se muestran los resultados correctos (.*) (.*)")
    public void se_muestran_los_resultados_correctos(String modelo, String color) {
        actor.should(
                GivenWhenThen.seeThat("valida la marca seleccionada",ValidarFiltrosQuestion.validarMarca(),equalTo(modelo)),
                GivenWhenThen.seeThat("",ValidarFiltrosQuestion.validarColor(),equalTo(color))
        );
    }

}
