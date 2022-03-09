package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoCuadroDeBusquedas {

	public static final Target TXT_BUSQUEDAS = Target.the("diligenciar las busquedas")
			.locatedBy("//input[@name='ctl00_ctl00_uiEventSelector_k']");
	public static final Target VALIDAR_RESULTADOS = Target.the("validar los resultados de la busqueda")
			.locatedBy("//div[@class='pagination clearfix paginationNew']");

}
