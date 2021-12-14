package Boletin3_1;

import java.util.Scanner;

public class Primerproxecto {

    public static void main(String[] args) {
      float PrecioProductoOriginal;
      float PrecioProductoDescontado;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dime el precio original del producto");
      PrecioProductoOriginal = sc.nextFloat();
      System.out.println("Dime el precio descontado del producto");
      PrecioProductoDescontado = sc.nextFloat();
      System.out.println("El porcentaje de descuento de tu producto es: " + ((100*PrecioProductoDescontado)/PrecioProductoOriginal) + "%");
        
        
    }
    
}
