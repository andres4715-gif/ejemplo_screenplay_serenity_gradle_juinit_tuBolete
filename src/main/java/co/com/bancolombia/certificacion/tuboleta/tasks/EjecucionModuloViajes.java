package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoModuloViajes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EjecucionModuloViajes implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(
				Click.on(MapeoModuloViajes.CLICK_EN_VIAJES));
		
	}

	public static EjecucionModuloViajes conElClick() {
		return instrumented(EjecucionModuloViajes.class);
	}
}
