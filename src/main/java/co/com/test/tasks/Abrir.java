package co.com.test.tasks;
import co.com.test.userinterface.DemoSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {

    private DemoSitePage demoSitePage;

    public static Abrir LaPaginaDemoSite() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(demoSitePage));

    }
}
