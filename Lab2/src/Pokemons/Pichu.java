package Pokemons;

import Attacks.ChargeBeam;
import Attacks.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {
    public Pichu(String name, int level) {
        super(name, level);

        this.addType(Type.ELECTRIC);

        this.setStats(20, 40, 15, 35, 35, 60);

        this.setMove(new TailWhip(), new ChargeBeam());

    }




}
