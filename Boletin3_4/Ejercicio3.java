package Boletin3_4;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
       int cantidadtotal, cantidadcien, cantidadveinte,cantidadcinco,cantidaduno;
       Scanner sc = new Scanner(System.in);
       System.out.println("Dime un número y te doy el cambio");
       cantidadtotal = sc.nextInt();
       cantidaduno = cantidadtotal;
       cantidadcien = (cantidaduno-cantidaduno%100)/100;
       cantidaduno = cantidaduno%100;
       cantidadveinte = (cantidaduno-cantidaduno%20)/20;
       cantidaduno = cantidaduno%20;
       cantidadcinco = (cantidaduno-cantidaduno%5)/5;
       cantidaduno = cantidaduno%5;
       System.out.println("Tu cambio es: " + cantidadcien + " Billetes de cien " + cantidadveinte + " Billetes de veinte " + cantidadcinco + " Billetes de cinco " + cantidaduno + " Monedas de uno" );
       
    }
    
}
