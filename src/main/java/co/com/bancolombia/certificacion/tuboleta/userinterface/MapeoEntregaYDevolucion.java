package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoEntregaYDevolucion {
	
	public static final Target CLICK_OTRO_LUGAR = Target.the("seleccionar otro lugar").locatedBy("(//input[@name='SameStation'])[2]");
	public static final Target OFICINA_ENTREGA = Target.the("seleccionar oficina entrega").locatedBy("//input[@name='PickUpStation.Name']");
	public static final Target OFICINA_DEVOLUCION = Target.the("seleccionar oficina devolucion").locatedBy("//input[@name='DropOffStation.Name']");

}
