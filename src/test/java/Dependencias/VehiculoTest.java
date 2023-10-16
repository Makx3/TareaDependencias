package Dependencias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {
    private Vehiculo auto;
    private Vehiculo moto;
    private Vehiculo bicicleta;

    @BeforeEach
    void setUp() {
        auto = new Vehiculo("Auto", 5.0);
        moto = new Vehiculo("Motocicleta", 3.0);
        bicicleta = new Vehiculo("Bicicleta", 2.0);
    }

    @Test
    void getNombre() {
        // Verifica que los nombres de los vehiculos se establecen correctamente
        assertEquals("Auto", auto.getNombre());
        assertEquals("Motocicleta", moto.getNombre());
        assertEquals("Bicicleta", bicicleta.getNombre());
    }

    @Test
    void calcularTiempo() {
        double distanciaKilometros = 10.0;
        double tiempoEsperado = distanciaKilometros * 5.0;
        assertEquals(tiempoEsperado, auto.calcularTiempo(distanciaKilometros), 0.01);
    }
}