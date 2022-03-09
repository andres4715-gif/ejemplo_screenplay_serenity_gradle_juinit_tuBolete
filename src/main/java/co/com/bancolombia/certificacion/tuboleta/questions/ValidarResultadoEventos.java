package co.com.bancolombia.certificacion.tuboleta.questions;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoResultadoEventos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarResultadoEventos implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		String elTexto = Text.of(MapeoResultadoEventos.RESULTADO_EVENTOS).viewedBy(actor).asString();
		String sacarPais = elTexto.substring(44, 52);
		System.out.println(sacarPais);
		return elTexto;
	}
	
	public static ValidarResultadoEventos enLaPagina() {
		return new ValidarResultadoEventos();
	}

}
