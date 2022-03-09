package co.com.bancolombia.certificacion.tuboleta.questions;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoSoloValidacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarSoloValidacion implements Question <String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MapeoSoloValidacion.GET_RESULTADOS).viewedBy(actor).asString();
	}

	public static ValidarSoloValidacion conElDato() {
		return new ValidarSoloValidacion();
	}
	
}
