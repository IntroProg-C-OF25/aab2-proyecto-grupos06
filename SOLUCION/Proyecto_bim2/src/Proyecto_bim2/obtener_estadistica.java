package Proyecto_bim2;
public class obtener_estadistica {
    //Declaracion del metodo que se va a encargar del calculo y impresion de las estadisticas recaudadas
    public static void estadistica(int var1,int var2,int var3,int var4,int var5,int var6,int var7){
        int mayor=0, menor=0, total_entradas=0,total_general=0,total_eventos=0;
        //Funciones de tipo Math que van a iterarse repetitivamente de derecha a izquiera comprobando todos los valores para encontrar max y min
        mayor = Math.max(var1, Math.max(var2, Math.max(var3, Math.max(var4, Math.max(var5, Math.max(var6, var7))))));
        menor = Math.min(var1, Math.min(var2, Math.min(var3, Math.min(var4, Math.min(var5, Math.min(var6, var7))))));
        //Para encontrar el valor de todas las entradas ventidas idependientemente del dia se suma todas las variables
        total_entradas = (var1+var2+var3+var4+var5+var6+var7);
        //Para el total general solo se suman los dias donde solo se pueden vender entradas generales
        total_general = (var1+var2+var3+var7);
        //Para el total eventos se realiza lo mismo pero solo los dias de eventos
        total_eventos = (var4+var5+var6);
        System.out.println("Valor maximo de entradas vendidas por dia: " + mayor);
        System.out.println("Valor minimo de entradas vendidas por dia: " + menor);
        //Se imprime en una matriz los valores obtenidos en cada dia de la semana, esto se realizo en el metodo compra del java class compra_precio_entradas
        System.out.println("""
                            +---------+----------+-------------+----------+-----------+-----------+-----------+
                            |  LUNES  |  MARTES  |  MIERCOLES  |  JUEVES  |  VIERNES  |   SABADO  |  DOMINGO  |
                            +---------+----------+-------------+----------+-----------+-----------+-----------+""");
        System.out.print("|  "+var1+"   |   "+var2+"   |     "+var3+"    |  "+var4+"    |   "+var5+"    |   "+var6+"    |    "+var7+"   |");
        System.out.print("\n+---------+----------+-------------+----------+-----------+-----------+-----------+\n");
        System.out.println("Total de entradas vendidas: " + total_entradas);
        System.out.println("Total de entradas vendidas por eventos: " + total_eventos);
        System.out.println("Total de entradas vendidas en dias sin eventos: " + total_general);
    }
}