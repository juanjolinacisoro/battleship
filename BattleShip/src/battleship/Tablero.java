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
public class Tablero 
{
    
    public int disparojugadorx;
    public int disparojugadory;
    public String[][] tablero1;
    
    
    public Tablero (int x, int y, String[][] tablero) //debiera de pedir el tablero actual y el disparo
    {
        
        this.disparojugadorx = x; // se supone que va el lugar validado
        this.disparojugadory = y; // se supone que va el tiro validado
        this.tablero1=tablero;
        
    }
    
    public String[][] actualizarTablero()
    {
        switch(tablero1[disparojugadorx][disparojugadory])
        {
            case "O":
            tablero1[disparojugadorx][disparojugadory]= "X"; //X representa disparo en el agua  
            break;
            case "B":
            tablero1[disparojugadorx][disparojugadory]= "H"; //H representa disparo en el barco
            break;
                
        }
        return this.tablero1;
    }
    public boolean hayGanador()
    {
        int aciertos = 0;
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                if(tablero1[i][j] == "H")
                {
                    aciertos++;
                }
            }
        }
        
        if(aciertos == 15)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}