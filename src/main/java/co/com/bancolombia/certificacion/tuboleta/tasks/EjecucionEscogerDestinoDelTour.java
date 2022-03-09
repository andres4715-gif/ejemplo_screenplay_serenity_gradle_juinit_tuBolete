package co.com.bancolombia.certificacion.tuboleta.tasks;

import org.openqa.selenium.Keys;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoEscogerDestinoDelTour;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;


public class EjecucionEscogerDestinoDelTour implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue("cartagena").into(MapeoEscogerDestinoDelTour.TXT_BUSCAR_DESTINO).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER));
					
	}

	public static EjecucionEscogerDestinoDelTour conElClick() {
		return Tasks.instrumented(EjecucionEscogerDestinoDelTour.class);
	}
}
