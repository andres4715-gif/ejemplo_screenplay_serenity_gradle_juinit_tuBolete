package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import org.hamcrest.Matchers;

import co.com.bancolombia.certificacion.tuboleta.questions.ValidarSoloValidacion;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionCuadroDeBusquedas;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class SoloValidacion {

	@When("^el diligencia la busqueda con la palabra (.*)$")
	public void elDiligenciaLaBusquedaConLaPalabraLaRoca(String buscarPalabra) {
		OnStage.theActorInTheSpotlight().attemptsTo(EjecucionCuadroDeBusquedas.conLaPalabra(buscarPalabra));

	}

	@Then("^el puede ver los (.*)$")
	public void elPuedeVerLos (String miPalabra) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarSoloValidacion.conElDato(), Matchers.containsString(miPalabra)));
		

	}

}
