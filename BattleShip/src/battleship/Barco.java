package battleship;

/**
 *
 * @author Javier gomez
 */
public class Barco  /*esta clase asigna de manera aleatoria los barcos en el 
tablero de ambos jugadores Se asigna una matriz de 10x10, despues a esta matriz 
se rellena con 0, en este caso el 0 significa agua. Luego se colocan los barcos,
el primer barco que se coloca es el de tamaÃ±o 5, luego el de tamaÃ±o 4, los 2  de
tamaÃ±o 3 y finalmente el de tamaÃ±o 2. La manera de asignar los barcos es la 
siguiente, primero se genera un nÃºmero aleatorio en donde si este nÃºmero es 1 el 
barco se gana de manera horizontal  caso contrario se gana de manera vertical. 
Luego se asigna una coordenada al azar de donde ira la primera posicion del 
barco, en caso de ser vertical es desde esa posicion hacia abajo, en caso de ser
horizontal es de esa posicion hasta la derecha. asignaro un cuadrante se 
verifica que no este fuera del tablero y que no haya un barco en esas 
posiciones, caso contrario se asigna  una nueva posicion. Esto ocurre para cada
uno de los tamaÃ±os de los barcos
    
*/
{
        int[][] tablero; //declaracion de un tablero
        String[][] tablero1; //declaracion del segundo tablero
        
        public Barco()
        {
            this.tablero = new int[10][10];  //se dice que el tablero es de 10x10
            this.tablero1 = new String[10][10]; //se dice el tablero 1 es de 10x10
            this.inicializarTablero();  //se crea el metodo inicializar tablero
        }
        
        public void inicializarTablero()
        {
            for(int in=0; in<10 ; in++) //se recorre el tablero, el cual inicialmente va a tener puros 0, los cuales representan el agua
            {
                for(int j=0; j<10; j++)
                {
                    tablero[in][j]=0;
                }
            }
            //primero se asigna el barco de tamaÃ±o 5
            int C; //variable aleatoria que me determina si el barco va vertical u horizontal
            C =  (int) (2*Math.random());  //0 vertical  y 1 horizontal 
            if(C==1)   //en caso de que sea horizontal
            {
                int i;
                i=(int) (9 * Math.random()); //se asigna una coordenada i al azar
                int j;
                j= (int) (9 * Math.random()); //se asigna una coordenada j al azar
                while(j >=5 || tablero[i][j]!=0 || tablero[i][j+1]!=0 || tablero[i][j+2]!=0 || tablero[i][j+3]!=0 || tablero[i][j+4]!=0) //si j es mayor a 5 el barco no cabe en el tablero y si las piezas que vienen mas abajo no son agua no se puede colocar el barco
                {
                   j= (int) (9 * Math.random());  //se asigna una nueva coordenada en caso de que haya un barco ya asignado o el barco no caiga en el tablero
                   i=(int) (9 * Math.random()); //se asigna una nueva coordenada

                }
                //en caso de que las coordenadas donde esta el barco no se salgan de margen y que en esas coordenadas a no hay un barco instalado se procese a actualizar la matriz.
                //el 1 representa que existe en barco
                tablero[i][j]=1; 
                tablero[i][j+1]=1;
                tablero[i][j+2]=1;
                tablero[i][j+3]=1;
                tablero[i][j+4]=1;
            }
            else
            {
                //este caso representa el mismo anterior pero con los barcos colocados de manera vertical
                int i;
                i=(int) (9 * Math.random());
                int j;
                j= (int) (9 * Math.random());
                while(i >=5 || tablero[i][j]!=0 || tablero[i+1][j]!=0 || tablero[i+2][j]!=0 || tablero[i+3][j]!=0 || tablero[i+4][j]!=0)
                {
                   j= (int) (9 * Math.random()); 
                   i=(int) (9 * Math.random());

                }
                tablero[i][j]=1;
                tablero[i+1][j]=1;
                tablero[i+2][j]=1;
                tablero[i+3][j]=1;
                tablero[i+4][j]=1;
            }
            // barco de tamaÃƒÂ±o 4
            C = (int) (2*Math.random()); //0 vertical  y 1 horizontal
            if(C==1)
            {
                int i;
                i=(int) (9 * Math.random());
                int j;
                j= (int)(9 * Math.random());
                while(j >=6 || tablero[i][j]!=0 || tablero[i][j+1]!=0 || tablero[i][j+2]!=0 || tablero[i][j+3]!=0 )
                {
                  j= (int) (9 * Math.random()); 
                   i=(int) (9 * Math.random()); 

                }
                tablero[i][j]=1;
                tablero[i][j+1]=1;
                tablero[i][j+2]=1;
                tablero[i][j+3]=1;
            }
            else
            {
                int i;
                i=(int) (9 * Math.random());
                int j;
                j= (int) (9 * Math.random());
                while(i >=6 || tablero[i][j]!=0 || tablero[i+1][j]!=0 || tablero[i+2][j]!=0 || tablero[i+3][j]!=0 )
                {
                   j= (int) (9 * Math.random()); 
                   i=(int) (9 * Math.random()); 
                }
                tablero[i][j]=1;
                tablero[i+1][j]=1;
                tablero[i+2][j]=1;
                tablero[i+3][j]=1;
            }
            //barco de tamaÃƒÂ±o 3 
            for(int n=0; n<2 ; n++)
            {
                 C = (int) (2*Math.random()); //0 vertical  y 1 horizontal
                if(C==1)
                {
                    int i;
                    i=(int)(9 * Math.random());
                    int j;
                    j= (int) (9 * Math.random());
                    while(j >=7 || tablero[i][j]!=0 || tablero[i][j+1]!=0 || tablero[i][j+2]!=0 )
                    {
                        j= (int) (9 * Math.random()); 
                        i=(int) (9 * Math.random()); 
                    }
                    tablero[i][j]=1;
                    tablero[i][j+1]=1;
                    tablero[i][j+2]=1;
                }
                else
                {
                    int i;
                    i=(int) (9 * Math.random());
                    int j;
                    j= (int) (9 * Math.random());
                    while(i >=7 || tablero[i][j]!=0 || tablero[i+1][j]!=0 || tablero[i+2][j]!=0 )
                    {
                        j= (int) (9 * Math.random()); 
                        i=(int) (9 * Math.random()); 
                    }
                tablero[i][j]=1;
                tablero[i+1][j]=1;
                tablero[i+2][j]=1;
                }
            }
            //barco tamaÃƒÂ±o 2
            C = (int) (2*Math.random()); //0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal
                if(C==1)
                {
                    int i;
                    i=(int) (9 * Math.random());
                    int j;
                    j= (int) (9 * Math.random());
                    while(j >=8 || tablero[i][j]!=0 || tablero[i][j+1]!=0 )
                    {
                        j= (int) (9 * Math.random()); 
                        i=(int) (9 * Math.random()); 
                    }
                    tablero[i][j]=1;
                    tablero[i][j+1]=1 ;
                }
                else
                {
                    int i;
                    i=(int) (9 * Math.random());
                    int j;
                    j= (int) (9 * Math.random());
                    while(i >=7 || tablero[i][j]!=0 || tablero[i+1][j]!=0 )
                    {
                        j= (int) (9 * Math.random()); 
                        i=(int) (9 * Math.random());
                    }
                    tablero[i][j]=1;
                    tablero[i+1][j]=1;
                }
 
                for(int i=0 ;i<10; i++)
                {
                    for(int j=0; j<10; j++)
                    {
                        if(tablero[i][j]==0)
                        {
                            tablero1[i][j]="O";
                        }
                        else
                        {
                            tablero1[i][j]="B";
                        }

                    }
                }
        }
        
        public int[][] getTableroNumero()
        {
            return this.tablero;
        }
        public String[][] getTableroLetra()
        {
            return this.tablero1;
        }

}