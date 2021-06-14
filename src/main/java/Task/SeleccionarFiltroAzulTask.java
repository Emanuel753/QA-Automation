package Task;

import UI.ListadoDeProductosPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarFiltroAzulTask implements Task {
    public static  SeleccionarFiltroAzulTask con() {
        return Instrumented.instanceOf(SeleccionarFiltroAzulTask.class).newInstance();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ListadoDeProductosPage.FILTROAZUL)
        );
    }
}
