package Pokemons;

import Attacks.Confuse_Ray;
import ru.ifmo.se.pokemon.Type;

public class Froslass extends Snorunt{


    public Froslass(String name, int level) {
        super(name, level);

        this.setType(Type.ICE, Type.GHOST);

        this.setStats(70, 80, 70, 80, 70, 110);

        this.addMove(new Confuse_Ray());
    }
}
