package UI;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target ACEPTARCOOKIES = Target.the("aceptar cookies").locatedBy("#cookieDisclaimerButton");

    public static final Target CATEGORIAS = Target.the("navbar de Categorias").locatedBy("//a[@href='https://www.mercadolibre.com.ar/categorias#nav-header']");
    public static final Target CATTECNOLOGIA = Target.the("categoria tecnologia").locatedBy("//nav/section[1]/ul[2]");

    public static final Target SECCIONCELULARES = Target.the("ingresa a la categoria celulares").locatedBy("//a[@href='https://www.mercadolibre.com.ar/c/celulares-y-telefonos#menu=categories']");
    public static final Target SECCIONTVS = Target.the("seccion Tvs").locatedBy("//a[@href='https://televisores.mercadolibre.com.ar/televisores/#menu=categories']");
}
