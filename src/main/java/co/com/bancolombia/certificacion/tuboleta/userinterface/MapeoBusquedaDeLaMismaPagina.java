package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoBusquedaDeLaMismaPagina {

	public static final Target BUSQUEDA_DATO = Target.the("busqueda de un dato").locatedBy("//*[contains (text(), 'Acerca de Tuboleta.com')]");
	public static final Target TXT_BUSQUEDA_DEL_DATO = Target.the("busqueda de un dato en la pagina ").locatedBy("//*[@value = 'Buscar Eventos, Escenarios o Artistas']");
	

}
