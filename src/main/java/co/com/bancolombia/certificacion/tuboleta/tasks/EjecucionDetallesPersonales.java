package co.com.bancolombia.certificacion.tuboleta.tasks;

import co.com.bancolombia.certificacion.tuboleta.userinterface.MapeoDetallesPersonales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EjecucionDetallesPersonales implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub

		actor.attemptsTo(Enter.theValue("tuboleta001@gmail.com").into(MapeoDetallesPersonales.TXT_CORREO_ELECTRONICO),
				Scroll.to(MapeoDetallesPersonales.TXT_CORREO_ELECTRONICO),
				Enter.theValue("Nomegustanlascontrasenias456*").into(MapeoDetallesPersonales.TXT_CONTRASENIA),
				Enter.theValue("Nomegustanlascontrasenias456*").into(MapeoDetallesPersonales.TXT_CONFIRMAR_CONTRASENIA),
				Enter.theValue("56789876").into(MapeoDetallesPersonales.TXT_NUMERO_IDENTIFICACION),
				Click.on(MapeoDetallesPersonales.SELECT_SALUDO),
				Enter.theValue("Anastacio Munera").into(MapeoDetallesPersonales.TXT_PRIMER_NOMBRE),
				Enter.theValue("Mendez de la Cruz").into(MapeoDetallesPersonales.TXT_APELLIDO),
				Enter.theValue("23").into(MapeoDetallesPersonales.TXT_DIA),
				Enter.theValue("12").into(MapeoDetallesPersonales.TXT_MES),
				Enter.theValue("1974").into(MapeoDetallesPersonales.TXT_ANIO),Scroll.to(MapeoDetallesPersonales.TXT_ANIO),
				Enter.theValue("57").into(MapeoDetallesPersonales.TXT_CODIGO_AREA),
				Enter.theValue("3453434").into(MapeoDetallesPersonales.TXT_TELEFONO),
				Enter.theValue("307343432").into(MapeoDetallesPersonales.TXT_CELULAR),
				Enter.theValue("Calle 46 # 45 - 34 apto 453").into(MapeoDetallesPersonales.TXT_DIRECCION),
				Enter.theValue("Edificio San Arcangel de la paz").into(MapeoDetallesPersonales.TXT_EDIFICIO),
				Enter.theValue("Bogota").into(MapeoDetallesPersonales.TXT_CIUDAD));
	}

	public static EjecucionDetallesPersonales conLosDatos() {
		return instrumented(EjecucionDetallesPersonales.class);
	}

}
