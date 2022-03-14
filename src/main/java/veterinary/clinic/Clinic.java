package veterinary.clinic;

public class Clinic {
    private String name;
    private String address;
    private Pet pets[];
    private Treatment treatmentList[];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    public Treatment[] getTreatmentList() {
        return treatmentList;
    }

    public void setTreatmentList(Treatment[] treatmentList) {
        this.treatmentList = treatmentList;
    }

    public void printClinicDetails(int ctr, Pet pet, Treatment treatment){
        System.out.print(ctr + ". " + this.getName() + " located at " + this.getAddress() + " provides " + treatment.getName() + " for " + treatment.getCost() + " price.");


    }
}
