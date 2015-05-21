
package battleship;

/**
 *
 * @author Juanjo_Linacisoro <jlinacisoro10@alumnos.utalca.cl>
 */
public class Tablero 
{
    /*
    Los atributos de esta clase Tablero son disparojugadorx(PosiciÃ³n de la coordenada x del disparo, disparojugadory (PosiciÃ³n de la coordenada y del disparo), tablero1 (ActualizaciÃ³n del tablero)
    */
    public int disparojugadorx;
    public int disparojugadory;
    public String[][] tablero1;
    
    
    public Tablero () //debiera de pedir el tablero actual y el disparo
    {
        /*
        InicializaciÃ³n de los atributos de esta clase.
        */
        this.disparojugadorx =0; // se supone que va el lugar validado
        this.disparojugadory =0; // se supone que va el tiro validado
        this.tablero1= new String[10][10];
    }
    
    public String[][] actualizarTablero(int x, int y, String[][] tablero)
    {
    /*
    Metodo de la clase Tablero actualiza la matriz dependiendo se se a acertado a algÃºn disparo con una "H" o en caso contrario se bombardeo al agua (representado con una "X").
    @Param el metodo recibe la posicion x e y  del tablero que se desea validar
    @Return verdadero si se alcanza la suma de puntos para ganar, o falso si aÃºn no se llega a ese puntaje.
    @Version Final
    */
        this.disparojugadorx = x; // se supone que va el lugar validado
        this.disparojugadory = y; // se supone que va el tiro validado
        this.tablero1=tablero;
        
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
    public boolean hayGanador(String[][] tablero)
    {
        this.tablero1 = tablero;
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
        
        if(aciertos == 17)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}