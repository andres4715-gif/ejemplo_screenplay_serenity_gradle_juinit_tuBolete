package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoPaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class EjecucionPaginaInicial implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.attemptsTo(
				Click.on(MapeoPaginaInicial.CLICK_REGISTRO));
		
	}
	
	public static EjecucionPaginaInicial dandoClick() {
		return instrumented(EjecucionPaginaInicial.class);
	}
	
	

}
