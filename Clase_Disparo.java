
package battleship;

class Disparo  
{
    //Atributos de la clase disparo. Posee los atributos disparojugadorx(posición x del disparo),
    //disparojugadory(posición y del disparo),a(Definición de variable binaria,a=1 disparo validado, 0 no validado),
    //disparos(tablero que contiene los disparos) y jugador( no se utiliza)
    public int disparojugadorx;
    public int disparojugadory;
    public int jugador;
    String[][] disparos;
    int a;
    
    //Constructor de la clase disparo
    public Disparo()
    {
        //Se inicializan los atributos de la clase disparo
        disparojugadorx = 0;
        disparojugadory = 0;
        disparos = new String [10][10];
        a=0;
    }   
   //Método de la clase disparo que valida los disparos del jugador y de la cpu, el método recibe la posicion x e y
    //del tablero que se desea validar
   int validardisparo(int x, int y,String[][] tablero) // que no se repita y este dentro del tablero
   {
       //Asignación de datos a los atributos de la clase
       this.disparojugadorx = x;
       this.disparojugadory = y;
       this.disparos = tablero;
       
       if(disparojugadorx<=9 && disparojugadorx>=0&& disparos[disparojugadorx][disparojugadory]!="X"&& disparos[disparojugadorx][disparojugadory]!="H")
       {
           //Si el disparo esta dentro del tablero se retorna 1(Disparo validado)
           a=1;
           return a;
       }
       else
       {
           //En caso contrario se retorna 0(disparo no validado)
           return a;
       }
   } 
}

