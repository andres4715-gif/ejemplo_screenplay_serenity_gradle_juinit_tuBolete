package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoOrigenAndDestino {
	
	public static final Target TXT_ORIGEN = Target.the("diligenciar origen").locatedBy("//*[@id='ap_origin_flight']");
	public static final Target TXT_DESTINO = Target.the("diligenciar destino").locatedBy("//*[@id='ap_dest_flight']");

}
