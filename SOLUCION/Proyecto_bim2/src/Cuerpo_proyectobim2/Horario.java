package Cuerpo_proyectobim2;
import java.io.*;
public class Horario {
    public class crear_archivo {
        public static void crear_horario(String nombre) {
            File archivo = new File(nombre);
            try {
                PrintWriter salida = new PrintWriter(archivo);
                salida.close();
                System.out.println("Archivo creado con exito");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            }
        }
        public static void escribir_archivo(String nombre, String contenido){
        File archivo = new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));//-> Esta es una forma de escribir varias veces en el mismo archivo
            salida.println(contenido);
            salida.close();
            System.out.println("Se escribio en el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {            // -> Se agrego este catch ya que la segunda forma de escribir el archivo puede generar otro tipo de error 
            ex.printStackTrace(System.out);
        }
    }
        public static void leer(String nombre) {
            File archivo = new File(nombre);
            BufferedReader leer;
            try {
                leer = new BufferedReader(new FileReader(archivo));
                String lectura = leer.readLine();
                while (lectura != null) {
                    System.out.println(lectura);
                    lectura = leer.readLine();
                }
                leer.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace(System.out);
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
}
