package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class BrutalSwing extends PhysicalMove {

    public BrutalSwing(){
        this.type = Type.DARK;
        this.accuracy = 100;
        this.power = 60;
    }

    @Override
    protected String describe() {
        return "Использует Brutal Swing";
    }
}
