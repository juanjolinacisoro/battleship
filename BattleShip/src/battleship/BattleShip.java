/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author Usuario
 */
public class BattleShip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Barco barco1 = new Barco();
        String[][] tableroBarco1 = barco1.getTableroLetra();
        
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                System.out.print(tableroBarco1[i][j]);
            }
            System.out.println("");
        }
    }
    
}
