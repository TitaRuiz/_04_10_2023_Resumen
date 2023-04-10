package com.hedima.presentacion;


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Variable primitivas
        float precio = 10.5f;
        System.out.println("Mi variable float tiene el valor de "+ precio);
        char estado='z';
        System.out.println("Variable de tipo char "+ estado);
        long val=123_456L;
        System.out.println("Variable de tipo long "+ val);
        float valor2=34_005.87f;
        System.out.println("Variable de tipo float "+ valor2);
        System.out.println(valor2);

        //Variables de tipo referencia
        String hoy="hoy es lunes de pascua";
        System.out.println(hoy);
        System.out.println(hoy.toUpperCase());
        System.out.println("("+hoy.substring(7,12)+")");
        System.out.println(hoy.indexOf("lunes"));
        System.out.println(hoy.indexOf("lunes")+"lunes".length());
        System.out.println("("+hoy.substring(hoy.indexOf("lunes"),hoy.indexOf("lunes")+"lunes".length())+")");
        //Scanner
        Scanner s1 = new Scanner(System.in);
//        System.out.println("Escriba su edad -> ");
//        int edad = s1.nextInt();
//
//        System.out.println("Escriba su profesion -> ");
//        String profesion = s1.next();
//        System.out.println("Su profesion es ->" + profesion);

        //Variables de referencia para fechas
        LocalDate fNacimiento = LocalDate.of(1992, 8,30);
        System.out.println("Fecha de nacimiento " + fNacimiento);
        System.out.println(fNacimiento.plusYears(1));
        System.out.println("Su edad es -> " + Period.between(fNacimiento,LocalDate.now())+")");
        System.out.println("Su edad es -> " + Period.between(fNacimiento,LocalDate.now()).getYears()+")");
    }
}