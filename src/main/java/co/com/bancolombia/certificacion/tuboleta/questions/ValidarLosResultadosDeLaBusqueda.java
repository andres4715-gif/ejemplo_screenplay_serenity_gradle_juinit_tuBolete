package co.com.bancolombia.certificacion.tuboleta.questions;


import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoCuadroDeBusquedas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarLosResultadosDeLaBusqueda implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MapeoCuadroDeBusquedas.VALIDAR_RESULTADOS).viewedBy(actor).asString();
	}

	public static ValidarLosResultadosDeLaBusqueda conElDato() {
		return new ValidarLosResultadosDeLaBusqueda();
	}
}
