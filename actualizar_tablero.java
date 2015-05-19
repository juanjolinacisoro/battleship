/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Javier
 */
public class actualizar_tablero {
    public actualizar_tablero () //debiera de pedir el tablero actual y el disparo
    {
        
        int disparojugadorx = 4; // se supone que va el lugar validado
        int disparojugadory = 5; // se supone que va el tiro validado
        String[][] tablero1;
        tablero1 = new String[10][10]; //este se supone es el tablero actual
        switch(tablero1[disparojugadorx][disparojugadory])
        {
            case "O":
            tablero1[disparojugadorx][disparojugadory]= "X"; //X representa disparo en el agua  
            break;
            case "B":
            tablero1[disparojugadorx][disparojugadory]= "H"; //H representa disparo en el barco
            break;
                
        }
    }
}
