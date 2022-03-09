package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoInicialDestinoYbusqueda {
	
	public static final Target TXT_ORIGEN_DEL_VUELO = Target.the("ingresar origen").locatedBy("(//*[@placeholder = 'Ingresa una ciudad'])[1]");
	public static final Target TXT_DESTINO_DEL_VUELO = Target.the("ingresar destino").locatedBy("(//*[@placeholder = 'Ingresa una ciudad'])[2]");
	public static final Target TXT_FECHA_INICIO = Target.the("ingresar fecha inicio").locatedBy("//*[@placeholder = 'Ida']");
	public static final Target TXT_FECHA_REGRESO = Target.the("ingresar fecha fin").locatedBy("//*[@placeholder = 'Vuelta']");
	public static final Target CLICK_BUSCAR = Target.the("click en buscar").locatedBy("//*[@class = 'sbox-button-container']/a");

}
