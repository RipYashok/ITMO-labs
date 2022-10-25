package Attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Ice_Shard extends PhysicalMove {

    public Ice_Shard() {
        this.type = Type.ICE;
        this.accuracy = 100;
        this.power = 40;
        this.priority = +1;
    }
}
