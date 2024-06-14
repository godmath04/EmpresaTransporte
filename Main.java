import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        Empressa flota = new Empressa();

        //Mostrar las características de los camiones
        System.out.println("Características de los camiones: ");

        // Listar camiones
        List<String> listaCamiones = flota.listaCam();
        for (int i = 0; i < listaCamiones.size(); i++) {
            System.out.println(listaCamiones);
        }

        //Pedir que el usuario ingrese la carga
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese la carga que desea: ");
        double carga = Double.parseDouble(bf.readLine());

        // Cargar un camión
        Camion camionACargar = flota.elegirCamion(carga);
        if (camionACargar != null) {
            System.out.println(camionACargar.cargar(carga));
        } else {
            System.out.println("No hay camiones disponibles para cargar esa cantidad.");
        }

        // Buscar el mejor camión para la carga
        Camion mejorCamion = flota.elegirCamion(carga);
        if (mejorCamion != null) {
            System.out.println("El mejor camión para transportar" + carga +  "es: " + mejorCamion.mostrarDatos());
        } else {
            System.out.println("No hay camiones disponibles para transportar.");
        }
    }
}
