package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoValidarViaje_ida_y_vuelta {
	
	public static final Target MENSAJE_VUELO = Target.the("validacion mensaje del vuelo").locatedBy("//*[contains (text(), 'Vuelos viaje ida y vuelta')]");

}
