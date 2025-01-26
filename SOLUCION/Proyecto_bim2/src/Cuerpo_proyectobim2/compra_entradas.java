//Este java class va a comprobar las compras de los boletos y si la fecha de la compra esta permitida segun la fecha. 
package Cuerpo_proyectobim2;

import java.util.Scanner;

public class compra_entradas {

    public static void entradas(Scanner teclado) {
        //Definir precios en variables en caso de querer cambiar
        double precio = 0, precio_general = 2.50, precio_evento = 5.00, precio_3ra_edad = 1.50;
        double hora = 0;
        int dia = 0, edad = 0, cantidad_entradas = 0;
        boolean seguir = true;
        String mes = " ";
        //El usuario va a decidir cuando parar el ingreso de datos
        while (seguir) {
            //Solicitar los datos al usuario
            System.out.print("Dime para que dia es la entrada: ");
            dia = teclado.nextInt();
            System.out.print("Dime la hora a la que vas ir(Recuerada que el horario se maneja de 24hr no 12hr por lo cual 3pm = 15pm): ");
            hora = teclado.nextDouble();
            System.out.print("Dime para que mes quieres la entrada: ");
            mes = teclado.nextLine();
            //Comprobar que los meses sean los correctos
            if (mes.equalsIgnoreCase("agosto") || mes.equalsIgnoreCase("septiembre")) {
                //Comprobar los dias de eventos y lo que no lo son
                switch (dia) {
                    case 30, 31, 5, 6, 7:
                        //Comprobar la hora de la compra de la entrada, para determinar si son eventos o no
                        if (hora >= 5.00 && hora <= 2.00) {
                            precio += precio_evento;
                        } else if (edad > 12 && edad < 65) {
                            precio += precio_general;
                        } else if (edad <= 12) {
                            precio += 0;
                        } else if (edad >= 65 && edad <= 100) {
                            precio += precio_3ra_edad;
                        } else {
                            System.out.print("Edad no disponible");
                        }
                        break;
                    case 1, 2, 3, 4, 8:
                        if (edad > 12 && edad < 65) {
                            precio += precio_general;
                        } else if (edad <= 12) {
                            precio += 0;
                        } else if (edad >= 65 && edad <= 100) {
                            precio += precio_3ra_edad;
                        } else {
                            System.out.print("Edad no disponible");
                        }
                        break;
                    default:
                        System.out.print("Dia no habil");
                    //Queremos generar facturas pero en otro metodo
                }
            }
        }
    }
}
