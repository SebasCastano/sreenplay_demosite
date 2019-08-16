package co.com.test.stepdefinitions;
import co.com.test.model.DemoSiteData;
import co.com.test.questions.LaPalabraEs;
import co.com.test.tasks.Abrir;
import co.com.test.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class DemoSiteStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver driverChrome;
    private Actor carlos = Actor.named("Carlos");


    @Before
    public void configuracionInicial(){
        carlos.can(BrowseTheWeb.with(driverChrome));
    }

    @Given("^que Carlos quiere acceder a Demo Site$")
    public void queCarlosQuiereAccederADemoSite() throws Exception {
        carlos.wasAbleTo(Abrir.LaPaginaDemoSite());
    }

    @When("^el se registra en la página$")
    public void elSeRegistraEnLaPagina(List<DemoSiteData> demoSiteData) {
        carlos.attemptsTo(Registrar.DatosPersonales(demoSiteData));
    }

    @Then("^el verifica que se carga la pantalla con texto$")
    public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow(List<DemoSiteData> demoSiteData) throws Exception {
        carlos.should(seeThat(LaPalabraEs.es(), equalToIgnoringCase(demoSiteData.get(0).getTexto_validar())));
    }
}
