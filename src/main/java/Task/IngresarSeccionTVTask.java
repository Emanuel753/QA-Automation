package Task;

import UI.HomePage;
import javafx.scene.shape.MoveTo;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.actions.MoveMouseToWebElement;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;

public class IngresarSeccionTVTask implements Task {

    public static IngresarSeccionTVTask con(){
        return Instrumented.instanceOf(IngresarSeccionTVTask.class).newInstance();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.CATEGORIAS),
                MoveMouse.to(HomePage.CATTECNOLOGIA),
                Click.on(HomePage.SECCIONTVS)
        );
    }
}
