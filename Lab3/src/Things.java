import enums.Size;
public class Things extends Entity implements Text{
    private String name;
    public Size size;
    public Things(String name, Size size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Things things = (Things) o;
        return this.hashCode() == things.hashCode();
    }
    @Override
    public int hashCode() {
        return this.size.hashCode();
    }
    public void decide(Mineral antilunite){
        if (this.size.equals(Size.SMALL)) {
            System.out.print("Они решили, что увеличив " + this + " получится победить силы противодействия " + antilunite + "a. ");
        }
    }
    @Override
    public void text(){
        if (this.size.equals(Size.BIG)){
            if (this.name == "магнит"){
                System.out.print(this + " большой, ");
            }
            else if (this.name == "Кристалл лунита"){
                System.out.print(this + " большой, ");
            }
            else if (this.name == "прибор невесомости"){
                System.out.println(this + " увеличен до нужного размера.");
            }
        }
    }

    public void bild(Things first, Things second) {
        if (this.equals(first) && this.size == Size.BIG) {
            second.size = Size.BIG;
        }
    }
}
