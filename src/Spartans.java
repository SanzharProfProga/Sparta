public class Spartans {
    private String name;
    private String status;

    public Spartans(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Spartans() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "\n\nSpartans: " +
                "\nName: " + name +
                "\nStatus: " + status;
    }
}

