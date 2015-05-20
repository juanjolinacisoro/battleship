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
public class Interfaz  
{
    String[][] tableroJugador; //Atributos que recibe esta clase.
    String[][] tableroCpu;
    
    public Interfaz ()
    {
        this.tableroJugador = new String [10][10]; //Constructor del tablero.
        this.tableroCpu = new String [10][10];
    }
    //Con el siguiente metodo se dibuja el interfaz donde se desarrollara
    public void MostrarTablero(String[][] tableroCpu,String[][] tableroJugador)
    {
        
        for(int i=0 ; i<23 ; i++) //Con este ciclo pretendemos "limpiar" la pantalla, aúnque lo que realiza es imprimir la misma cantidad de lineas que contiene el tablero cosa de no mostrar el tablero anterior.
        {
            System.out.println();
        }
        this.tableroJugador = tableroJugador;
        this.tableroCpu = tableroCpu;
        
        System.out.println("**TABLERO COMPUTADOR**  || ******TU TABLERO*****");
        System.out.println("   0 1 2 3 4 5 6 7 8 9  ||  0 1 2 3 4 5 6 7 8 9 ");
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("  +-+-+-+-+-+-+-+-+-+-+ || +-+-+-+-+-+-+-+-+-+-+");
            System.out.print(+i +" ");    
            for (int j = 0; j < 10; j++) 
            {
                if(tableroCpu[i][j]=="B")                    
                    System.out.print("|O");
                else
                    System.out.print("|" +tableroCpu[i][j]);
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
