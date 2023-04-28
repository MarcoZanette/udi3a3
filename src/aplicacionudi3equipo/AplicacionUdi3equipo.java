/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionudi3equipo;
import java.util.Scanner;
/**
 *
 * @author SUPCOMERCIO
 */
public class AplicacionUdi3equipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        String nombre, apellido;
        
        System.out.print("Ingrese su nombre: ");
        nombre=scan.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido=scan.nextLine();
        
        System.out.println("Bienvenido/a " + nombre + " " + apellido);
        
    }
    
}
