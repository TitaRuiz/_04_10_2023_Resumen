package com.hedima.presentacion;

import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Escriba un numero que represente el mes");
        int mes = s1.nextInt();
        if (mes>=1 && mes<=12){
            switch (mes) {
                case 2:
                    System.out.println("Tiene 28 dias");
                    break;
                case 4, 6, 9, 11:
                    System.out.println("Tienen 30 dias");
                    break;
                default:
                    System.out.println("Tiene 31 días");

            }
        }else{
            System.out.println("mes invvalido");
        }
    }
}
