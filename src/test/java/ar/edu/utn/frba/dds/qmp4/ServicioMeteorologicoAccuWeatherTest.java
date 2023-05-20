package ar.edu.utn.frba.dds.qmp4;

import com.accuweather.AccuWeatherAPI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ServicioMeteorologicoAccuWeatherTest {

  @Test
  void sePuedeConsultarPorElClimaDeBuenosAiresUnDiaLluviosoYFrio() {
    AccuWeatherAPI api = Mockito.mock(AccuWeatherAPI.class);
    var servicio = new ServicioMeteorologicoAccuWeather(api, Duration.ofMinutes(30));

    Map<String, Object> resultado = new HashMap<>();
    resultado.put("Temperature", 15);
    resultado.put("Humidity", 1.0);

    Mockito.when(api.getWeather("Buenos Aires")).thenReturn(resultado);

    var estadoDelClima = servicio.obtenerCondicionesClimaticas("Buenos Aires");
    Assertions.assertNotNull(estadoDelClima);
    Assertions.assertEquals(estadoDelClima.temperatura(), 15);
  }

  //  @Test
  void sePuedeConsultarPorElClimaDeBogotaUnDiaCalurosoYSeco() {
    AccuWeatherAPI api = Mockito.mock(AccuWeatherAPI.class);
    var asesor = new ServicioMeteorologicoAccuWeather(api, Duration.ofMinutes(30));
  }
}