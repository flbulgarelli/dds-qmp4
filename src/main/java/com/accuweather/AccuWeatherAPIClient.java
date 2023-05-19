package com.accuweather;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.Map;

public class AccuWeatherAPIClient implements AccuWeatherAPI {

  private Client client = ClientBuilder.newClient();

  /**
   * @param location
   * @return
   * @see https://developer.accuweather.com/accuweather-current-conditions-api/apis
   */
  @Override
  public Map<String, Object> getWeather(String location) {
    return this.client.target("http://dataservice.accuweather.com/currentconditions/v1")
            .path(location)
            .queryParam("apiKey", "sacar esto de una variable de entorno o un archivo de configuracion")
            .request(MediaType.APPLICATION_JSON)
            .get(Map.class);

  }
}
