package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoRespuestaAlquilerCarros {
	
	public static final Target RESPUESTA_AUTOS = Target.the("respuesta alquiler del carro").locatedBy("//*[@id='cajaErr']/p[1]");

}
