package co.com.test.tasks;

import co.com.test.interactions.SeleccionarLista;
import co.com.test.model.DemoSiteData;
import co.com.test.userinterface.DemoSitePage;
import co.com.test.userinterface.DemoSiteWebTable;
import cucumber.api.java.hu.De;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Registrar implements Task {
    private List<DemoSiteData> demoSiteData;

    public Registrar(List<DemoSiteData> demoSiteData) {
        this.demoSiteData = demoSiteData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(DemoSitePage.FIRST_NAME,isVisible()).forNoMoreThan(15).seconds());//Espera
        actor.attemptsTo(Enter.theValue(demoSiteData.get(0).getFirst_name()).into(DemoSitePage.FIRST_NAME));
        actor.attemptsTo(Enter.theValue(demoSiteData.get(0).getLast_name()).into(DemoSitePage.LAST_NAME));
        actor.attemptsTo(Enter.theValue(demoSiteData.get(0).getAdress()).into(DemoSitePage.ADRESS));
        actor.attemptsTo(Enter.theValue(demoSiteData.get(0).getEmail()).into(DemoSitePage.EMAIL));
        actor.attemptsTo(Enter.theValue(demoSiteData.get(0).getPhone()).into(DemoSitePage.PHONE));
        actor.attemptsTo(Click.on(DemoSitePage.RADIO_MALE));
        actor.attemptsTo(SeleccionarLista.Desde(DemoSitePage.COUNTRY, demoSiteData.get(0).getCountry()));
        actor.attemptsTo(SeleccionarLista.Desde(DemoSitePage.YEAR_DATE, demoSiteData.get(0).getAnio_fecha()));
        actor.attemptsTo(SeleccionarLista.Desde(DemoSitePage.MONTH_DATE, demoSiteData.get(0).getMes_fecha()));
        actor.attemptsTo(SeleccionarLista.Desde(DemoSitePage.DAY_DATE, demoSiteData.get(0).getDia_fecha()));
        actor.attemptsTo(Enter.theValue(demoSiteData.get(0).getPassword()).into(DemoSitePage.PASSWORD));
        actor.attemptsTo(Enter.theValue(demoSiteData.get(0).getPassword()).into(DemoSitePage.COMFIRM_PASSWORD));
        actor.attemptsTo(Click.on(DemoSitePage.SUBMIT_BTN));
    }


    public static Performable DatosPersonales(List<DemoSiteData> demoSiteData) {
        return Tasks.instrumented(Registrar.class, demoSiteData);

    }

}
