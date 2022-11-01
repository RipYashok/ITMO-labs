package Pokemons;

import Attacks.Growl;
import ru.ifmo.se.pokemon.Move;

public class Pikachu extends Pichu{

    public Pikachu(String name, int level){

        super(name, level);

        this.setStats(35, 55,40, 50, 50, 90);

        this.addMove(new Growl());
    }
}
