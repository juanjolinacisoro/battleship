/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] numero = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
        String[] pinta= {"diamante","pica","corazon","trebol"};
        
        int x = (int) (Math.random()*13);
        int y = (int) (Math.random()*4);
        
        System.out.println("tu carta es: " +numero[x] );
        System.out.println("de:" +pinta[y]);
        
    }
    
}
