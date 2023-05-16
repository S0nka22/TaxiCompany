public class Person {
    private String name;
    private String lastName;
    private int age;
    public Person(){
    }

    public Person (String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public  String getLastName() {
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
}
