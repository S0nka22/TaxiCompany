public class Employee extends Person {
    private String name;
    private String lastName;
    private String position;

    public Employee() {

    }

    public Employee(String name, String lastName, String position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }
}
