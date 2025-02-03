package Proyecto_bim2; //El paquete nos va a ayudar a modularizar el ejercicio en varios java class
import java.util.Scanner;
import static Proyecto_bim2.compra_precio_entradas.*; //Se importan los java class para que se realicen los procesos que se encuentran codificados
//import static Proyecto_bim2.compra_precio_entradas_automatico.*; //-> Este metodo va a realizar lo mismo que el anterior pero de manera automatica para la demostracion en la exposicion
//Metodo principal para imprimir los datos
public class Principal {
    public static void main(String[] args) {
        int entradas_normales = 0, entradas_eventos = 0;
        Scanner teclado = new Scanner(System.in);
        compra(teclado, entradas_normales, entradas_eventos);     
        //compra_automatica(entradas_eventos, entradas_eventos);
    }
}