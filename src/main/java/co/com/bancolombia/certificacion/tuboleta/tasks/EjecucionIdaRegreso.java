package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoIdaRegreso;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EjecucionIdaRegreso implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Enter.theValue("24/08/2019").into(MapeoIdaRegreso.TXT_IDA),
				Enter.theValue("26/09/2019").into(MapeoIdaRegreso.TXT_REGRESO));
	}

	public static EjecucionIdaRegreso conEldato() {
		return instrumented(EjecucionIdaRegreso.class);
	}
}
