package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoSiteWebTable extends PageObject {
    public static final Target TEXTO_TABLAS = Target.the("Texto de encabezado de las tablas")
            .located(By.xpath("//h4[text()=' - Double Click on Edit Icon to ']"));

}
