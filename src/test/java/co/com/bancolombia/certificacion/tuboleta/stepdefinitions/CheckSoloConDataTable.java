package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;

import co.com.bancolombia.certificacion.tuboleta.models.SoloConDataTable;
import co.com.bancolombia.certificacion.tuboleta.questions.ValidarSoloConDataTable;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class CheckSoloConDataTable {

	@Then("^el puede ver los$")
	public void elPuedeVerLos(List<SoloConDataTable> validacionExitosa) {
		OnStage.theActorInTheSpotlight().should(
				GivenWhenThen.seeThat(ValidarSoloConDataTable.conElDato(), Matchers.is(validacionExitosa.get(1).getMensaje())));

	}
}
