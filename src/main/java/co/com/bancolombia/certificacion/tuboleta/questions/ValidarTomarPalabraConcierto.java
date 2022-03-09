package co.com.bancolombia.certificacion.tuboleta.questions;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoTomarPalabraConcierto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarTomarPalabraConcierto implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MapeoTomarPalabraConcierto.TOMAR_TEXTO_CONCIERTO).viewedBy(actor).asString();
		
	}
	
	public static ValidarTomarPalabraConcierto conLaPalabra() {
		return new ValidarTomarPalabraConcierto();
	}

}
