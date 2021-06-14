package UI;


import net.serenitybdd.screenplay.targets.Target;

public class CelularesPage {
    public static final Target XIAOMI = Target.the("la marca xiaomi").locatedBy("//*[@id='special']/a/div/div/div[2]/h3[text()[contains(.,'XIAOMI')]]");
}
