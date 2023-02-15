public class Archers extends Spartans{
    private int age;

    private double arrowFlightRange;

    public Archers(String name, String status, int age, double arrowFlightRange) {
        super(name, status);
        this.age = age;
        this.arrowFlightRange = arrowFlightRange;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getArrowFlightRange() {
        return arrowFlightRange;
    }

    public void setArrowFlightRange(double arrowFlightRange) {
        this.arrowFlightRange = arrowFlightRange;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + age +
                "\nArrow flight range: " + arrowFlightRange;
    }
}
