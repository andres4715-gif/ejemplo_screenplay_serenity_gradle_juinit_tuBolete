package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import org.hamcrest.Matchers;

import co.com.bancolombia.certificacion.tuboleta.questions.ValidarResultadoConsultaTours;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionClickEnTours;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionEscogerDestinoDelTour;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionInicialDestinoYbusqueda;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionModuloViajes;
import co.com.bancolombia.certificacion.tuboleta.util.drivers.MyDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InteractuarConDosPaginas {

	@When("^el selecciona irse de tour a cartagena$")
	public void elSeleccionaIrseDeTourACartagena() {
		theActorInTheSpotlight().attemptsTo(EjecucionModuloViajes.conElClick(),
				EjecucionClickEnTours.conElClick(), EjecucionEscogerDestinoDelTour.conElClick());
	}

	@Then("^el ve los resultados para salir a los (.*)$")
	public void elVeLosResultadosParaSalirALosToursDesdeCartagena(String destino) {
		theActorInTheSpotlight().should(
				GivenWhenThen.seeThat(ValidarResultadoConsultaTours.conElDato(), Matchers.containsString(destino)));

	}

	@Given("^que el (.*) esta en la pagina inicial de vuelos despegar$")
	public void queElUsuarioEstaEnLaPaginaInicialDeVuelosDespegar(String name) {
		OnStage.theActorCalled(name).can(BrowseTheWeb.with(MyDriver.web().enLaPagina("https://www.despegar.com.co/")));

	}

	@When("^el busca alojamiento mas vuelos$")
	public void elBuscaAlojamientoMasVuelos() {
		theActorInTheSpotlight().attemptsTo(EjecucionInicialDestinoYbusqueda.conLosDatos());

	}

	@Then("^el ve los resultados para alojarse en cartagena$")
	public void elVeLosResultadosParaAlojarseEnCartagena() {
	}
}
