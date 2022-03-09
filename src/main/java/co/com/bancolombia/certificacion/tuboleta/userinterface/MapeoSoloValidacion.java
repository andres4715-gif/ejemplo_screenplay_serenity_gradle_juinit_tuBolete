package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoSoloValidacion {

	public static final Target GET_RESULTADOS = Target.the("obtener los resultados")
			.locatedBy("//h1[@class='searchResultsHeader']");

}
