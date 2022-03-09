package co.com.bancolombia.certificacion.tuboleta.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoUbicacionGeografica;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EjecucionUbicacionGeografica implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(MapeoUbicacionGeografica.SELECT_PAIS),
				Click.on(MapeoUbicacionGeografica.SELECT_DEPARTAMENTO));

	}

	public static EjecucionUbicacionGeografica conLosDatosDeUbicacion() {
		return instrumented(EjecucionUbicacionGeografica.class);

	}

}
