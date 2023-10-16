package Dependencias;

import java.util.Scanner;

public class InteraccionUsuario {
    public static void ejecutarInteraccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        Persona persona = new Persona(nombreUsuario);

        System.out.println("Elige tu vehículo (1 para Auto, 2 para Motocicleta, 3 para Bicicleta):");
        int opcionVehiculo = scanner.nextInt();
        Vehiculo vehiculoElegido = switch (opcionVehiculo) {
            case 1 -> new Vehiculo("Auto", 5.0);
            case 2 -> new Vehiculo("Motocicleta", 3.0);
            case 3 -> new Vehiculo("Bicicleta", 2.0);
            default -> {
                System.out.println("Opción de vehículo no válida, se utilizará un Auto por defecto.");
                yield new Vehiculo("Auto", 5.0);
            }
        };

        // los valores otorgados en la velocidad a los vehiculos son meras aproximaciones.

        // solicitar el nombre del destino y la distancia en kilómetros
        scanner.nextLine();
        System.out.print("Ingrese el destino: ");
        String destino = scanner.nextLine();
        System.out.print("Ingrese la distancia en kilómetros: ");
        double distanciaKilometros = scanner.nextDouble();

        // elegir vehículo y calcular el tiempo del viaje
        persona.elegirVehiculo(vehiculoElegido);
        String mensaje = persona.viajarAlDestino(destino, distanciaKilometros);
        System.out.println(mensaje);
    }
}
