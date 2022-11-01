package Attacks;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {

    public IceBeam(){

        this.type = Type.ICE;
        this.accuracy = 100;
        this.power = 90;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (new Effect().chance(0.1).success() && p.getCondition() == Status.NORMAL) {
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe() {
        return "использовал Ice Beam";
    }
}
