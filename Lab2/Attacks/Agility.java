package Attacks;

import ru.ifmo.se.pokemon.*;

public class Agility extends SpecialMove {

    public Agility(){
        this.type = Type.PSYCHIC;

    }
    @Override
    protected void applySelfEffects(Pokemon p) {

        p.addEffect(new Effect().turns(-1).stat(Stat.SPEED, 2));
    }

    @Override
    protected String describe(){
        return "использует Agility";
    }
}
