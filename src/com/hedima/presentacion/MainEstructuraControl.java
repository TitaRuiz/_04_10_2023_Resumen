package com.hedima.presentacion;

import java.util.Scanner;

public class MainEstructuraControl {

    public static void main(String[] args) {
        //Estructura if
        //Condicion
        int numero = 7;
        if (numero%3==0) {
            System.out.println("El número es multiplo de 3");
        }else {
            System.out.println("El número NO es multiplo de 3");
        }
        Scanner s1 = new Scanner(System.in);
        System.out.println("Escriba un numero entre 0 y 9999");
        numero = s1.nextInt();
        if(numero>=0 && numero<=9999){
            int cifras = String.valueOf(numero).length();
            System.out.println("El número tiene "+cifras+" cifras");
        }else {
            System.out.println("Valor inválido");
        }
        System.out.println("Escriba un numero entre 0 y 9999");
        numero = s1.nextInt();
        if(numero>=0 && numero<=9999){
            if(numero<10){
                System.out.println("El número tiene una cifra");
            } else if (numero < 100) {
                System.out.println("El número tiene dos cifra");
            } else if (numero < 1000) {
                System.out.println("El número tiene tres cifra");
            }else{
                System.out.println("El número tiene cuatro cifra");
            }
        }else {
            System.out.println("Valor inválido");
        }
    }
}
