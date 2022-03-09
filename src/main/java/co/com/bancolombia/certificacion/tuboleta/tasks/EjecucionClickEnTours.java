package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoClickEnTours;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EjecucionClickEnTours implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Click.on(MapeoClickEnTours.CLICK_TOURS));
		
	}
	
	public static EjecucionClickEnTours conElClick() {
		return Tasks.instrumented(EjecucionClickEnTours.class);
	}
	

}
