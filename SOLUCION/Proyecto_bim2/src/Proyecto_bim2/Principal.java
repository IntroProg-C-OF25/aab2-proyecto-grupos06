/***
 * Proyecto: Gestion de entradas de la feria de Loja
 * Autores : Jorge Quito/David González
 */
package Proyecto_bim2; //El paquete nos va a ayudar a modularizar el ejercicio en varios java class
import java.util.Scanner;
import static Proyecto_bim2.compra_precio_entradas.*; //Se importan los java class para que se realicen los procesos que se encuentran codificados
import static Proyecto_bim2.compra_precio_entradas_automatico.*; //-> Este metodo va a realizar lo mismo que el anterior pero de manera automatica para la demostracion en la exposicion
//Metodo principal para imprimir los datos
public class Principal {
    public static void main(String[] args) {
        int entradas_normales = 0, entradas_eventos = 0;
        Scanner teclado = new Scanner(System.in);
        compra(teclado, entradas_normales, entradas_eventos);     
        //compra_automatica(entradas_eventos, entradas_eventos);
    }
}
/***
 * Precio por entradas generales: 70050.0$
 * Precio por entradas de eventos: 59900.0$
 * Precio total: 129950.0$
 * Valor maximo de entradas vendidas por dia: 9933
 * Valor minimo de entradas vendidas por dia: 4937
 * +---------+----------+-------------+----------+-----------+-----------+-----------+
 * |  LUNES  |  MARTES  |  MIERCOLES  |  JUEVES  |  VIERNES  |   SABADO  |  DOMINGO  |
 * +---------+----------+-------------+----------+-----------+-----------+-----------+
 * |  4951   |   5021   |     5008    |  5034    |   5116    |   4937    |    9933   |
 * +---------+----------+-------------+----------+-----------+-----------+-----------+
 * Total de entradas vendidas: 40000
 * Total de entradas vendidas por eventos: 15087
 * Total de entradas vendidas en dias sin eventos: 24913
 * BUILD SUCCESSFUL (total time: 0 seconds)
 */