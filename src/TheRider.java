public class TheRider extends Spartans{
    private String horseColor;
    private String horseWeight;

    public TheRider(String name, String status, String horseColor, String horseWeight) {
        super(name,  status);
        this.horseColor = horseColor;
        this.horseWeight = horseWeight;
    }

    public String getHorseColor() {
        return horseColor;
    }

    public void setHorseColor(String horseColor) {
        this.horseColor = horseColor;
    }

    public String getHorseWeight() {
        return horseWeight;
    }

    public void setHorseWeight(String horseWeight) {
        this.horseWeight = horseWeight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHorse color: " + horseColor +
                "\nHorse weight: " + horseWeight;
    }
}
