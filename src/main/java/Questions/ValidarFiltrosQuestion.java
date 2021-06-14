package Questions;

import UI.ListadoDeProductosPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.Locale;

public class ValidarFiltrosQuestion {

    public static Question<String> validarMarca(){
        return actor -> TextContent.of(ListadoDeProductosPage.NOMBREFILTROCELULAR).viewedBy(actor).asString().trim().toUpperCase();
    }

    public static Question<String> validarColor(){
        return actor -> TextContent.of(ListadoDeProductosPage.NOMBREFILTROCOLOR).viewedBy(actor).asString().trim().toUpperCase();
    }

}
