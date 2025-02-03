#Se importa la libreria con las utilidades random para generar los datos de manera automatica
import random
#Se importa el metodo para obtener la estadistica 
import obtener_estadistica
#Se importa la funcion compra_venta_entradas para utilizar la funcion precio que esta en su estructura 
import compra_precio_entradas
#Se declara el metodo compra automatica que va a realizar el mismo procedimiento que la compra y venta normal solamente que no va a ingresar datos el usuario
def compra_automatica(var1, var2):
    #Declaracion de variables del metodo
    lunes = martes = miercoles = jueves = viernes = sabado = domingo = 0
    #Se crea una lista con el numero de dias habiles para aprovechar el tipo de iteracion de elementos que presenta python
    dias_habiles = [1,2,3,4,5,6,7,8,30,31]
    #Se declara otra lista con los meses disponibles 
    meses_disponibles = ['agosto','septiembre']
    #Se declara el ciclo for en un rango de 30000, esto significa que se van a generar 30000 datos
    for i in range(30000):
        #Se utiliza el random.choice con la lista dias_habiles como parametro para que escoja un dato aleatoria de entre toda la lista disponible
        dia = random.choice(dias_habiles)
        #Se utiliza el random.choice con la lista meses_disponibles para que escoja en cada iteracion un dato de los meses disponibles
        meses = random.choice(meses_disponibles)
        #De igual forma se utiliza una funcion de random para numeros de tipo float en el rango 5.00 a 23.59 
        hora = random.uniform(5.00,23.59)
        #Se comprueba el dia con la palabra reservada in, que permite iterar en una lista de elementos para determinar si un elemento especifico se encuentra en la misma 
        if dia in {30,31,5,6,7}:
            #Se comprueba la hora
            if hora >= 5.00 and hora <= 23.59:
                var2+=1
            else:
                var1+=1
            #Se comprueba el dia exacto para generar la estadistica
            if dia == 5:
                jueves+=1
            elif dia in {30,6}:
                viernes += 1
            elif dia in {31,7}:
                sabado+=1
        #Se recorre la lista de dias sin eventos 
        elif dia in {1,2,3,4,8}:
            var1+=1
            #Se comprueba el dia exacto 
            if dia in {1,8}:
                domingo+=1
            elif dia == 2:
                lunes += 1
            elif dia == 3:
                martes+=1
            elif dia == 4:
                miercoles += 1
            #En caso el dia no sea valido
            else:
                print('Dia no valido')
    #Se imprimen los metodos con las variables obtenidas
    print(compra_precio_entradas.precio(var1,var2)) #En especifico la funcion que calcula el precio
    print(obtener_estadistica.estadistica(lunes, martes,miercoles, jueves, viernes, sabado, domingo)) #Se imprime el metodo estadistica    
