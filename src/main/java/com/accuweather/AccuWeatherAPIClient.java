package com.accuweather;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.util.Map;

public class AccuWeatherAPIClient implements AccuWeatherAPI {

  private Client client = ClientBuilder.newClient();

  @Override
  public Map<String, Object> getWeather(String location) {
    return this.client.target("https://accuweather.com")
            .path("/climate")
            .request(MediaType.APPLICATION_JSON)
            .get(Map.class);
  }
}
