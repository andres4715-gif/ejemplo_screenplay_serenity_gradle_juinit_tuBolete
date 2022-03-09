package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoTomarPalabraConcierto {

	
	public static final Target TOMAR_TEXTO_CONCIERTO = Target.the("tomar la palabra concierto").locatedBy("//*[@class='footerSite']//*[contains(text(), 'Conciertos')]");
}
