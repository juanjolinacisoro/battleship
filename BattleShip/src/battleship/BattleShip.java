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
        int x = 0; // Inicializa el disparo en x 
        int y = 0; // Inicializa el disparo en y
        int jugador = 1; // Indica que comienza disparando el jugador y no la computadora si jugador=2 dispara la computadora
        Scanner leer= new Scanner(System.in);//Permitir la lectura por teclado
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
            int validar; //Permite validar un disparo
            validar=0;
            if(jugador == 1)//Realiza el juego del jugador o player
            {
                //Genera el disparo del jugador
                while(validar == 0)// pide disparos hasta que sean validos
                {
                    System.out.println("Ingrese la pocision x del disparo");
                    x =leer.nextInt();
                    System.out.println("Ingrese la pocision y del disparo");
                    y =leer.nextInt();
                    Disparo disp= new Disparo();// Genera la instancia para la clase disparo
                    validar = disp.validardisparo(x, y, tableroCpu);// Llama al metodo para validar el disparo entregado
                }
                //Actualiza el tablero del Cpu ya que recibió un disparo
                Tablero tablero = new Tablero();
                tableroCpu = tablero.actualizarTablero(x, y, tableroCpu);
                //Pregunta si gana el jugador
                Ganador = tablero.hayGanador(tableroCpu);
                jugador = 2;
            }
            else
            {
                //Genera el disparo del Cpu
                while(validar == 0)// Genera disparos hasta que se encuentre uno valido
                {
                    //En un comienzo solo dispara al azar, pero cuando encuentra un barco trata de buscarlo cerca
                    InteligenciaArtificial ia = new InteligenciaArtificial();
                    ia.PrepararDisparo(tableroJugador);
                    x = ia.Dispararx();
                    y = ia.Disparary();
                    
                    // Valida el disparo de la Cpu.
                    Disparo disp= new Disparo();
                    validar=disp.validardisparo(x, y, tableroJugador);
                }
                //Actualiza el tablero del jugador una vez generado el disparo de la computadora
                Tablero tablero1 = new Tablero();
                tableroJugador = tablero1.actualizarTablero(x, y, tableroJugador);
                //Pregunta si gana el computador
                Ganador = tablero1.hayGanador(tableroJugador);
                jugador=1;
            }
            // Imprime los tableros actualizados.
            Interfaz inter = new Interfaz();
            inter.MostrarTablero(tableroCpu, tableroJugador);
        }
    }
    
}
