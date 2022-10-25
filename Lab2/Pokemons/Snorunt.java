package Pokemons;

import Attacks.Ice_Beam;
import Attacks.Ice_Shard;
import Attacks.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Snorunt extends Pokemon {

    public Snorunt(String name, int level) {
        super(name, level);

        this.addType(Type.ICE);

        this.setStats(50, 50, 50, 50, 50, 50);


        this.setMove(new Ice_Shard(), new Ice_Beam(), new Rest(50));
    }
}
