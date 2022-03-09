package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionDetallesPersonales;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionPaginaInicial;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionUbicacionGeografica;

import co.com.bancolombia.certificacion.tuboleta.util.drivers.MyDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegistrarUsuario {

	@Before
	public void manipularActor() {
		OnStage.setTheStage(new OnlineCast());

	}

	@Given("^que el (.*) esta en la pagina inicial de tuboleta$")
	public void queElUsuarioEstaEnLaPaginaInicialDeTuboleta(String name) {
		OnStage.theActorCalled(name).can(BrowseTheWeb.with(MyDriver.web().enLaPagina("https://vive.tuboleta.com/")));
		OnStage.theActorInTheSpotlight().wasAbleTo((Performable) EjecucionPaginaInicial.dandoClick());

	}

	@When("^el diligencia todos los datos de la pagina para finalizar el registro$")
	public void elDiligenciaTodosLosDatosDeLaPaginaParaFinalizarElRegistro() {
		OnStage.theActorInTheSpotlight().attemptsTo((Performable) EjecucionDetallesPersonales.conLosDatos());

	}

	@When("^diligencia los datos de ubicacion geografica$")
	public void diligenciaLosDatosDeUbicacionGeografica() {
		OnStage.theActorInTheSpotlight()
				.attemptsTo(EjecucionUbicacionGeografica.conLosDatosDeUbicacion());

	}

	@Then("^el puede ver su nombre en la pagina de bienvenida$")
	public void elPuedeVerSuNombreEnLaPaginaDeBienvenida() {

	}

}
