package ar.edu.utn.frba.dds.qmp4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AsesorDeImagenTest {

  @Test
  void sePuedenGenerarAtuendosParaBuenosAiresCon18GradosY100PorcientoDeHumedad() {
    ServicioMeteorologico servicio = Mockito.mock(ServicioMeteorologico.class);

    Mockito
            .when(servicio.obtenerCondicionesClimaticas("Buenos Aires"))
            .thenReturn(new EstadoDelTiempo(18, Humedad.ALTA));

    var guardarropas = new Guardarropas();
    var asesor = new AsesorDeImagen(servicio);

    Assertions.assertNotNull(asesor.sugerirAtuendo("Buenos Aires", guardarropas));
  }

}