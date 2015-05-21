package battleship;
import java.util.Random;
/**
 *
 * @Autor Flavio Encina <fencina0@alumnos.utalca.cl> 
 */
public class InteligenciaArtificial 
{
    Random rnd = new Random();
    int x; // Disparo que se generará en x
    int y; // Disparo que se generará en y
    int n; // Variable que me permite salir de la revisión de la matriz si genera un disparo.
    String[][] tablero;//Matriz que me muestra el tablero del jugador
    boolean[] entrar; // Variable que me permite no repetir la busqueda hacia una dirección
   public InteligenciaArtificial()
   {
       x = 0;
       y = 0;
       n = 0;
       tablero = new String[10][10];
       entrar = new boolean [4];
   }
   // Este metodo crea un disparo 
   /*
    Metodo de la clase disparo que intenta buscar un barco una vez que se sabe que se le ha disparado.
    @Parametros el metodo recibe el  tablero
    @Version Definitiva
    */
   
   public void PrepararDisparo(String[][] tableroJugador)
   {
       this.tablero = tableroJugador;
       //Iniciar el proceso de busqueda para que entre a los cuatro for de cada dirección
       for (int i = 0; i < 4; i++) 
       {
          entrar[i]=false; 
       }
       //Generar disparo en caso de que se este buscando un barco
       for (int i = 0;n<=3 &&(entrar[0]==false||entrar[1]==false||entrar[2]==false||entrar[3]==false) && i < 10; i++) 
       {
           for (int j = 0;n<=3&&(entrar[0]==false||entrar[1]==false||entrar[2]==false||entrar[3]==false) && j < 10; j++) 
           {
               if(tablero[i][j] == "H")
               {
                    while(n<=3 && (entrar[0]==false||entrar[0]==false||entrar[1]==false||entrar[2]==false||entrar[3]==false))
                    {
                        // permite entrar aleatoriamente a una dirección de busqueda.
                        n=(int)(rnd.nextDouble() * 4.0);
                        // Busca Hacia abajo.
                        for (int k = 1;n == 0 && entrar[0]==false; k++) 
                        {
                            
                            if(j+k<10)
                            {
                                //Eliminar la opciones verticales cuando se sabe que el barco esta horizontal.
                               if(tablero[i][j+k]=="O"||tablero[i][j+k]=="B")
                               {
                                   x = i;
                                   y = j+k;
                                   n = 4;
                               }
                               else if(tablero[i][j+k]== "X")
                               {
                                   entrar[0]=true;
                               }
                            }
                            else
                            {
                                entrar[0]=true;
                            }
                        }
                        //Busca Hacia arriba
                        for (int k = 1;n == 1 && entrar[1]==false; k++) 
                        {
                            if(j-k >= 0)
                            {
                                if(tablero[i][j-k]=="O"||tablero[i][j-k]=="B")
                                {
                                    x = i;
                                    y = j-k;
                                    n = 4;
                                }
                                else if(tablero[i][j-k]== "X")
                                {
                                    entrar[1]=true;
                                }
                            }
                            else
                            {
                                entrar[1]=true;
                            }
                        }
                        //Busca Hacia derecha
                        for (int k = 1;n == 2 && entrar[2]==false; k++) 
                        {
                            if(i+k < 10)
                            {
                                if(tablero[i+k][j]=="O"||tablero[i+k][j]=="B")
                                {
                                    x = i+k;
                                    y = j;
                                    n = 4;
                                }
                                else if(i-k>=0 && tablero[i-k][j]== "X")
                                {
                                    entrar[2]=true;
                                }
                            }
                            else
                            {
                                entrar[2]=true;
                            }
                        }
                        //Busca Hacia izquierda
                        for (int k = 1;n == 3 && entrar[3]==false ; k++) 
                        {
                            if(i-k >= 0)
                            {
                                if(tablero[i-k][j]=="O"||tablero[i-k][j]=="B")
                                {
                                    x = i-k;
                                    y = j;
                                    n = 4;
                                }
                                else if(tablero[i-k][j]== "X")
                                {
                                    entrar[3]=true;
                                }
                            }
                            else
                            {
                                entrar[3]=true;
                            }
                        }
                    }
               }
           }
       }
   }
   //Este metodo indica que si encontro un disparo que retorne la parte x sino que genere un x entre 0 y 9 
   public int Dispararx()
   {
       if(n!=4)
       {
            x = (int)(rnd.nextDouble() * 10.0);
            return x;
       }
       else
       {
           return x;
       }
   }
   //Este metodo indica que si encontro un disparo que retorne la parte y sino que genere un y entre 0 y 9 
   public int Disparary()
   {
       if(n!=4)
       {
            y = (int)(rnd.nextDouble() * 10.0);
            return y;
       }
       else
       {
           return y;
       }
   }
}