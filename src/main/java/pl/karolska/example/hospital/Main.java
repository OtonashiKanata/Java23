package pl.karolska.example.hospital;

public class Main {
    public static void main(String[] args){
        Doctor doctor = new Doctor("kids", "22222");
        doctor.setName("Adam");
        doctor.setSurname("Nowak");
        doctor.specialization = "Psychiatrist";
        doctor.license = "11111";

        Nurse nurse = new Nurse();
        nurse.setName("Anna");
        nurse.setSurname("Kowalska");
        nurse.level = "Hall";







    }


}
