package co.com.bancolombia.certificacion.tuboleta.questions;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoRespuestaAlquilerCarros;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class ValidarRespuestaAlquilerCarros implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		String texto =  Text.of(MapeoRespuestaAlquilerCarros.RESPUESTA_AUTOS).viewedBy(actor).asString();
		System.out.println(texto);
		return texto;
	}
	
	public static ValidarRespuestaAlquilerCarros conLaRespuesta() {
		return new ValidarRespuestaAlquilerCarros();
	}

}
