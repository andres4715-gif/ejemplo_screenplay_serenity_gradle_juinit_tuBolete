package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoPasajeros;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EjecucionPasajeros implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(
				Click.on(MapeoPasajeros.SELECT_ADULTOS),
				Click.on(MapeoPasajeros.SELECT_MENORES),Scroll.to(MapeoPasajeros.SELECT_MENORES),
				Click.on(MapeoPasajeros.SELECT_EDAD_MENORES),
				Click.on(MapeoPasajeros.CLICK_BUSCAR_VUELOS));

		
	}
	
	public static EjecucionPasajeros conElNumeroDePasajeros() {
		return instrumented(EjecucionPasajeros.class);
	}
	

}
