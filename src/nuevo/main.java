/*
Escriba un programa para determinar si un solicitante puede lograr un préstamo. Deberá pedir los siguientes
datos para cada solicitante: Nombre, historia crediticia  (“b” buena o “m” mala), cantidad pedida, salario anual, y valor de otras propiedades.
El banco asigna un número de folio de la solicitud del préstamo. El banco solo considerará a los solicitantes con un estado de crédito bueno.  De aquellos,
solo aceptara los que tengan más de 6 puntos.  Los puntos se obtienen como sigue:

5 puntos si el salario es 50% del préstamo o más.

3 puntos si el salario es por lo menos 25% pero menos de 50% del préstamo.

1 punto si el salario es por lo menos 10% pero menos de 25% del préstamo.

5 puntos si se tiene otra propiedad del doble del préstamo o más.

3 puntos si se tiene otra propiedad igual al préstamo pero menor del doble.

Utiliza una lista para guardar la información del solicitante. Si el solicitante tiene más de 6 puntos en los criterios
 para aceptar su solicitud, almacena en una pila o cola el número de la solicitud de préstamo.
 Muestra los datos de la solicitud que fue aprobada, utilizando una pila o cola. Y ver el orden en que son notificadas las solicitudes aceptadas.

 */

package nuevo;

import java.util.Scanner;

public class main {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int puntos1=5, puntos2=3, puntos3=1, puntos4=5, puntos5=3;
        int opcion=0;
        int salarioAnual=0;
        int valorCasa=0;
        int contador=0;
        int prestamo=0;
        int aleaotorio;
        aleaotorio = (int)(Math.random()*100);

        Persona persona = new Persona("BancoUPCHIAPAS","San Jose suchiapa num: 055","UP mejora tu vida",
                "Bueno", "Jhair Alejandro","Cruz Palacios",06,10,1999,
                "Jhair@gmail.com","4588");

        System.out.println("Bienvenido Generando numero de fila");
        do {
            System.out.println(persona.getNombreBanco());
            System.out.println("    --MENU--");
            System.out.println("1. Ver informacion personal");
            System.out.println("2. Solicitar Prestamo");
            System.out.println("3. Informacion de prestamo");
            System.out.println("4. Informacion guardada en pila");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println(persona.getDireccionBanco());
            System.out.println(persona.getFraseBanco());
            System.out.println(persona.getDireccionBanco());
            System.out.println("Que desea hacer: ");
            System.out.println(" ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:     //Ver informacion personal
                    System.out.println(persona.mostrarDatosPersona());
                    break;

                case 2:     //solicitar prestamo
                    System.out.println("Ingrese los siguientes datos");

                    System.out.println("Cantidad de prestamo: ");
                    prestamo = entrada.nextInt();

                    System.out.println("Salario anual: ");
                    salarioAnual = entrada.nextInt();

                    if (salarioAnual >= (prestamo/2)){  //listo     50% = 5 puntos
                        contador += puntos1;
                    }
                    else if (salarioAnual == (25*prestamo/100)){  // listo  25% = 3 puntos
                        contador += puntos2;
                    }
                    else if (salarioAnual == (10*prestamo)/100){    // listo 10% = 1 punto
                        contador += puntos3;
                    }

                    System.out.println("valor de propiedad (Casa): ");
                    valorCasa = entrada.nextInt();

                    if (valorCasa >= (prestamo*2)){     // listo  valor de la casa el doble = 5 puntos
                        contador += puntos4;
                    }
                    else if (valorCasa >= (prestamo)&&(valorCasa < prestamo) ){       // igual al prestamo pero menor al doble = 3 puntos
                        contador += puntos5;
                    }

                    System.out.println("Puntos obtenidos");
                    if (contador >= 6){
                        System.out.println(contador);
                        System.out.println("La solicitud de prestamo fue aprovada");
                    }
                    else {
                        System.out.println(contador);
                        System.out.println("Lo sentimos no cuenta con los recursos necesarios para un prestamo");
                    }
                    break;


                case 3:     //Informacion prestamo
                    if (contador==0){
                        System.out.println("No ha solicitado ningun prestamo");
                    }
                    else if (contador < 6){
                        System.out.println("Lo sentimos no tuvo lo requisitos necesarios para un prestamo");
                    }
                    else {
                        System.out.println("Su prestamo fue aceptado");
                        System.out.println("Informacion del prestamo");
                        System.out.println("Puntos obtenidos: "+contador);
                        System.out.println("Cantidad solicitada: $"+prestamo);
                        System.out.println("Salario anual: "+salarioAnual);
                        System.out.println("Valor de propiedad: "+valorCasa);
                    }

                    break;

                case 4:
                    if (contador<=5){
                    System.out.println("Lo sentimos esta opcion no esta disponible");
                }
                    else {
                        Pila pila = new Pila(1);
                        pila.agregar("Num. de solicitud de prestamo: "+aleaotorio);
                        pila.agregar("Guarde el numero de solicitud para cualquier duda");
                        System.out.println(pila.mostrarCima());
                        System.out.println(pila.vacio());
                        System.out.println(pila.extraer());
                        System.out.println(pila.vacio());
                        System.out.println(pila.extraer());
                    }

                    break;


                case 5:
                    break;

                default:
                    System.out.println("Error 404");
            }

        }while (opcion != 5);

    }
}
