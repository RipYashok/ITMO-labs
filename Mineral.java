import enums.*;

import java.util.Objects;

public class Mineral extends Entity implements Text{
    public final String name;
    private Transparency transparency;
    private Color color;
    private ThermalConductivity thermalConductivity;
    private ElectricalСonductivity electricalConductivity;
    private Weight weight;
    private MeltingTemperature meltingTemperature;
    private Location location;
    public Mineral(String name, Transparency transparency, Color color, ThermalConductivity thermalConductivity,
                   ElectricalСonductivity electricalConductivity, Weight weight, MeltingTemperature meltingTemperature, Location location) {
        this.name = name;
        this.transparency = transparency;
        this.color = color;
        this.thermalConductivity = thermalConductivity;
        this.electricalConductivity = electricalConductivity;
        this.weight = weight;
        this.meltingTemperature = meltingTemperature;
        this.location = location;
    }
    public static Color chooseColor(String name) {
        if (name == "антилунит") {
            double c = Math.floor(Math.random() * 2);
            if (c == 0) {
                return Color.VIOLET;
            } else {
                return Color.BLUE;
            }
        } else {
            double c = Math.floor(Math.random() * 3);
            if (c == 0) {
                return Color.YELLOW;
            } else if (c == 1) {
                return Color.GREEN;
            } else {
                return Color.GRAY_BROWN_CRIMSON;
            }
        }
    }
    public Size determine(Mineral second){
        String data = "";
        if (this.transparency.equals(Transparency.OPAQOE)) {
            second.transparency = Transparency.TRANSPARENT;
        }
        if (this.color.equals(Color.YELLOW) || this.color.equals(Color.GREEN) || this.color.equals(Color.GRAY_BROWN_CRIMSON)){
            second.color = chooseColor(second.name);
        }
        if (this.thermalConductivity.equals(ThermalConductivity.GOOD)){
            second.thermalConductivity = ThermalConductivity.BAD;
        }
        if (this.electricalConductivity.equals(ElectricalСonductivity.BAD)){
            second.electricalConductivity = ElectricalСonductivity.GOOD;
        }
        if (this.weight.equals(Weight.BIG)){
            second.weight = Weight.SMALL;
        }
        if (this.meltingTemperature.equals(MeltingTemperature.HIGH)){
            second.meltingTemperature = MeltingTemperature.LOW;
        }
        if (this.location.equals(Location.DEEP)){
            second.location = Location.NOTDEEP;
        }
        return null;
    }
    public boolean compare(Mineral mineral){
        if (this.equals(mineral)){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public void text() {
        if (this.name == "лунит"){
            System.out.println(this.name + " - непрозрачный, желтоватый, зеленоватый или серо-буромалиновый, имеет хорошую теплопровдность," +
                    " плохую электророводность, большой удельный вес, высокую температуру плавления и залегает глубоко в недрах Луны, ");
        }
        if (this.name == "антилунит"){
            System.out.println("то " + this.name + " - прозрачный, фиолетовый или синеватый, имеет плохую теплопровдность," +
                    " хорошую электророводность, небольшой удельный вес, низкую температуру плавления и залегает неглубоко в недрах Луны.");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mineral mineral = (Mineral) o;
        return this.hashCode() == mineral.hashCode();
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, transparency, color, thermalConductivity, electricalConductivity, weight, meltingTemperature, location);
    }
}





