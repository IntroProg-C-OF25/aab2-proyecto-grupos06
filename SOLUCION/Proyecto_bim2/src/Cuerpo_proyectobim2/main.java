//Este java class llamado main unicamente se va a utilizar para exponer los resultados, o llenar los  archivos de otros java class
package Cuerpo_proyectobim2;
import Cuerpo_proyectobim2.Horario.*;
import java.util.Scanner;
import Cuerpo_proyectobim2.compra_entradas.*;
public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        crear_archivo.crear_horario("Horario\\horario.csv");
        crear_archivo.leer("Horario\\horario.csv");
        compra_entradas.entradas(teclado);
    }
}
