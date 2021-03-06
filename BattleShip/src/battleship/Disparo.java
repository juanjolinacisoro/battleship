
/**
 * @author David Revillot <drevillot10@alumnos.utalca.cl> 
 */
package battleship;


   /*
    Atributos de la clase disparo. Posee los atributos disparojugadorxx(posicion x del disparo),
    disparojugadory(posicion y del disparo),a(Definicion de variable binaria,a=1 disparo validado, 0 no validado),
    disparos(tablero que contiene los disparos) y jugador( no se utiliza)
    */

class Disparo  
{
    
    public int DisparoJugadorX;
    public int DisparoJugadorY;
    public int Jugador;
    String[][] Disparos;
    int a;
    
    //Constructor de la clase disparo
    public Disparo()
    {
        //Se inicializan los atributos de la clase disparo
        DisparoJugadorX = 0;
        DisparoJugadorY = 0;
        Disparos = new String [10][10];
        a=0;
    }   
   
    /**
    Metodo de la clase disparo que valida los disparos del jugador y de la cpu
    @param x y tablero  el metodo recibe la posicion x e y  del tablero que se desea validar
    @return a  Si el disparo esta dentro del tablero se retorna 1(Disparo validado).En caso contrario se retorna 0(disparo no validado)
    @version Definitiva
    */
    
   int validardisparo(int x, int y,String[][] tablero) // que no se repita y este dentro del tablero
   {
       //AsignaciÃ³n de datos a los atributos de la clase
       this.DisparoJugadorX = x;
       this.DisparoJugadorY = y;
       this.Disparos = tablero;
       
       if(DisparoJugadorX<=9 && DisparoJugadorX>=0&& Disparos[DisparoJugadorX][DisparoJugadorY]!="X"&& Disparos[DisparoJugadorX][DisparoJugadorY]!="H")
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
