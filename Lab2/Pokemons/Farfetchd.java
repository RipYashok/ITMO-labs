package Pokemons;

import Attacks.Agility;
import Attacks.Brutal_Swing;
import Attacks.Double_Team;
import Attacks.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Farfetchd extends Pokemon {

    public Farfetchd(String name, int level) {

        super(name, level);

        this.setType(Type.NORMAL, Type.FLYING);

        this.setStats(52, 90, 55, 58, 62, 60);


        this.setMove(new Agility(), new Rest(52), new Double_Team(), new Brutal_Swing());
    }


}
