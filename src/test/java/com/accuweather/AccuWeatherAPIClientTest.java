package com.accuweather;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccuWeatherAPIClientTest {

  //@Test
  void sePuedeConsultarAAccuweatherYObtenerElPronosticoDeBuenosAires() {
    var cliente = new AccuWeatherAPIClient();
    var resultado = cliente.getWeather("Buenos Aires");

    Assertions.assertNotNull(resultado);
    Assertions.assertEquals(resultado.get("Temperature"), 18);
    Assertions.assertEquals(resultado.get("Humidity"), 1);

    // Varios ups acá
  }

}