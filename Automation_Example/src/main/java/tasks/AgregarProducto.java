package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducto implements Task {

    private String cantidad;
    public AgregarProducto(String cantidad){
        this.cantidad = cantidad;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(),     //Seleccionar color
                Enter.theValue(cantidad).into(),
                Click.on(),     //Seleccionar ir a la cesta
                Click.on()    //Seleccionar ver la cesta
        );

    }

    public static AgregarProducto cantidad(String cantidad){
        return instrumented(AgregarProducto.class, cantidad);
    }
}
