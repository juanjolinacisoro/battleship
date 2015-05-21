/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BattleShip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x = 0;
        int y = 0;
        int jugador = 1;
        Scanner leer= new Scanner(System.in);
        boolean Ganador = false;// variable que determina un ganador
        //INICIO DEL JUEGO    
        //Generar el tablero del jugador
        Barco barco1 = new Barco();
        String[][] tableroJugador = barco1.getTableroLetra();
        //Generar el tablero de la Cpu
        Barco barco2 = new Barco();
        String[][] tableroCpu = barco2.getTableroLetra();
        // Imprimir en pantalla los tableros iniciales en la modalidad que puede ver el jugador
        Interfaz interfaz1 = new Interfaz();
        interfaz1.MostrarTablero(tableroCpu, tableroJugador);
        //Comenzar a jugar. "j" representa el jugador.
        while (Ganador == false) 
        {
            int validar;
            validar=0;
            if(jugador == 1)
            {
                //Genera el disparo del jugador
                while(validar == 0)
                {
                    System.out.println("Ingrese la pocision x del disparo");
                    x =leer.nextInt();
                    System.out.println("Ingrese la pocision y del disparo");
                    y =leer.nextInt();
                    Disparo disp= new Disparo();
                    validar = disp.validardisparo(x, y, tableroCpu);
                }
                Tablero tablero = new Tablero();
                tableroCpu = tablero.actualizarTablero(x, y, tableroCpu);
                Ganador = tablero.hayGanador(tableroCpu);
                jugador = 2;
            }
            else
            {
                //Genera el disparo del Cpu
                while(validar == 0)
                {
                    InteligenciaArtificial ia = new InteligenciaArtificial();
                    ia.PrepararDisparo(tableroJugador);
                    x = ia.Dispararx();
                    y = ia.Disparary();
                    Disparo disp= new Disparo();
                    validar=disp.validardisparo(x, y, tableroJugador);
                }
                Tablero tablero1 = new Tablero();
                tableroJugador = tablero1.actualizarTablero(x, y, tableroJugador);
                Ganador = tablero1.hayGanador(tableroJugador);
                jugador=1;
            }
            Interfaz inter = new Interfaz();
            inter.MostrarTablero(tableroCpu, tableroJugador);
        }
    }
    
}
