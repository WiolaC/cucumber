package pl.sda.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pl.sda.cucumber.HelloWorld;

import static org.assertj.core.api.Assertions.assertThat;

public class MyStepDefs {
    HelloWorld helloWorld;
    String zwroconePowitanie = "";

    @Given("Stworzona instancja klasy obiektu HelloWorld")
    public void stworzonaInstancjaKlasyObiektuHelloWorld() {
        helloWorld = new HelloWorld();
    }

    @When("Wprowadzono język {string}")
    public void wprowadzonoJęzykPolski (String lang) {
        zwroconePowitanie = helloWorld.getHelloMessage(lang);
    }

    @Then("Wyświetlony został komunikat {string}")
    public void wyświetlonyZostałKomunikatWJęzykuPolskim(String powitanie ) {
        assertThat(zwroconePowitanie).isEqualTo(powitanie);
    }


    }

