public class Philosophers extends Spartans{
private String hair;
private double weight;

    public Philosophers(String name, String status, String hair, double weight) {
        super(name, status);
        this.hair = hair;
        this.weight = weight;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHair: " + hair +
                "\nWeight: " + weight;
    }
}
