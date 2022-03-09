package co.com.bancolombia.certificacion.tuboleta.questions;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoResultadoConsultaTours;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarResultadoConsultaTours implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MapeoResultadoConsultaTours.CONSULTA_RESULTADO_TOURS).viewedBy(actor).asString();
		
	}
	public static ValidarResultadoConsultaTours conElDato() {
		return new ValidarResultadoConsultaTours();
	}

}
