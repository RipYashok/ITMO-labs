package Pokemons;

import Attacks.IceBeam;
import Attacks.IceShard;
import Attacks.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Snorunt extends Pokemon {

    public Snorunt(String name, int level) {
        super(name, level);

        this.addType(Type.ICE);

        this.setStats(50, 50, 50, 50, 50, 50);


        this.setMove(new IceShard(), new IceBeam(), new Rest(50));
    }
}
