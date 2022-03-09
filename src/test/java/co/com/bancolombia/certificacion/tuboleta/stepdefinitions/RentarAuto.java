package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;

import co.com.bancolombia.certificacion.tuboleta.models.OficinaEntregaYDevolucion;
import co.com.bancolombia.certificacion.tuboleta.questions.ValidarRespuestaAlquilerCarros;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionEntregaYDevolucion;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionFechaDeAlquiler;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionModuloViajes;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionRentarAuto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class RentarAuto {

	@Given("^busca el modulo de autos para la renta$")
	public void buscaElModuloDeAutosParaLaRenta() {
		OnStage.theActorInTheSpotlight().wasAbleTo(EjecucionModuloViajes.conElClick());
		OnStage.theActorInTheSpotlight().wasAbleTo(EjecucionRentarAuto.conElClick());

	}

	@When("^el diligencia los datos para rentar el auto$")
	public void elDiligenciaLosDatosParaRentarElAuto(List<OficinaEntregaYDevolucion> datosExitosos) {
		OnStage.theActorInTheSpotlight().attemptsTo(EjecucionEntregaYDevolucion.conLosDatos(datosExitosos.get(0)));
		OnStage.theActorInTheSpotlight().attemptsTo(EjecucionFechaDeAlquiler.conLaFecha());

	}

	@Then("^el ve el mensaje (.*)$")
	public void elVeElMensaje(String resultadoBusquedaRentarAutos) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarRespuestaAlquilerCarros.conLaRespuesta()
				, Matchers.containsString(resultadoBusquedaRentarAutos)));

	}

}
