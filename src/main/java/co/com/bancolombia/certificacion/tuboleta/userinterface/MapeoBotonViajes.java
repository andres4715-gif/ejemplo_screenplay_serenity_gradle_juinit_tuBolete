package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoBotonViajes {

	public static final Target CLICK_VIAJES = Target.the("click en viajes")
			.locatedBy("(//*[contains (text(), 'Viajes')])[1]");
	public static final Target CLICK_EN_EL_AVION = Target.the("click en el avion")
			.locatedBy("//*[@class='ap-data_section-Flights ap_booker_tab']");
	public static final Target SELECT_SENCILLO = Target.the("seleccionar sencillo")
			.locatedBy("(//*[@name='TripMode'])[1]");

}
