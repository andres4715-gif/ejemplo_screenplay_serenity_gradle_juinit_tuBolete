package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoRentarAuto {

	public static final Target CLICK_AUTOS = Target.the("click en el modulo de autos")
			.locatedBy("(//*[contains(text(), 'Autos')])[2]");

}
