package veterinary.clinic;

import java.util.Scanner;

public class VeterinaryClinic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the type of pet you would like to have: ");
        String type = sc.nextLine();

        System.out.println("Please select the type of treatment you would like to have: ");
        String treatmentRequired = sc.nextLine();

        // Pets set up

        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        Pet pet3 = new Pet();
        Pet pet4 = new Pet();

        pet1.setType("Dogs");

        pet2.setType("Cats");

        pet3.setType("Equine");

        pet4.setType("Rabbit");


        // Treatments Set up
        Treatment treatment1 = new Treatment();
        Treatment treatment2 = new Treatment();
        Treatment treatment3 = new Treatment();
        Treatment treatment4 = new Treatment();

        treatment1.setName("skin care disorders");
        treatment1.setCost(1000);
        treatment1.setPetType(new Pet[]{pet1, pet2});

        treatment2.setName("surgical procedures");
        treatment2.setCost(1200);
        treatment2.setPetType(new Pet[]{pet2, pet4});

        treatment3.setName("vaccinations");
        treatment3.setCost(600);
        treatment3.setPetType(new Pet[]{pet1, pet2, pet3, pet4});

        treatment4.setName("dog grooming");
        treatment4.setCost(400);
        treatment4.setPetType(new Pet[]{pet1});




        // Clinic 1 Set up

        Clinic clinic1 = new Clinic();

        clinic1.setName("Pet Care");
        clinic1.setAddress("Charbagh");
        clinic1.setPets(new Pet[]{pet1, pet4});
        clinic1.setTreatmentList(new Treatment[]{treatment1, treatment4});

        // Clinic 2 Set up

        Clinic clinic2 = new Clinic();

        clinic2.setName("Pet Cure and Care");
        clinic2.setAddress("Sarojini Nagar");
        clinic2.setPets(new Pet[]{pet1, pet4});
        clinic2.setTreatmentList(new Treatment[]{treatment1, treatment2, treatment3});

        // Clinic 2 Set up

        Clinic clinic3 = new Clinic();

        clinic3.setName("Pet Clinic");
        clinic3.setAddress("Transport Nagar");
        clinic3.setPets(new Pet[]{pet1});
        clinic3.setTreatmentList(new Treatment[]{treatment1, treatment3, treatment4});

        Clinic clinicList[] = new Clinic[3];
        clinicList[0] = clinic1;
        clinicList[1] = clinic2;
        clinicList[2] = clinic3;

        int ctr = 1;
        for (Clinic clinic : clinicList ) {
            boolean petFlag = false;
            boolean treatmentFlag = false;
            Pet pet = null;
            Treatment treatment = null;
            for (Pet p : clinic.getPets() ) {
                if(p.getType().equals(type)){
                    petFlag = true;
                    pet = p;
                    break;
                }
            }

            for (Treatment t : clinic.getTreatmentList()) {
                if(t.getName().equals(treatmentRequired)){
                    treatmentFlag = true;
                    treatment = t;
                    break;
                }
            }

            if(petFlag && treatmentFlag){
                clinic.printClinicDetails(ctr, pet, treatment);
                ctr++;
                System.out.println();
            }
        }
    }
}
