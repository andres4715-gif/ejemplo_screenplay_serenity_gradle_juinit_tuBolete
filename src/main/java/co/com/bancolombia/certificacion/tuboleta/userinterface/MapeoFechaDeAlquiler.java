package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoFechaDeAlquiler {
	
	public static final Target FECHA_DESDE = Target.the("fecha inicio alquiler").locatedBy("//input[@id='ap_car_start']");
	public static final Target FECHA_HASTA = Target.the("fecha final alquiler").locatedBy("//input[@id='ap_car_end']");
	public static final Target HORA_DESDE = Target.the("hora desde para alquilar").locatedBy("//select[@id='ap_car_pickUpTime']//option[@value='2:00']");
	public static final Target HORA_HASTA = Target.the("hora hasta para alquilar").locatedBy("//select[@id='ap_car_dropOffTime']//option[@value='3:00']");
	public static final Target CLICK_BUSCAR_AUTOS = Target.the("click en buscar autos").locatedBy("//input[@value='Buscar autos']");
	
	

}
