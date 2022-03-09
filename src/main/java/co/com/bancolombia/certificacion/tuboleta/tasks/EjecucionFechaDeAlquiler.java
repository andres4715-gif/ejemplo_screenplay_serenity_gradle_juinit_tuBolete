package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoFechaDeAlquiler;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EjecucionFechaDeAlquiler implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue("21/09/2019").into(MapeoFechaDeAlquiler.FECHA_DESDE),
				Enter.theValue("26/10/2019").into(MapeoFechaDeAlquiler.FECHA_HASTA),
				Click.on(MapeoFechaDeAlquiler.HORA_DESDE), Click.on(MapeoFechaDeAlquiler.HORA_HASTA),
				Click.on(MapeoFechaDeAlquiler.CLICK_BUSCAR_AUTOS));

	}

	public static EjecucionFechaDeAlquiler conLaFecha() {
		return instrumented(EjecucionFechaDeAlquiler.class);
	}
}
