package Task;

import UI.ListadoDeProductosPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class SeleccionarTVTask implements Task {

    public static SeleccionarTVTask con(){
        return Instrumented.instanceOf(SeleccionarTVTask.class).newInstance();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Integer i = ListadoDeProductosPage.LISTADODEPRODUCTOS.waitingForNoMoreThan(Duration.ofSeconds(3)).resolveAllFor(actor).size();
        WebElementFacade ultimoProducto =  ListadoDeProductosPage.LISTADODEPRODUCTOS.resolveAllFor(actor).get(49);

        actor.attemptsTo(
                Click.on(ultimoProducto)
        );


    }
}
