package co.com.test.interactions;


import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

//import static co.com.proyectobase.screenplay.util.LimpiarString.LimpiarCadena;

public class SeleccionarLista implements Interaction {


    private Target lista;
    private String opcion;
    private String cadena;


    public SeleccionarLista(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //List<WebElement> listObjeto = lista.resolveFor(actor).findElements(By.xpath("//*[@id='countries']//child::option"));
        List<WebElement> listObjeto = lista.resolveFor(actor).findElements(By.xpath("//option"));


        for (int i = 0; i < listObjeto.size(); i++) {

            if (listObjeto.get(i).getAttribute("value").equals(opcion)) {
                listObjeto.get(i).click();
                break;
            }
        }
    }

    public static SeleccionarLista Desde(Target lista, String opcion) {
        return new SeleccionarLista(lista, opcion);
    }

}
