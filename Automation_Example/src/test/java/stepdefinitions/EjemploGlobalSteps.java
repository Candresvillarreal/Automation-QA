package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AgregarProducto;
import tasks.BuscarProducto;
import userinterfaces.HomePage;

import java.util.List;

public class EjemploGlobalSteps {
    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Global");
    private HomePage homePage = new HomePage();
    private BuscarProducto buscarProducto;
    @Dado("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));

    }

    @Cuando("^el cliente agrega (.*) unidades de (.*) de (.*) al carrito de compras$")
    public void elClienteAgregaUnProductoAlCarritoDeCompras(String cantidad, String descripcion, String tipoCategoria) {
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion, tipoCategoria),
                AgregarProducto.cantidad(cantidad)
        );

    }

    @Entonces("^el cliente ve los productos listados en el carrito de compras$")
    public void elClienteVeLosProductosListadosEnElCarritoDeCompras() {

    }

    @Cuando("^el cliente agrega productos al carrito de compras$")
    public void elClienteAgregaProductosAlCarritoDeCompras(List<String> datos) {

    }
}
