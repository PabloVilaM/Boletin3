package Boletin3_2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
      float Centigrados;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dime cuantos grados centigrados quieres pasar a Fahrenheit y Kelvin");
      Centigrados = sc.nextFloat();
      System.out.println("Tus grados Fahrenheit son: " + (Centigrados*1.8+32) + "º.Tus grados Kelvin son: " + (Centigrados+273) + "º");

        
        
    }
    
}
