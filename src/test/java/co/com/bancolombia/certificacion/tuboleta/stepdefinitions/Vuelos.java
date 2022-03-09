package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;

import co.com.bancolombia.certificacion.tuboleta.models.OrigenAndDestino;
import co.com.bancolombia.certificacion.tuboleta.questions.ValidarViaje_ida_y_vuelta;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionBotonViajes;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionIdaRegreso;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionOrigenAndDestino;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionPasajeros;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class Vuelos {

	@Given("^busca el modulo de viajes$")
	public void buscaElModuloDeViajes() {
		OnStage.theActorInTheSpotlight().wasAbleTo(EjecucionBotonViajes.conElClick());

	}

	@When("^el diligencia todos los datos del vuelo$")
	public void elDiligenciaTodosLosDatosDelVuelo(List<OrigenAndDestino> DiligenciarDatosCorrectamente) {
		OnStage.theActorInTheSpotlight().attemptsTo(EjecucionOrigenAndDestino.conLosDatos(DiligenciarDatosCorrectamente.get(0)));
		OnStage.theActorInTheSpotlight().attemptsTo(EjecucionIdaRegreso.conEldato());
		OnStage.theActorInTheSpotlight().attemptsTo(EjecucionPasajeros.conElNumeroDePasajeros());
	}

	@Then("^el puede ver el mensaje (.*)$")
	public void elPuedeVerElMensaje(String mensaje) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarViaje_ida_y_vuelta.conElMensaje(),Matchers.containsString(mensaje)));
	}

}
