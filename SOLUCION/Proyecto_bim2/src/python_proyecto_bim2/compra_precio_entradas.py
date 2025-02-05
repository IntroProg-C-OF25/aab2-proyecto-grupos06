import obtener_estadistica
#Definicion del metodo utilizado 
def compra(var1, var2):
    dias = [0,0,0,0,0,0,0] #Vamos a usar la misma lista que en java para una mejor comprension
    #Variables usadas en este metodo
    dia = 0
    hora = 0
    #Se solicita al usuario la fecha y hora para comprobar que tipo de entrada se va a vender'
    dia = int(input('Dime para que dia es la entrada: '))
    mes = input('Dime para que mes quieres la entrada: ')
    #El ciclo se va a repetir hasta que el usuario no quiera ingresar mas datos
    while True:
        #Condicional para comprobar si el mes ingresado es valido
        if mes.lower() in {'agosto','septiembre'}:
            #Comprobar si el dia se van a desarrollar eventos
            if dia in {30,31,5,6,7}: #Dias de eventos
                    #Comprobar la hora para verificar que tipo de entrada se va a vender 
                    hora = float(input('Dime la hora a la que vas ir(Recuerada que el horario se maneja de 24hr no 12hr por lo cual 3pm = 15pm): '))
                    if hora >= 5.00 and hora <= 23.59:
                        var2+=1 #En caso de venta obligatoria de entrada de eventos
                    else:
                        var1+=1 #En caso de que no sea obligatoria la venta de entrada de eventos
                    #Se comprueba el dia exacto para generar la estadistica
                    if dia == 5:
                        dias[3]+=1
                    elif dia in {30,6}:
                        dias[4]+= 1
                    elif dia in {31,7}:
                        dias[5]+=1
            #Dias en los que no se desarrolla ningun evento
            elif dia in {1,2,3,4,8}:
                var1+=1
                #Comprobar el dia exacto
                if dia in {1,8}:
                    dias[6]+=1
                elif dia == 2:
                    dias[0]+= 1
                elif dia == 3:
                    dias[1]+=1
                elif dia == 4:
                    dias[2] += 1
                else: #En caso de que el dia ingresado no este dentro del rango
                    print('Dia no valido')
        #Comprobar si el usuario quiera ingresar o no mas datos
        condicion = input('¿Quieres ingresar los datos para otra compra?').lower()
        if condicion == 'no':
            break #En caso que el usuario no quiera ingresar mas datos 
    #Invocacion de los metodos 
    precio(var1,var2)
    print(obtener_estadistica.estadistica(dias))
#Funcion que calcula el precio de las entradas
def precio(var1, var2):
    precio_general = 2.50
    precio_eventos = 5.00 
    total_general = precio_general * var1
    #Calculo por el total de ventas de entradas generales
    total_eventos = precio_eventos * var2
    #Calculo del total por entrada de eventos
    precio_total = total_general + total_eventos
    #Calculo del precio total de las entradas
    print('Total por entradas generales: ', total_general,'$')
    print('Total por entradas de eventos: ', total_eventos,'$')
    print('Total general: ', precio_total,'$')