public class Knights extends Spartans {
private String typeOfArmor;
private String typeOfWeapon;

    public Knights(String name, String status, String typeOfArmor, String typeOfWeapon) {
        super(name, status);
        this.typeOfArmor = typeOfArmor;
        this.typeOfWeapon = typeOfWeapon;
    }

    public String getTypeOfArmor() {
        return typeOfArmor;
    }

    public void setTypeOfArmor(String typeOfArmor) {
        this.typeOfArmor = typeOfArmor;
    }

    public String getTypeOfWeapon() {
        return typeOfWeapon;
    }

    public void setTypeOfWeapon(String typeOfWeapon) {
        this.typeOfWeapon = typeOfWeapon;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType of armor: " + typeOfArmor +
                "\nType of weapon: " + typeOfWeapon;
    }
}
