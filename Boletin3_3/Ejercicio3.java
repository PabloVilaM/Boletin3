package Boletin3_3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
      int CantidadBilletesCien, CantidadBilletesVeinte, CantidadBilletesCinco, CantidadMonedasUno;
      Scanner sc = new Scanner(System.in);
      System.out.println("Dime la cantidad de billetes de cien, veinte, cinco y monedas de uno (en ese orden)");
      CantidadBilletesCien = sc.nextInt();
      CantidadBilletesVeinte = sc.nextInt();
      CantidadBilletesCinco= sc.nextInt();
      CantidadMonedasUno= sc.nextInt();
      System.out.println("Tu cantidad total de dineor es: " + (CantidadBilletesCien*100+CantidadBilletesVeinte*20+CantidadBilletesCinco*5+CantidadMonedasUno) + "€");  
        
        
    }
    
}
