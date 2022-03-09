package co.com.bancolombia.certificacion.tuboleta.tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.bancolombia.certificacion.tuboleta.questions.ValidarTomarPalabraConcierto;
import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoCajonBusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class EjecucionTomarPalabra implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				//Enter.theValue(ValidarTomarPalabraConcierto.conLaPalabra()).into(MapeoCajonBusqueda.TXT_BUSCAR_ALGO));
				Enter.theValue("lo que quiero ver en el concierto").into(MapeoCajonBusqueda.TXT_BUSCAR_ALGO));
				

	}
	public static EjecucionTomarPalabra conLaPalabra(){
		return instrumented(EjecucionTomarPalabra.class);
	}

}
