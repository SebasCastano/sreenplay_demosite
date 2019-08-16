package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class DemoSitePage extends PageObject {
    public static final Target FIRST_NAME = Target.the("Input de nombre")
            .located(By.xpath("//input[@ng-model='FirstName']"));
    public static final Target LAST_NAME = Target.the("Input de apellido")
            .located(By.xpath("//input[@ng-model='LastName']"));
    public static final Target ADRESS = Target.the("text área de dirección")
            .located(By.xpath("//textArea[@ng-model='Adress']"));
    public static final Target EMAIL = Target.the("input de email")
            .located(By.xpath("//input[@ng-model='EmailAdress']"));
    public static final Target PHONE = Target.the("input de telefono")
            .located(By.xpath("//input[@ng-model= 'Phone']"));
    public static final Target RADIO_MALE = Target.the("input de telefono")
            .located(By.xpath("//input[@value= 'Male']"));
//    public static final Target RADIO_FEMALE = Target.the("input de telefono")
//            .located(By.xpath("//input[@ng-model= 'Phone']"));
    public static final Target COUNTRY = Target.the("Select de paises")
            .located(By.id("countries"));
    public static final Target SUBMIT_BTN= Target.the("Botón de submit")
            .located(By.id("submitbtn"));
    public static final Target YEAR_DATE= Target.the("Select año fecha")
            .located(By.id("yearbox"));
    public static final Target MONTH_DATE= Target.the("Select mes fecha")
            .located(By.xpath("//*[@ng-model='monthbox']"));
    public static final Target DAY_DATE= Target.the("Select dia fecha")
            .located(By.id("daybox"));
    public static final Target PASSWORD= Target.the("input de telefono")
            .located(By.xpath("//*[@ng-model='Password']"));
    public static final Target COMFIRM_PASSWORD= Target.the("input de telefono")
            .located(By.xpath("//*[@ng-model='CPassword']"));

}
