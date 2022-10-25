package Pokemons;

import Attacks.Charge_Beam;

public class Raichu extends Pikachu{

    public Raichu(String name, int level) {
        super(name, level);

        this.setStats(60, 90, 55, 90, 80, 110);

        this.addMove(new Charge_Beam());
    }
}
