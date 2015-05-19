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
    int[][] matrizjugador;
    int[][] matrizcpu;
    
    public Disparo()
    {
        disparojugadorx = 0;
        disparojugadory = 0;
        jugador = 0;
        matrizjugador= new int [10][10];
        matrizcpu= new int [10][10];
    }   
  
   int validardisparo(int x, int y, int j) // que no se repita y este dentro del tablero
   {
       this.disparojugadorx = x;
       this.disparojugadory = y;
       this.jugador = j;
       
       if(jugador%2==0)
       {
            if(disparojugadorx<=9 && disparojugadorx>=0&& disparojugadory<=9 && disparojugadory>=0)
            {
               if(matrizcpu[disparojugadorx][disparojugadory]==0)
               {
                   matrizcpu[disparojugadorx][disparojugadory]=1;
                   return 1;
               }
               else
               {
                   return 0;
               }
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if(disparojugadorx<=9 && disparojugadorx>=0&& disparojugadory<=9 && disparojugadory>=0)
            {
               if(matrizjugador[disparojugadorx][disparojugadory]==0)
               {
                   matrizjugador[disparojugadorx][disparojugadory]=1;
                   return 1;
               }
               else
               {
                   return 0;
               }
            }
            else
            {
                return 0;
            }
        }
   } 
}

