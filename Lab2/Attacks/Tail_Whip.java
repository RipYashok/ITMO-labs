package Attacks;


import ru.ifmo.se.pokemon.*;

public class Tail_Whip extends StatusMove {
    public Tail_Whip() {

        this.type = Type.NORMAL;

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().turns(-1).stat(Stat.DEFENSE, -1));

    }
    @Override
    protected String describe() {

        return "использует Tail Whip";
    }

}
