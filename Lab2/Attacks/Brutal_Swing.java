package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Brutal_Swing extends PhysicalMove {

    public Brutal_Swing(){
        this.type = Type.DARK;
        this.accuracy = 100;
        this.power = 60;
    }
}
