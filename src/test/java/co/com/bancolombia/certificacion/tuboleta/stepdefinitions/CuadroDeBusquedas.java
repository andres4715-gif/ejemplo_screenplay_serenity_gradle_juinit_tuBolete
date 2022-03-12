package co.com.bancolombia.certificacion.tuboleta.stepdefinitions;

import org.hamcrest.Matchers;

import co.com.bancolombia.certificacion.tuboleta.questions.ValidarLosResultadosDeLaBusqueda;
import co.com.bancolombia.certificacion.tuboleta.tasks.EjecucionCuadroDeBusquedas;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class CuadroDeBusquedas {

    @When("^el diligencia el campo de busqueda con la palabra (.*)$")
    public void elDiligenciaElCampoDeBusquedaConLaPalabra(String buscarPalabra) {
        OnStage.theActorInTheSpotlight().attemptsTo(EjecucionCuadroDeBusquedas.conLaPalabra(buscarPalabra));
    }

    @Then("^el puede ver el texto (.*)$")
    public void elPuedeVerElTexto(String validarDato) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLosResultadosDeLaBusqueda.conElDato(),
                Matchers.containsString(validarDato)));
    }
}
