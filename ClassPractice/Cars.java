public class Cars extends Vehicles {
    private String number;
    private String name;
    private String category;

    public Cars() {
    }

    public Cars(String number, String name, String category) {
        this.number = number;
        this.name = name;
        this.category = category;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setNumber(String newNumber) {
        this.number = newNumber;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }
}