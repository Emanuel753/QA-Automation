package Task;

import UI.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AceptarCookiesTask implements Task {

    public static AceptarCookiesTask con(){
        return Instrumented.instanceOf(AceptarCookiesTask.class).newInstance();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.ACEPTARCOOKIES)
        );
    }
}
