package Attacks;

import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {

    public Double_Team(){
        this.type = Type.NORMAL;

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(-1).stat(Stat.EVASION, 1));
    }

    @Override
    protected String describe(){
        return "использовал Double_Team";
    }
}
