package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import org.hamcrest.Matchers;

import co.com.bancolombia.certificacion.tuboleta.questions.ValidarResultadoEventos;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecutarBuscarBandaEnMedellin;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class BuscarBandasEnMedellin {

	@When("^el ingresa la busqueda (.*) antes de salir de la pagina$")
	public void elIngresaLaBusquedaAntesDeSalirDeLaPagina(String busquemos) {
		OnStage.theActorInTheSpotlight().attemptsTo(EjecutarBuscarBandaEnMedellin.conElDato(busquemos));

	}


	@Then("^el ve los resultados para Aterciopelados es lo (.*) de colombia$")
	public void elVeLosResultadosParaAterciopeladosEsLoMejorDeColombia(String busquedaMia)  {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResultadoEventos.enLaPagina(),
				Matchers.containsString(busquedaMia)));
		
	}


}
