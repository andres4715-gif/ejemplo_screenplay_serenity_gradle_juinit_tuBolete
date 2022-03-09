package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoRentarAuto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EjecucionRentarAuto implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub

		actor.attemptsTo
				(Click.on(MapeoRentarAuto.CLICK_AUTOS));

	}

	public static EjecucionRentarAuto conElClick() {
		return instrumented(EjecucionRentarAuto.class);
	}

}
