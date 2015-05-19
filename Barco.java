/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Javier
 */
public class Barco {
        public Barco (){
        int[][] tablero;
        tablero = new int[10][10];
        for(int in=0; in<10 ; in++)
        {
            for(int j=0; j<10; j++)
            {
                tablero[in][j]=0;
            }
        }
        int C; //variable aleatoria que me determina si el barco va vertical u horizontal
        C =  (int) (2*Math.random());  //0 vertical  y 1 horizontal //0 vertical  y 1 horizontal //0 vertical  y 1 horizontal //0 vertical  y 1 horizontal //0 vertical  y 1 horizontal //0 vertical  y 1 horizontal //0 vertical  y 1 horizontal //0 vertical  y 1 horizontal
        if(C==1)
        {
            int i;
            i=(int) (9 * Math.random());
            int j;
            j= (int) (9 * Math.random());
            while(j >=5 || tablero[i][j]!=0 || tablero[i][j+1]!=0 || tablero[i][j+2]!=0 || tablero[i][j+3]!=0 || tablero[i][j+4]!=0)
            {
               j= (int) (9 * Math.random()); 
               i=(int) (9 * Math.random());
                  System.out.println(1);
             
            }
            tablero[i][j]=1;
            tablero[i][j+1]=1;
            tablero[i][j+2]=1;
            tablero[i][j+3]=1;
            tablero[i][j+4]=1;
        }
        else
        {
            int i;
            i=(int) (9 * Math.random());
            int j;
            j= (int) (9 * Math.random());
            while(i >=5 || tablero[i][j]!=0 || tablero[i+1][j]!=0 || tablero[i+2][j]!=0 || tablero[i+3][j]!=0 || tablero[i+4][j]!=0)
            {
               j= (int) (9 * Math.random()); 
               i=(int) (9 * Math.random());
                  System.out.println(2);
                
            }
            tablero[i][j]=1;
            tablero[i+1][j]=1;
            tablero[i+2][j]=1;
            tablero[i+3][j]=1;
            tablero[i+4][j]=1;
        }
        // barco de tamaño 4
        C = (int) (2*Math.random()); //0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal//0 vertical  y 1 horizontal
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
                  System.out.println(3);
             
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
                  System.out.println(4);
            }
            tablero[i][j]=1;
            tablero[i+1][j]=1;
            tablero[i+2][j]=1;
            tablero[i+3][j]=1;
        }
        //barco de tamaño 3 
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
                       System.out.println(5);
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
                       System.out.println(6);
                }
            tablero[i][j]=1;
            tablero[i+1][j]=1;
            tablero[i+2][j]=1;
            }
        }
        //barco tamaño 2
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
                       System.out.println(7);
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
                       System.out.println(8);
                }
                tablero[i][j]=1;
                tablero[i+1][j]=1;
            }
            String[][] tablero1;
            tablero1 = new String[10][10];
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
            for(int i=0 ;i<10; i++)
            {
                for(int j=0; j<10; j++)
                {
                    System.out.print(tablero1[i][j]);
                }
                System.out.println(" ");
            }
        
        
    }

}
        //para localizar barco de tamaño 5 
        