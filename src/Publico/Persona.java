/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Publico;

/**
 *
 * @author Ingles
 */
import javax.swing.JOptionPane;

public class Persona {
    
    int altura=10;
    public int largo=30;
    final int ojos=2;
    
    public static void main(String[] args){
        
        Persona juan= new Persona();
        //System.out.println(juan.altura);
        
        juan.altura= 20;
        //System.out.println(juan.altura);
        
        Persona pedro= new Persona();
        System.out.println(juan.altura);
        System.out.println(juan.largo);
        System.out.println(juan.ojos);
        System.out.println(pedro.altura);
        System.out.println(pedro.largo);
        System.out.println(pedro.ojos);
        
        JOptionPane.showMessageDialog(null,"JUAN\n" + "Altura: " + juan.altura + "\nLargo: " + juan.largo + "\nOjos: " + juan.ojos );
        JOptionPane.showMessageDialog(null,"PEDRO\n" + "Altura: " + pedro.altura + "\nLargo: " + pedro.largo + "\nOjos: " + pedro.ojos );
    }
    
}
