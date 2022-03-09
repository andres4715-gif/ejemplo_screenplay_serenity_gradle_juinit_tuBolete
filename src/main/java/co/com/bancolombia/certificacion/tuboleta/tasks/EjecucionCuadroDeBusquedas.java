package co.com.bancolombia.certificacion.tuboleta.tasks;



import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoCuadroDeBusquedas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EjecucionCuadroDeBusquedas implements Task {

	private String buscarPalabra;

	public EjecucionCuadroDeBusquedas(String buscarPalabra) {
		this.buscarPalabra = buscarPalabra;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Enter.theValue(buscarPalabra).into(MapeoCuadroDeBusquedas.TXT_BUSQUEDAS).thenHit(Keys.ENTER));

	}

	public static EjecucionCuadroDeBusquedas conLaPalabra(String buscarPalabra) {
		return instrumented(EjecucionCuadroDeBusquedas.class, buscarPalabra);
	}
}
