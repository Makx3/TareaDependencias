import java.util.Scanner;

public class InteraccionUsuario {
    public static void ejecutarInteraccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su nombre: ");
        String nombreUsuario = scanner.nextLine();

        Persona persona = new Persona(nombreUsuario);

        System.out.println("Elige tu vehiculo (1 para Auto, 2 para Motocicleta, 3 para Bicicleta):");
        int opcionVehiculo = scanner.nextInt();
        Vehiculo vehiculoElegido;

        // los valores otorgados en la velocidad a los vehiculos son meras aproximaciones.
        switch (opcionVehiculo) {
            case 1:
                vehiculoElegido = new Vehiculo("Auto", 5.0);
                break;
            case 2:
                vehiculoElegido = new Vehiculo("Motocicleta", 3.0);
                break;
            case 3:
                vehiculoElegido = new Vehiculo("Bicicleta", 2.0);
                break;
            default:
                System.out.println("Opcion de vehiculo no valida, se utilizara un Auto por defecto.");
                vehiculoElegido = new Vehiculo("Auto", 5.0);
                break;
        }
    }
    // solicita el nombre del destino y la distancia en kilometros
        scanner.nextLine();
        System.out.print("Ingrese el destino: ");
    String destino = scanner.nextLine();
        System.out.print("Ingrese la distancia en kilometros: ");
    double distanciaKilometros = scanner.nextDouble();

    // elegir vehiculo y calcula el tiempo del viaje
        persona.elegirVehiculo(vehiculoElegido);
    String mensaje = persona.viajarAlDestino(destino, distanciaKilometros);
        System.out.println(mensaje);
}
