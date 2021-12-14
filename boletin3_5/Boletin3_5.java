package boletin3_5;

import javax.swing.JOptionPane;

public class Boletin3_5 {

    public static void main(String[] args) {
        
        
      String soldof = JOptionPane.showInputDialog("Introduce tu soldo fijo");
        float soldof2 = Integer.parseInt(soldof);
        
         String ventas = JOptionPane.showInputDialog("Introduce lo ganado en ventas");
         float ventas2 = Integer.parseInt(ventas);
       float comision = (ventas2*5)/100;
       
       String quilo = JOptionPane.showInputDialog("Cuantos kilometros has hecho?");
       float quilo2 = Integer.parseInt(quilo);
       float quilometraje = (quilo2*2);
       
       String desp = JOptionPane.showInputDialog("Cuantos dias has estado desplazado?");
       float desp2 = Integer.parseInt(desp);
       float dietas = (30*desp2);
       
       float soldoBruto = dietas+comision+quilometraje+soldof2;
       
       float irpf = (soldoBruto*18)/100;
       float soldoResta = irpf-36;
       float soldoLiquido = soldoBruto-soldoResta;
       
        System.out.println("Soldobruto: " + soldoBruto + "\n Soldoliquido: " + soldoLiquido);
       
       
    }
    
}
