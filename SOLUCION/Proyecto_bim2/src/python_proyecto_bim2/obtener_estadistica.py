# Esta funcion permite obtener la estadistica de las entradas vendidas por dia
# y el total de entradas vendidas en dias con eventos y en dias sin eventos
# la funcion recibe 7 parametros que son las entradas vendidas por dia
# y retorna el valor maximo y minimo de entradas vendidas por dia
# y una tabla con las entradas vendidas por dia
# y el total de entradas vendidas en dias con eventos y en dias sin eventos
# y el total de entradas vendidas
def estadistica(matriz):
    total_general = matriz[0]+matriz[1]+matriz[2]+matriz[6]
    total_eventos = matriz[3]+matriz[4]+matriz[5]
    total_entradas = sum(matriz) #Metodo que permite sumar todos los valores de una lista
    mayor = max(matriz[0], matriz[1], matriz[2], matriz[3], matriz[4], matriz[5], matriz[6])
    menor = min(matriz[0], matriz[1], matriz[2], matriz[3], matriz[4], matriz[5], matriz[6])
    print('Valor maximo de entradas vendidas por dia: ',mayor)
    print('Valor minimo de entradas vendidas por dia: ', menor)
    print("""
    +--------------+---------------+------------------+---------------+----------------+----------------+----------------+
    |    LUNES     |     MARTES    |     MIERCOLES    |     JUEVES    |     VIERNES    |     SABADO     |     DOMINGO    |
    +--------------+---------------+------------------+---------------+----------------+----------------+----------------+""")
    print("    |    ",matriz[0],"    |     ",matriz[1],"   |      ",matriz[2],"      |     ",matriz[3],"    |     ",matriz[4],"    |     ",matriz[5],"    |     ",matriz[6],"    |")
    print('    +--------------+---------------+------------------+---------------+----------------+----------------+----------------+')
    print('Total de entradas vendidas:' , total_entradas)
    print('Total de entradas vendidas por eventos:' , total_eventos)
    print('Total de entradas vendidas en dias sin eventos: ' , total_general)