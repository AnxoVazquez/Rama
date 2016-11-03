package rama_fusion;

import javax.swing.JOptionPane;

public class Rama_fusion {

    public static void main(String[] args) {
        int opcion;
        System.out.println("Escoge la opcion que precises:");
        System.out.println("- Cuadrado (1)");
        System.out.println("- Triangulo (2)");
        System.out.println("- Circulo (3)");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija la opcion deseada: "));
        
        switch (opcion){
            
            case 1:
                int lado;
                lado = Integer.parseInt(JOptionPane.showInputDialog("Escriba el lado: "));
                System.out.println("- Cuadrado: " + lado * lado);
                break;
            case 2:
                int base, altura;
                base = Integer.parseInt(JOptionPane.showInputDialog("Escriba la base: "));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Escriba la altura: "));
                System.out.println("- Triangulo: " + (base * altura) / 2);
                break;
            case 3:
                int radio;
                radio = Integer.parseInt(JOptionPane.showInputDialog("Escriba el radio: "));
                System.out.println("- Circulo: " + Math.pow(radio, 2) * Math.PI );
                break;   
        }
    }
    
}