package UI;

import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class DetalleProductoPage {
    public static final Target PRECIO = Target.the("precio del TV").locatedBy("//div[@class='ui-pdp-price__second-line']//span[@class='price-tag-fraction']");
}
