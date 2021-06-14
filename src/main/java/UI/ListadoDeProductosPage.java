package UI;

import net.serenitybdd.screenplay.targets.Target;


public class ListadoDeProductosPage {
    public static final Target ORDENARPOR = Target.the("lista para sellecionar orden").locatedBy("//*[@id='root-app']/div/div[1]/section/div[1]/div/div/div[2]/div[1]/div/div/button");
    public static final Target ORDENARMENORAMAYOR = Target.the("seleccionar ordenar de menor a mayor").locatedBy("//*[@id='root-app']/div/div[1]/section/div[1]/div/div/div[2]/div[1]/div/div/div");
    public static final Target LISTADODEPRODUCTOS = Target.the("listado de productos mostrados").locatedBy("//*[@id='root-app']/div/div/section/ol/li/div/div/div[1]/a/div/div/div/div/div/img");

    public static final Target FILTROAZUL = Target.the("selecciona el filtro azul").locatedBy("//*[@id='root-app']/div/div[1]/aside/section[2]/dl[18]/div/dd[@aria-label='Azul']");

    public static final Target NOMBREFILTROCELULAR = Target.the("obtiene el nombre del celular filtrado").locatedBy("//*[@id='root-app']/div/div[1]/aside/section[1]/a[1]/div/div[1]/div");
    public static final Target NOMBREFILTROCOLOR = Target.the("obtiene el nombre del color filtrado").locatedBy("//*[@id='root-app']/div/div[1]/aside/section[1]/a[2]/div/div[1]/div");
}
