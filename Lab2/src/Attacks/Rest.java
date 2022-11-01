package Attacks;

import ru.ifmo.se.pokemon.*;



public class Rest extends StatusMove {

    int h;
    public Rest(int h){
        this.type = Type.PSYCHIC;



    }

    @Override
    protected void applySelfEffects(Pokemon p) {

        Effect.sleep(p);

        p.addEffect(new Effect().turns(0).stat(Stat.HP, h));
    }

    @Override
    protected String describe(){
        return "использовал Rest";
    }
}
