package com.company;

public class FuncionesDeControl {

    public static void main(String[] args) {

        String estacion= "primavera";

        if (estacion == "primavera"){
            System.out.println("Es primavera");
        } else if (estacion == "verano"){
            System.out.println("Es verano");
        } else {
            System.out.println("Es otra estación");
        }

        System.out.println("-------------------------------------------------------------------------------------");

        double calificacion;
        calificacion = notas(4.5,4.8,4.9)/3;
        System.out.println("la calificacion obtenida por el estudiante es: " + calificacion);

        if (calificacion >=3 && calificacion <4) {
            System.out.println("sobresaliente");
        } else if (calificacion >=4 && calificacion <=5) {
            System.out.println("Excelente");
        } else{
            System.out.println("Reprobo");
        }



    }

    public static double notas (double n1, double n2, double n3) {return n1+n2+n3;}

}
