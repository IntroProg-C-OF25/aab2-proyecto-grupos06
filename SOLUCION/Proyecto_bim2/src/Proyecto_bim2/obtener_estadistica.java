package Proyecto_bim2;
public class obtener_estadistica {
    //Declaracion del metodo que se va a encargar del calculo y impresion de las estadisticas recaudadas
    public static void estadistica(int matriz[]){
        int mayor=0, menor=0, total_entradas=0,total_general=0,total_eventos=0;
        //Funciones de tipo Math que van a iterarse repetitivamente de derecha a izquiera comprobando todos los valores para encontrar max y min
        mayor = Math.max(matriz[0], Math.max(matriz[1], Math.max(matriz[2], Math.max(matriz[3], Math.max(matriz[4], Math.max(matriz[5], matriz[6]))))));
        menor = Math.min(matriz[0], Math.min(matriz[1], Math.min(matriz[2], Math.min(matriz[3], Math.min(matriz[4], Math.min(matriz[5], matriz[6]))))));
        //Para encontrar el valor de todas las entradas ventidas idependientemente del dia se suma todas las variables
        for (int i = 0; i < matriz.length; i++) {
            total_entradas += matriz[i];
        }
        //Para el total general solo se suman los dias donde solo se pueden vender entradas generales
        total_general = (matriz[0]+matriz[1]+matriz[2]+matriz[6]);
        //Para el total eventos se realiza lo mismo pero solo los dias de eventos
        total_eventos = (matriz[3]+matriz[4]+matriz[5]);
        System.out.println("Valor maximo de entradas vendidas por dia: " + mayor);
        System.out.println("Valor minimo de entradas vendidas por dia: " + menor);
        //Se imprime en una matriz los valores obtenidos en cada dia de la semana, esto se realizo en el metodo compra del java class compra_precio_entradas
        System.out.println("""
                            +---------------+----------------+-------------------+----------------+-----------------+-----------------+-----------------+
                            |     LUNES     |     MARTES     |     MIERCOLES     |     JUEVES     |     VIERNES     |      SABADO     |     DOMINGO     |
                            +---------------+----------------+-------------------+----------------+-----------------+-----------------+-----------------+""");
        System.out.print("|     "+matriz[0]+"     |      "+matriz[1]+"     |        "+matriz[2]+"      |     "+matriz[3]+"      |      "+matriz[4]+"      |      "+matriz[5]+"      |       "+matriz[6]+"     |");
        System.out.print("\n+---------------+----------------+-------------------+----------------+-----------------+-----------------+-----------------+\n");
        System.out.println("Total de entradas vendidas: " + total_entradas);
        System.out.println("Total de entradas vendidas por eventos: " + total_eventos);
        System.out.println("Total de entradas vendidas en dias sin eventos: " + total_general);
    }
}