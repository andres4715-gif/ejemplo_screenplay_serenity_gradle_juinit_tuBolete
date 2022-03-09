package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.questions.ValidarBusquedaDeLaMismaPagina;
import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoBusquedaDeLaMismaPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EjecucionBusquedaDeLaMismaPagina implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Enter.theValue(actor.asksFor(ValidarBusquedaDeLaMismaPagina.conElDato())).into(MapeoBusquedaDeLaMismaPagina.TXT_BUSQUEDA_DEL_DATO));						
				
	}
	public static EjecucionBusquedaDeLaMismaPagina conResultado() {
		return Tasks.instrumented(EjecucionBusquedaDeLaMismaPagina.class);
	}

}
