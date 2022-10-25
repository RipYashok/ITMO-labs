package Pokemons;

import Attacks.Charge_Beam;
import Attacks.Tail_Whip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {
    public Pichu(String name, int level) {
        super(name, level);

        this.addType(Type.ELECTRIC);

        this.setStats(20, 40, 15, 35, 35, 60);

        this.setMove(new Tail_Whip(), new Charge_Beam());

    }




}
