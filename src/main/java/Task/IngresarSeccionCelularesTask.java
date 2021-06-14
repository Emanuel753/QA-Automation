package Task;

import UI.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class IngresarSeccionCelularesTask implements Task {
    public static IngresarSeccionCelularesTask con(){
        return Instrumented.instanceOf(IngresarSeccionCelularesTask.class).newInstance();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(HomePage.CATEGORIAS),
                MoveMouse.to(HomePage.CATTECNOLOGIA),
                Click.on(HomePage.SECCIONCELULARES)
        );
    }
}
