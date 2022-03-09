package co.com.bancolombia.certificacion.tuboleta.questions;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoValidarViaje_ida_y_vuelta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarViaje_ida_y_vuelta implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MapeoValidarViaje_ida_y_vuelta.MENSAJE_VUELO).viewedBy(actor).asString();
	}

	public static ValidarViaje_ida_y_vuelta conElMensaje() {
		return new ValidarViaje_ida_y_vuelta();
	}
}
