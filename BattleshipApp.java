
package batteshipapp;


public class BatteshipApp {

    
    public static void main(String[] args) {
    Batteship bs;
    bs= new Batteship();
    
    bs.agregarJugador("Jugador");
    bs.agregarJugador("Computador");
    
    while(bs.hayGanador()!=null){
        bs.step();
        }
    }
    }
    
