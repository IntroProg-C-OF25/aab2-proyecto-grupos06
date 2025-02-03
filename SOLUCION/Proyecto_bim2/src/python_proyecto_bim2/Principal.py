"""
Proyecto: Gestion de entradas de la feria de Loja
Autores : Jorge Quito/David González

"""
import compra_precio_entradas # Se importa el otro modulo similar a java

#import compra_precio_entradas_automatico

#Se declaran las varibles que se van a insertar como parametros
entradas_normales = 0
entradas_eventos = 0
#Se imprime el metodo 

print(compra_precio_entradas.compra(entradas_normales,entradas_eventos))

#print(compra_precio_entradas_automatico.compra_automatica(entradas_normales,entradas_eventos))
"""
Total por entradas generales:  37275.0 $
Total por entradas de eventos:  75450.0 $
Total general:  112725.0 $
None
Valor maximo de entradas vendidas por dia:  6106
Valor minimo de entradas vendidas por dia:  2915

    +------------+-------------+----------------+-------------+--------------+--------------+--------------+
    |   LUNES    |    MARTES   |    MIERCOLES   |    JUEVES   |    VIERNES   |    SABADO    |    DOMINGO   |
    +------------+-------------+----------------+-------------+--------------+--------------+--------------+
    |    2988    |     2915    |      3058      |     2936    |     6106     |     6048     |     5949     |
    +------------+-------------+----------------+-------------+--------------+--------------+--------------+
Total de entradas vendidas: 30000
Total de entradas vendidas por eventos: 15090
Total de entradas vendidas en dias sin eventos:  14910
"""