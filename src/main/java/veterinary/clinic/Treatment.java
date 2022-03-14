package veterinary.clinic;

public class Treatment {
    private String name;
    private float cost;
    private Pet petType[];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Pet[] getPetType() {
        return petType;
    }

    public void setPetType(Pet[] petType) {
        this.petType = petType;
    }
}
