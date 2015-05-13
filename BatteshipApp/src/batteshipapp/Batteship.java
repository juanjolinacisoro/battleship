package BatteshipApp;

import java.util.ArrayList;
import java.util.List;

public class Batteship {
    Tablero b;
    List<Jugador> jugadorList;
    Jugador ganador;
    int jugadores;
    
    public Batteship(){
        b= new Baraja(1);// new baraja usando semilla
        jugadorList = new ArrayList();
        b.reordenar();
        jugadores=0;
        ganador=null;

    }


    public Jugador hayGanador() {
        int enCompetencia=0;
            for (Jugador j:jugadorList){
                if(j.getContinua()){
                    enCompetencia++;
                }
                //System.out.println(j);
        }
            if (enCompetencia==1)
                return ganador;
    return null;
    }

  
    public void agregarJugador(String nombre){
        this.jugadorList.add(new Jugador(this,nombre));
        jugadores++;
    }
    
    void step(){
        for (Jugador j:jugadorList){
            j.robar();
            System.out.println(j);
        }
        
    }
    
}