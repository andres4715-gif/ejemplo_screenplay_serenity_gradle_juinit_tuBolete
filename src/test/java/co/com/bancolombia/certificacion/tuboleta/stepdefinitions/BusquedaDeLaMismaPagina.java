package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import co.com.bancolombia.certificacion.tuboleta.questions.ValidarBusquedaDeLaMismaPagina;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionBusquedaDeLaMismaPagina;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecutarBuscarBandaEnMedellin;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;


public class BusquedaDeLaMismaPagina {
	
	@When("^el toma un dato de la pagina y lo busca$")
	public void elTomaUnDatoDeLaPaginaYLoBusca() {
		OnStage.theActorInTheSpotlight().attemptsTo(EjecucionBusquedaDeLaMismaPagina.conResultado());
		
	}

	@Then("^el puede ver(.*)$")
	public void elPuedeVerEventosPara(String arg1) {
	
	}

}
