package Attacks;


import ru.ifmo.se.pokemon.*;

public class Charge_Beam extends SpecialMove {


    public Charge_Beam(){

        this.type = Type.ELECTRIC;
        this.accuracy = 90;
        this.power = 50;

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.7).turns(-1).stat(Stat.SPECIAL_ATTACK, 1));
    }

    @Override
    protected String describe() {
        return "использует Charge Beam";
    }
}
