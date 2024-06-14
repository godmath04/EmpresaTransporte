import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Camion {
    //Atributos
    String matricula;
    double cargaActual;
    double capacidad;
    double consumo;

    // Constructor
    public Camion(String matricula, double capacidad, double consumo){
        this.matricula = matricula;
        this.cargaActual = 0;
        this.capacidad = capacidad;
        this.consumo = consumo;
    }

    //Metodo para cargar
    public String cargar(double peso) {
        if (cargaActual + peso <= capacidad) {
            cargaActual = cargaActual + peso;
            return "Carga: " + peso + " [kg]. Carga actual" + cargaActual + " [kg].";
        } else {
            return "La capacidad ha sido excedida. No se puede cargar";
        }
    }

    //Metodo para quitar cargar
    public String quitarCargar(double peso){
        if (cargaActual - peso >= 0){
            cargaActual = cargaActual - peso;
            return "Se descargó: " + peso + " [kg]. La carga actual es: " + cargaActual + " [kg].";
            
        }   else {
            return "Se quiere descargar más de lo que hay";
        }
    }

    //Metodo para mostrar disponibilidad
    public boolean disponibilidad(double peso){
        return capacidad - cargaActual >= peso;
    }



    //Metodo para mostrar los datos de la carga
    public String mostrarDatos () {
        StringBuilder sb = new StringBuilder();
        sb.append("La matricula del camión es es: " + matricula);
        sb.append("\nLa capacidad es: " + capacidad + "[kg].");
        sb.append("\nEl consumo es es: " + consumo + " [gal/km].");
        sb.append("\nLa carga actual es: " + cargaActual + "[kg]");
        sb.append("\nLa matricula es: " + matricula);
       return sb.toString();
    }
}
