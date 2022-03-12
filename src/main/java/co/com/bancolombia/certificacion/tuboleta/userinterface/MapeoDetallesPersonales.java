package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoDetallesPersonales {

    public static final Target TXT_CORREO_ELECTRONICO = Target.the("diligenciar correo")
            .locatedBy("(//input[@class='inputLarge borInput'])[1]");
    public static final Target TXT_CONTRASENIA = Target.the("diligenciar contrasenia")
            .locatedBy("(//input[@class='inputLarge borInput'])[2]");
    public static final Target TXT_CONFIRMAR_CONTRASENIA = Target.the("diligenciar confirmar contrasenia")
            .locatedBy("(//input[@class='inputLarge borInput'])[3]");
    public static final Target TXT_NUMERO_IDENTIFICACION = Target.the("diligenciar numero identificacion")
            .locatedBy("(//*[@class='inputMedium borInput'])[1]");
    public static final Target SELECT_SALUDO = Target.the("como quieren que lo saluden")
            .locatedBy("//*[@class='borInput']//*[@value='Sr']");
    public static final Target TXT_PRIMER_NOMBRE = Target.the("ingresar primer nombre")
            .locatedBy("(//*[@class='inputLarge borInput'])[4]");
    public static final Target TXT_APELLIDO = Target.the("ingresar apellido")
            .locatedBy("(//*[@class='inputLarge borInput'])[5]");
    public static final Target TXT_DIA = Target.the("ingresar dia")
            .locatedBy("(//input[starts-with(@id, 'ctl00_ctl00')]//following::input[1])[9]");
    public static final Target TXT_MES = Target.the("ingresar mes")
            .locatedBy("(//input[starts-with(@id, 'ctl00_ctl00')]//following::input[1])[10]");
    public static final Target TXT_ANIO = Target.the("ingresar año")
            .locatedBy("(//input[starts-with(@id, 'ctl00_ctl00')]//following::input[1])[11]");
    public static final Target TXT_CODIGO_AREA = Target.the("ingresar codigo area")
            .locatedBy("(//input[starts-with(@id, 'ctl00_ctl00')]//following::input[1])[12]");
    public static final Target TXT_TELEFONO = Target.the("ingresar telefono")
            .locatedBy("(//input[starts-with(@id, 'ctl00_ctl00')]//following::input[1])[13]");
    public static final Target TXT_CELULAR = Target.the("ingresar celular")
            .locatedBy("(//input[starts-with(@id, 'ctl00_ctl00')]//following::input[1])[14]");
    public static final Target TXT_DIRECCION = Target.the("ingresar direccion")
            .locatedBy("(//input[starts-with(@id, 'ctl00_ctl00')]//following::input[1])[15]");
    public static final Target TXT_EDIFICIO = Target.the("ingresar edificio")
            .locatedBy("(//input[starts-with(@class, 'inputLarge')]//following::input[14])[1]");
    public static final Target TXT_CIUDAD = Target.the("ingresar ciudad")
            .locatedBy("(//input[starts-with(@class, 'inputLarge')]//following::input[15])[1]");
}
