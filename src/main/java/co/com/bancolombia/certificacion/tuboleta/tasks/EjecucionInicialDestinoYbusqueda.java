package co.com.bancolombia.certificacion.tuboleta.tasks;

import org.openqa.selenium.Keys;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoInicialDestinoYbusqueda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EjecucionInicialDestinoYbusqueda implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue("Bogotá, Bogotá D.C., Colombia").into(MapeoInicialDestinoYbusqueda.TXT_ORIGEN_DEL_VUELO),
				Enter.theValue("Cartagena de Indias, Bolívar, Colombia").into(MapeoInicialDestinoYbusqueda.TXT_DESTINO_DEL_VUELO),
				//Enter.theValue("Jue, 19 sep 2019").into(MapeoInicialDestinoYbusqueda.TXT_FECHA_INICIO),
		        //Enter.theValue("Mar, 8 oct 2019").into(MapeoInicialDestinoYbusqueda.TXT_FECHA_REGRESO),
		        Click.on(MapeoInicialDestinoYbusqueda.CLICK_BUSCAR));
		
	}
	public static EjecucionInicialDestinoYbusqueda conLosDatos() {
		return Tasks.instrumented(EjecucionInicialDestinoYbusqueda.class);
	}
	

}
