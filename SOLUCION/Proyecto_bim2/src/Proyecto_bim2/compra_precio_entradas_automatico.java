//El paquete es necesario para importar los java class entre si y poder utilizar sus metodos
package Proyecto_bim2;
//Se importa el procedimiento para calcular el precio el cual se definio en el compra_precop_entradas manual, reutilizando codigo
import static Proyecto_bim2.compra_precio_entradas.precio;
//Se importa el metodo que va a calcular la estadistica de las entradas vendidas
import static Proyecto_bim2.obtener_estadistica.*;
//Se importa la libreria que va a generar numeros aleatorios
import java.util.Random;

public class compra_precio_entradas_automatico {

    //Metodo que vende las entradas de forma automatica, se generan numeros aleatorios
    public static void compra_automatica(int var1, int var2) {
        int dias[]=new int[7]; //Matriz que se va a importar a otro metodo para realizar calculos
        //Variables utilizadas en este metodo 
        Random random = new Random();
        int dia = 0, limite = 100000, hora = 0;
        String mes = " ";
        //Se solicita al usuario fecha y hora para comprobar que tipo de entrada se puede vender 
        for (int i = 0; i < limite; i++) {
            dia = random.nextInt(8) + 1; // Días del 1 al 8
            hora = random.nextInt(24);   // Horas de 0 a 23
            mes = (random.nextBoolean()) ? "agosto" : "septiembre"; // Selecciona aleatoriamente
            // Guardar en la matriz
            if (mes.equalsIgnoreCase("agosto") || mes.equalsIgnoreCase("septiembre")) {
                //Comprobar los dias de eventos y lo que no lo son
                switch (dia) {
                    case 30:case 31:case 5:case 6:case 7: //Dias de eventos
                        //Comprobar la hora de la compra de la entrada, para determinar si son eventos o no
                        if (hora >= 5.00 && hora <= 23.59) {
                            var2++;
                        } else {
                            var1++;
                        }
                        //Comprobar que dia exactamente se realizo la compra de las entradas, para generar estadistica
                        if(dia == 5)
                            dias[3]++;
                        else if(dia == 30 || dia ==  6)
                            dias[4]++;
                        else if(dia == 31 || dia ==  7)
                            dias[5]++;
                        break;
                    case 1:case 2:case 3:case 4:case 8: //Dias normales
                        var1++;
                        //Comprobar el dia exacto durante los dias sin eventos
                        if(dia == 1 || dia ==8)
                            dias[6]++;
                        else if(dia == 2)
                            dias[0]++;
                        else if(dia == 3)
                            dias[1]++;
                        else if(dia == 4)
                            dias[2]++;
                        break;
                    default:
                        System.out.print("Dia no valido");
                }
            } else {
                System.out.print("El mes ingresado no es valido");
            }
        }
        //Se llama al submetodo que va a calcular el precio, esto se hace dentro del submetodo que vende las entradas ya que una vez finalice este metodo los valores no se guardan
        //porque no estamos usando variables en el metodo main, si no variables temporales dentro de los submetodos
        precio(var1, var2);
        //Se lo llama dentro de este metodo para utilizar las varibles temporales creadas
        estadistica(dias);
    }
}
