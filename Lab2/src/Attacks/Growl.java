package Attacks;

import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {

    public Growl(){

        this.type = Type.NORMAL;

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().turns(-1).stat(Stat.ATTACK, -1));
    }

    @Override
    protected String describe() {
        return "использует Growl";
    }
}
