package Dependencias;

public class Vehiculo {
    private final String nombre;
    private final double velocidadPromedio;

    // en este caso velocidad promedio es los minutos que se demora el vehiculo en recorrer 1Km de distancia

    public Vehiculo(String nombre, double velocidadPromedio) {
        this.nombre = nombre;
        this.velocidadPromedio = velocidadPromedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularTiempo(double distanciaKilometros) {
        return distanciaKilometros * velocidadPromedio;
    }
}
