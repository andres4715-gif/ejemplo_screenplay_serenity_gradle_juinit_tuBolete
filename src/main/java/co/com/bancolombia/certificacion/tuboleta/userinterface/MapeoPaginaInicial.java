package co.com.bancolombia.certificacion.tuboleta.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MapeoPaginaInicial {

    public static final Target CLICK_REGISTRO = Target.the("click en registro")
            .locatedBy("(//span[text()= 'Crea tu cuenta'])[position() = 2]");
}
