package Task;

import UI.CelularesPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarMarcaXIAOMITask implements Task {
    public static IngresarMarcaXIAOMITask con() {
        return Instrumented.instanceOf(IngresarMarcaXIAOMITask.class).newInstance();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CelularesPage.XIAOMI)
        );
    }
}
