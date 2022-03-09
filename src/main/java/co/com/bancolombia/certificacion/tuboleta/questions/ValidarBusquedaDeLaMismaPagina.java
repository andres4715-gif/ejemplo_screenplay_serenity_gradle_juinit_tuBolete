package co.com.bancolombia.certificacion.tuboleta.questions;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoBusquedaDeLaMismaPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarBusquedaDeLaMismaPagina  implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(MapeoBusquedaDeLaMismaPagina.BUSQUEDA_DATO).viewedBy(actor).asString();
		
	}
	public static ValidarBusquedaDeLaMismaPagina conElDato() {
		return new ValidarBusquedaDeLaMismaPagina();
	}

}
