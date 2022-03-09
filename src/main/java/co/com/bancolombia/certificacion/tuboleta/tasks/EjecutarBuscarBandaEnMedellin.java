package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoCajonBusqueda;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

public class EjecutarBuscarBandaEnMedellin implements Task {

	private String busquemos;

	public EjecutarBuscarBandaEnMedellin(String busquemos) {
		this.busquemos = busquemos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(busquemos).into(MapeoCajonBusqueda.TXT_BUSCAR_ALGO). thenHit(Keys.ENTER));

	}
	public static EjecutarBuscarBandaEnMedellin conElDato(String busquemos) {
		return instrumented(EjecutarBuscarBandaEnMedellin.class,busquemos);
		
	}

}
