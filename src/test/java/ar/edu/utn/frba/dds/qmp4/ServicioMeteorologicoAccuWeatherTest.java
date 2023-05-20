package ar.edu.utn.frba.dds.qmp4;

import com.accuweather.AccuWeatherAPI;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ServicioMeteorologicoAccuWeatherTest {

  //@Test
  void sePuedeConsultarPorElClimaDeBuenosAiresUnDiaLluviosoYFrio() {
    AccuWeatherAPI api = Mockito.mock(AccuWeatherAPI.class);
    var asesor = new ServicioMeteorologicoAccuWeather(api, Duration.ofMinutes(30));
  }

  //  @Test
  void sePuedeConsultarPorElClimaDeBogotaUnDiaCalurosoYSeco() {
    AccuWeatherAPI api = Mockito.mock(AccuWeatherAPI.class);
    var asesor = new ServicioMeteorologicoAccuWeather(api, Duration.ofMinutes(30));
  }
}