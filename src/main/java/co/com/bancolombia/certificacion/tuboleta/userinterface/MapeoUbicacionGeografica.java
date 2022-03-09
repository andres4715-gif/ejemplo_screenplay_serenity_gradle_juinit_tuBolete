package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;



public class MapeoUbicacionGeografica {

	public static final Target SELECT_PAIS = Target.the("seleccionar pais").locatedBy("//select[@name='ctl00$ctl00$uiBodyMain$uiBodyMain$uiAddressDetails$ddlAddressCountry']//option[@value='CA']");
	public static final Target SELECT_DEPARTAMENTO = Target.the("seleccionar departamento").locatedBy("(//select[@class='borInput'])[2]//option[@value='ON']"); 
	
}
