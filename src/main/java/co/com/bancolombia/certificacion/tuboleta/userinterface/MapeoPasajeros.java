package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoPasajeros {

	public static final Target SELECT_ADULTOS = Target.the("ingresar numero adultos").locatedBy("//select[@name='Adults']//option[@value='3']");
	public static final Target SELECT_MENORES = Target.the("ingresar numero menores").locatedBy("//select[@name='Minors']//option[@value='1']");
	public static final Target SELECT_EDAD_MENORES = Target.the("ingresar edad de los menores").locatedBy("//select[@name='MinorsAges[0].Years']//option[@value='13']");
	public static final Target CLICK_BUSCAR_VUELOS = Target.the("click buscar vuelos").locatedBy("//input[@value='Buscar vuelos']");
	
	
}
