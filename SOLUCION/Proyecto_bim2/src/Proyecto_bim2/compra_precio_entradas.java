//El paquete Proyecto_bim2 para importar los java class entre si y poder utilizar sus metodos
package Proyecto_bim2;
//Se importa la libreria para que el usuario pueda ingresar datos
import java.util.Scanner;
//Se importa el metodo que va a calcular la estadistica de las entradas vendidas
import static Proyecto_bim2.obtener_estadistica.*;

public class compra_precio_entradas {
    //Metodo para vender y calcular la cantidad de entradas vendidas segun el dia y la hora 
    public static void compra(Scanner teclado, int var1, int var2) {
        int lunes=0,martes=0,miercoles=0,jueves=0,viernes=0,sabado=0,domingo=0; //Variblables que se van a importar a otro metodo para realizar calculos
        //Variables utilizadas en este metodo 
        int dia = 0;
        double hora = 0;
        String condicion = " ", mes = " ";
        boolean seguir = true;
        //Se solicita al usuario fecha y hora para comprobar que tipo de entrada se puede vender 
        System.out.print("Dime para que dia es la entrada: ");
        dia = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Dime para que mes quieres la entrada: ");
        mes = teclado.nextLine();
        //El ciclo se va a repetir hasta que el usuario decida no comprar mas
        while (seguir) {
            if (mes.equalsIgnoreCase("agosto") || mes.equalsIgnoreCase("septiembre")) {
                //Comprobar los dias de eventos y lo que no lo son
                switch (dia) {
                    case 30: case 31: case 5: case 6: case 7: //Dias de eventos
                        //Comprobar la hora para determinar si es evento o no
                        System.out.print("Dime la hora a la que vas ir(Recuerada que el horario se maneja de 24hr no 12hr por lo cual 3pm = 15pm): ");
                        hora = teclado.nextDouble();
                        //Comprobar la hora de la compra de la entrada, para determinar si son eventos o no
                        if (hora >= 5.00 && hora <= 23.59) {
                            var2++;
                        }else{
                            var1++;
                        }
                        //Comprobar que dia exactamente se realizo la compra de las entradas, para generar estadistica
                        if(dia == 5)
                            jueves++;
                        else if(dia == 30 || dia ==  6)
                            viernes++;
                        else if(dia == 31 || dia ==  7)
                            sabado++;
                        break;
                    case 1: case 2: case 3: case 4: case 8: //Dias normales
                        var1++;
                        //Comprobar el dia exacto durante los dias sin eventos
                        if(dia == 1 || dia ==8)
                            domingo++;
                        else if(dia == 2)
                            lunes++;
                        else if(dia == 3)
                            martes++;
                        else if(dia == 4)
                            miercoles++;
                        break;
                        //Si no es ningun dia de los anteriores se imprime un mensaje de error
                    default:
                        System.out.print("Dia no valido");
                }
                System.out.println("¿Quieres ingresar los datos para comprar otra entrada?(SI/NO)");
                condicion = teclado.nextLine();
                if (condicion.equalsIgnoreCase("no")) 
                    seguir = false;
            } else {
                System.out.print("El mes ingresado no es valido");
            }
            //Se llama al submetodo que va a calcular el precio, esto se hace dentro del submetodo que vende las entradas ya que una vez finalice este metodo los valores no se guardan
            //porque no estamos usando variables en el metodo main, si no variables temporales dentro de los submetodos
            precio(var1, var2);
            //Se lo llama dentro de este metodo para utilizar las varibles temporales creadas
            estadistica(lunes, martes, miercoles, jueves, viernes, sabado, domingo);
        }
    }
    //Metodo para calcular el precio de las entradas segun el numero de ventas
    //Esto nos ahorra el calculo en el metodo principal y nos permite utilizar el total de entradas vendidas para otros objetivos como la estadistica de las entradas
    public static void precio(int var1, int var2){
        //Declarcion de las variables temporales que se van a utilizar en este metodo
        double precio_general = 2.50, precio_eventos = 5.00, total_general = 0, total_eventos = 0, precio_total = 0;
        //Calculo del precio total de las entradas
        total_general = precio_general * var1;
        //Calculo del precio total de las entradas de eventos
        total_eventos = precio_eventos * var2;
        //Calculo del precio total de las entradas
        precio_total = total_general + total_eventos;
        //Impresion de los datos obtenidos
        System.out.println("Precio por entradas generales: " + total_general+"$");
        System.out.println("Precio por entradas de eventos: " +  total_eventos+"$");
        System.out.println("Precio total: "+(precio_total)+"$");
    }
}