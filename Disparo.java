/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package battle;

/**
 *
 * @author Usuario
 */
class Disparo  
{
    public int disparojugadorx = 0;
    public int disparojugadory = 0;
    public int jugador = 0;
    int matrizjugador[][] = new int [10][10];
    int matrizcpu[][] = new int [10][10];
    int x=0;
    int y=0;
    
  
   int validardisparo() // que no se repita y este dentro del tablero
   {
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
