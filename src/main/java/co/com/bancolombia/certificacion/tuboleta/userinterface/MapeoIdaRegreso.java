package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoIdaRegreso {
	
	public static final Target TXT_IDA = Target.the("ingresar ida").locatedBy("//*[@id='ap_flight_start']");
	public static final Target TXT_REGRESO = Target.the("ingresar regreso").locatedBy("//*[@id='ap_flight_end']");
	

}
