package co.com.bancolombia.certificacion.tuboleta.tasks;

import org.openqa.selenium.Keys;
import co.com.bancolombia.certificacion.tuboleta.models.OficinaEntregaYDevolucion;
import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoEntregaYDevolucion;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

public class EjecucionEntregaYDevolucion implements Task {

	OficinaEntregaYDevolucion oficinaentregaydevolucion;

	public EjecucionEntregaYDevolucion(OficinaEntregaYDevolucion oficinaentregaydevolucion) {
		this.oficinaentregaydevolucion = oficinaentregaydevolucion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(MapeoEntregaYDevolucion.CLICK_OTRO_LUGAR),
				Enter.theValue(oficinaentregaydevolucion.getOficinaentrega())
						.into(MapeoEntregaYDevolucion.OFICINA_ENTREGA).thenHit(Keys.ENTER),
				Enter.theValue(oficinaentregaydevolucion.getOficinadevolucion())
						.into(MapeoEntregaYDevolucion.OFICINA_DEVOLUCION).thenHit(Keys.ENTER));

	}

	public static EjecucionEntregaYDevolucion conLosDatos(OficinaEntregaYDevolucion oficinaentregaydevolucion) {
		return Tasks.instrumented(EjecucionEntregaYDevolucion.class, oficinaentregaydevolucion);
	}

}
