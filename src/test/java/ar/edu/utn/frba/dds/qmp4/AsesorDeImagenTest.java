package ar.edu.utn.frba.dds.qmp4;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AsesorDeImagenTest {

  @Test
  void sePuedenGenerarAtuendosParaElClimaActual() {
    ServicioMeteorologico servicio = Mockito.mock(ServicioMeteorologico.class);
    var asesor = new AsesorDeImagen(servicio);
  }

}