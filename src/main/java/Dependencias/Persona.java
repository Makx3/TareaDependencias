package Dependencias;

public class Persona {
    private final String nombre;
    private Vehiculo vehiculo;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void elegirVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String viajarAlDestino(String destino, double distanciaKilometros) {
        if (vehiculo != null) {
            double tiempoMinutos = vehiculo.calcularTiempo(distanciaKilometros);
            return "Hola " + nombre + " el tiempo de viaje aproximado para llegar a " + destino + " en " + vehiculo.getNombre() + " es de: " + tiempoMinutos + " minutos";
        } else {
            return "Eliga un vehiculo antes de viajar.";
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}

