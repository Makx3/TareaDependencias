package Dependencias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    private Persona persona;
    private Vehiculo vehiculo;
    @BeforeEach
    void setUp() {
        persona = new Persona("Usuario");
        vehiculo = new Vehiculo("Auto", 5);
    }

    @Test
    void elegirVehiculo() {
        // Verifica que el metodo elegirVehiculo actualiza el vehículo de la persona correctamente
        persona.elegirVehiculo(vehiculo);
        assertEquals(vehiculo, persona.getVehiculo());
    }

    @Test
    void viajarAlDestino() {
        // Verifica que el metodo viajarAlDestino genera un mensaje válido cuando se ha elegido un vehículo
        persona.elegirVehiculo(vehiculo);
        String mensajeEsperado = "Hola Usuario el tiempo de viaje aproximado para llegar a Oficina en Auto es de: 77.5 minutos";
        assertEquals(mensajeEsperado, persona.viajarAlDestino("Oficina", 15.5));
    }

    @Test
    public void pruebaViajarASinVehiculo() {
        // Verifica que el método viajarA devuelve un mensaje de error cuando no se ha elegido un vehículo
        String mensajeEsperado = "Eliga un vehiculo antes de viajar.";
        assertEquals(mensajeEsperado, persona.viajarAlDestino("Oficina", 15.5));
    }
}
