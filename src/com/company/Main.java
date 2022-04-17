package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//mensajes en consola
        System.out.println("Hola Mundo");
        System.out.println("Vamos a sumar");

//suma
        int resultado_sum;
        resultado_sum = suma(8, 9);
        System.out.println("El resultado de la suma de a + b es:" + resultado_sum);

//producto

        int resul_producto;
        resul_producto = producto(2,4,8);
        System.out.println( "el resultado del producto es:" + resul_producto);

//division
        division(16,5);

        System.out.println("_________________________________________________________________________________________");

//operaciones varias
//PASO POR VALOR --> no recomendado porque duplica el tamaño en la memoria
        int num1=233; // 4 bytes
        int num2=154; // 4 bites
        operacion(num1,num2);


    }
//suma
    public static int suma(int a, int b) {
        return a +b;
    }
//producto
    public static int producto(int a, int b, int c){
        return  a*b*c;
    }

//división
    public static float division(float a, float b){
        float resul_div=a/b;
        System.out.println("el resultado de la division es:" + resul_div);

        return 0;
    }
// Otra forma simple

    public static void operacion(int a, int b){
        System.out.println("suma="+ (a+b));
        System.out.println("diferencia="+ (a - b));
        System.out.println("Producto="+ (a * b));
        System.out.println("division="+ (a / b));
    }


}



