package com.hedima.presentacion;

import java.util.Scanner;

public class MainBucle {
    public static void main(String[] args) {
        for(int i = 1; i <=10;i++) {
            System.out.print(i+", ");
        }
        Scanner s1= new Scanner(System.in);
        int suma= 0;

//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Introduce el número: " + i + "-> ");
//            int numero = s1.nextInt();
//            suma = suma + numero;
//        }
//        System.out.println("Suma "+ suma);
        System.out.println("Ejercicio 2");
        for (int i=100;i>=1;i--){
            System.out.print(i+ ", ");
        }
        System.out.println("---Ejercicio 3 ---");
        System.out.println("Introducir numero ");

        int numero = s1.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(numero+" x "+i+" = "+numero*i);
        }


    }
}
