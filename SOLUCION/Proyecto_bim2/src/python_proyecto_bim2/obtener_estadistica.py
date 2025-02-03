# Esta funcion permite obtener la estadistica de las entradas vendidas por dia
# y el total de entradas vendidas en dias con eventos y en dias sin eventos
# la funcion recibe 7 parametros que son las entradas vendidas por dia
# y retorna el valor maximo y minimo de entradas vendidas por dia
# y una tabla con las entradas vendidas por dia
# y el total de entradas vendidas en dias con eventos y en dias sin eventos
# y el total de entradas vendidas
def estadistica(var1,var2,var3,var4,var5,var6,var7):
    total_general = var1+var2+var3+var7
    total_eventos = var4+var5+var6
    total_entradas = var1 + var2 + var3 + var4 + var5 + var6 + var7
    mayor = max(var1, var2, var3, var4, var5, var6, var7)
    menor = min(var1, var2, var3, var4, var5, var6, var7)
    print('Valor maximo de entradas vendidas por dia: ',mayor)
    print('Valor minimo de entradas vendidas por dia: ', menor)
    print("""
    +------------+-------------+----------------+-------------+--------------+--------------+--------------+
    |   LUNES    |    MARTES   |    MIERCOLES   |    JUEVES   |    VIERNES   |    SABADO    |    DOMINGO   |
    +------------+-------------+----------------+-------------+--------------+--------------+--------------+""")
    print("    |   ",var1,"   |    ",var2,"   |     ",var3,"     |    ",var4,"   |    ",var5,"    |    ",var6,"    |    ",var7,"    |")
    print('    +------------+-------------+----------------+-------------+--------------+--------------+--------------+')
    print('Total de entradas vendidas:' , total_entradas)
    print('Total de entradas vendidas por eventos:' , total_eventos)
    print('Total de entradas vendidas en dias sin eventos: ' , total_general)