package ar.edu.utn.frba.dds.qmp4;

import java.util.Map;

public interface AccuWeatherAPI {
  Map<String, Object> getWeather(String location);

}
