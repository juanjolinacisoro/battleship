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
class Disparo  
{
    public int disparojugadorx;
    public int disparojugadory;
    public int jugador;
    String[][] disparos;
    int a;
    
    public Disparo()
    {
        disparojugadorx = 0;
        disparojugadory = 0;
        disparos = new String [10][10];
        a=0;
    }   
  
   int validardisparo(int x, int y,String[][] tablero) // que no se repita y este dentro del tablero
   {
       this.disparojugadorx = x;
       this.disparojugadory = y;
       this.disparos = tablero;
       
       if(disparojugadorx<=9 && disparojugadorx>=0&& disparos[disparojugadorx][disparojugadory]!="X"&& disparos[disparojugadorx][disparojugadory]!="H")
       {
           a=1;
           return a;
       }
       else
       {
           return a;
       }
   } 
}

