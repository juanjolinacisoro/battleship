package battleship;

/**
 *
 * @author Juanjo_Linacisoro <jlinacisoro10@alumnos.utalca.cl>
 */


public class Interfaz 
{
    /*
    La clase Interfaz recibe 2 atributos, los cuales son tableroJugador y tableroCpu.
    Ambas son arreglos de 10x10, donde el primero representa el tablero del jugador y el segundo el tablero del computador.
    */
    String[][] tableroJugador;
    String[][] tableroCpu;
    //Constructor de la clase Interfaz.
    public Interfaz ()
    {
        //InicializaciÃ³n de los atributos de esta clase.
        this.tableroJugador = new String [10][10];
        this.tableroCpu = new String [10][10];
    }
    
    /*
    Metodo para desarrollar la Interfaz del juego, es decir un arreglo de 10x10 casillas, enumeradas del 0 al 9.
    @Version Final
    */
    public void MostrarTablero(String[][] tableroCpu,String[][] tableroJugador)
    {
       for(int i=0 ; i<23 ; i++) //Con este ciclo pretendemos "limpiar" la pantalla, aÃºnque lo que realiza es imprimir la misma cantidad de lineas que contiene el tablero cosa de no mostrar el tablero anterior.
        {
            System.out.println();
        }
        this.tableroJugador = tableroJugador;
        this.tableroCpu = tableroCpu;
        
        System.out.println("**TABLERO COMPUTADOR**|| ******TU TABLERO*****");
        System.out.println("   0 1 2 3 4 5 6 7 8 9  || 0 1 2 3 4 5 6 7 8 9 ");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("  +-+-+-+-+-+-+-+-+-+-+ || +-+-+-+-+-+-+-+-+-+-+");
            System.out.print(+i +" ");    
            for (int j = 0; j < 10; j++) 
            {
                if(tableroCpu[i][j]=="B")
                {
                    System.out.print("|O");
                }
                else
                {
                    System.out.print("|" +tableroCpu[i][j]);
                }
            }
            System.out.print("| || ");
            for (int j = 0; j < 10; j++) 
            {
                System.out.print("|"+tableroJugador[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("  +-+-+-+-+-+-+-+-+-+-+ || +-+-+-+-+-+-+-+-+-+-+");
    }
}
