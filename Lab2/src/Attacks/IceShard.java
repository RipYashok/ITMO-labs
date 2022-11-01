package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class IceShard extends PhysicalMove {

    public IceShard() {
        this.type = Type.ICE;
        this.accuracy = 100;
        this.power = 40;
        this.priority = +1;
    }
    @Override
    protected String describe(){
        return "использует Ice Shard";
    }
}
