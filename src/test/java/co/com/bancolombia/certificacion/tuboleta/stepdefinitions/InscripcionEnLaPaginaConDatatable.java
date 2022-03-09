package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import java.util.List;

import co.com.bancolombia.certificacion.tuboleta.models.InicioRegistro;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionInicioRegistro;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;

public class InscripcionEnLaPaginaConDatatable {

	@When("^el diligencia todos los datos de la pagina para el registro$")
	public void elDiligenciaTodosLosDatosDeLaPaginaParaElRegistro(List<InicioRegistro> conlosregistrosexitosos)  {
		OnStage.theActorInTheSpotlight().attemptsTo((Performable) EjecucionInicioRegistro.conLosDatos2(conlosregistrosexitosos.get(0)));

	}


	@Then("^el puede ver su nombre en la pagina despues de diligenciar los datos$")
	public void elPuedeVerSuNombreEnLaPaginaDespuesDeDiligenciarLosDatos()  {

	}
	
}
