package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.models.OrigenAndDestino;
import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoOrigenAndDestino;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class EjecucionOrigenAndDestino implements Task {

	OrigenAndDestino origenanddestino;

	public EjecucionOrigenAndDestino(OrigenAndDestino origenanddestino) {
		this.origenanddestino = origenanddestino;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Enter.theValue(origenanddestino.getOrigen()).into(MapeoOrigenAndDestino.TXT_ORIGEN)
						.thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
				Enter.theValue(origenanddestino.getDestino()).into(MapeoOrigenAndDestino.TXT_DESTINO)
						.thenHit(Keys.ENTER));
	}

	public static EjecucionOrigenAndDestino conLosDatos(OrigenAndDestino origenanddestino) {
		return Tasks.instrumented(EjecucionOrigenAndDestino.class, origenanddestino);
	}

}
