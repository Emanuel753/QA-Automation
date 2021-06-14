package Questions;

import UI.DetalleProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ValidarPrecioQuestion{

    public static Question<String> value(Actor actor) {
        String Precio = DetalleProductoPage.PRECIO.resolveAllFor(actor).get(0).getText().trim().replace(".","");
        return a -> Precio;
    }
}
