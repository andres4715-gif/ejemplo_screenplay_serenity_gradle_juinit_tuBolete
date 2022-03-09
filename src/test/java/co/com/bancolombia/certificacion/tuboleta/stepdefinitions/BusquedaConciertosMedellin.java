package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionTomarPalabra;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class BusquedaConciertosMedellin {
	
	@When("^el busca los conciertos para la ciudad de medellin$")
	public void elBuscaLosConciertosParaLaCiudadDeMedellin()  {
		OnStage.theActorInTheSpotlight().attemptsTo(EjecucionTomarPalabra.conLaPalabra());

	}


	@Then("^el pueder ver el mensaje Eventos para \"([^\"]*)\"$")
	public void elPuederVerElMensajeEventosPara(String arg1)  {

	}

}
