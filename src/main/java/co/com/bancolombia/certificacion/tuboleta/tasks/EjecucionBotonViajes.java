package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoBotonViajes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EjecucionBotonViajes implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub

		actor.attemptsTo(Click.on(MapeoBotonViajes.CLICK_VIAJES), Click.on(MapeoBotonViajes.CLICK_EN_EL_AVION),
				Click.on(MapeoBotonViajes.SELECT_SENCILLO));

	}

	public static EjecucionBotonViajes conElClick() {
		return instrumented(EjecucionBotonViajes.class);
	}

}
