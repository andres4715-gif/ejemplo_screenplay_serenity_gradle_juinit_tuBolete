package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoInicioRegistro {
	
	public static final Target TXT_CORREO_ELECTRONICO = Target.the("diligenciar correo")
			.locatedBy("(//input[@class='inputLarge borInput'])[1]");
	public static final Target TXT_CONTRASENIA = Target.the("diligenciar contrasenia")
			.locatedBy("(//input[@class='inputLarge borInput'])[2]");
	public static final Target TXT_CONFIRMAR_CONTRASENIA = Target.the("diligenciar confirmar contrasenia")
			.locatedBy("(//input[@class='inputLarge borInput'])[3]");
	public static final Target TXT_NUMERO_IDENTIFICACION = Target.the("diligenciar numero identificacion")
			.locatedBy("(//*[@class='inputMedium borInput'])[1]");
	public static final Target SELECT_SALUDO = Target.the("seleccionar saludo")
			.locatedBy("//select[@name='ctl00$ctl00$uiBodyMain$uiBodyMain$uiBasicDetails$ddlSalutation']//option[@value='{0}']");
	
	
	
	
	

}
