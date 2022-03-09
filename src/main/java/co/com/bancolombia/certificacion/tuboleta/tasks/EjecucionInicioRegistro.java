package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.models.InicioRegistro;
import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoInicioRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class EjecucionInicioRegistro implements Task {

	InicioRegistro inicioregistro;

	public EjecucionInicioRegistro(InicioRegistro inicioregistro) {
		this.inicioregistro = inicioregistro;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub

		actor.attemptsTo(Enter.theValue(inicioregistro.getCorreo()).into(MapeoInicioRegistro.TXT_CORREO_ELECTRONICO),
				Scroll.to(MapeoInicioRegistro.TXT_CORREO_ELECTRONICO),
				Enter.theValue(inicioregistro.getContrasenia()).into(MapeoInicioRegistro.TXT_CONTRASENIA),
				Enter.theValue(inicioregistro.getConficontrasenia())
						.into(MapeoInicioRegistro.TXT_CONFIRMAR_CONTRASENIA),
				Enter.theValue(inicioregistro.getNumeroidentificacion())
						.into(MapeoInicioRegistro.TXT_NUMERO_IDENTIFICACION),
				Enter.theValue(inicioregistro.getSaludo()).into(MapeoInicioRegistro.SELECT_SALUDO));

	}

	public static EjecucionInicioRegistro conLosDatos2(InicioRegistro inicioregistro) {
		return Tasks.instrumented(EjecucionInicioRegistro.class, inicioregistro);
	}
}
