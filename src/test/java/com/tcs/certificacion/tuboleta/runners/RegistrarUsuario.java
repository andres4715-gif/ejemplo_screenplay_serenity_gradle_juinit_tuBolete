package com.tcs.certificacion.tuboleta.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registrarUsuario.feature"
        , glue = "co.com.bancolombia.certificacion.tuboleta.stepdefinitions"
        , snippets = SnippetType.CAMELCASE
        , tags = "@inscripcion_en_la_pagina"
)

public class RegistrarUsuario {

}
