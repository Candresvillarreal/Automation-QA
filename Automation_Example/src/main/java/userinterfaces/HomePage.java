package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://es.aliexpress.com")
public class HomePage extends PageObject {

    public static final Target INPUT_BUSCAR_OBJETO= Target.the("Input donde se realiza la busqueda").located(By.id("search-key"));
    public static final Target SELECT_TIPO_CATEGORIA= Target.the("Selecciona tipo categoria").located(By.id("search-dropdown-box"));
    public static final Target BUTTON_BUSCAR_ARTICULO= Target.the("Boton buscar articulo").located(By.id("search-button"));
    public static final Target BUTTON_CERRAR_VENTANA1= Target.the("Boton cerrar emergente").located(By.id("next-dialog-close"));
    public static final Target BUTTON_CERRAR_VENTANA2= Target.the("Boton cerrar emergente").located(By.id("next-dialog-close"));
    public static final Target LINK_OBJETO_ENCONTRADO= Target.the("Link objeto encontrado").located(By.id("//a[starts-with(@title, '{0}']"));

}
