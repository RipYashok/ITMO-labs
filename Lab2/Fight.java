import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Fight {


    public static void main(java.lang.String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Farfetchd("The World", 6);
        Pokemon p2 = new Snorunt("Killer Queen", 6);
        Pokemon p3 = new Froslass("King Crimson", 6);
        Pokemon p4 = new Pichu("Star Platinum", 6);
        Pokemon p5 = new Pikachu("Crazy Diamond", 6);
        Pokemon p6 = new Raichu("Gold Experience", 6);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }


}
