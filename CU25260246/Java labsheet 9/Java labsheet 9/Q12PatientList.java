import java.util.ArrayList;
import java.util.HashSet;
public class Q12PatientList {
    public static void main(String[] args) {

        ArrayList<String> patients = new ArrayList<>();
        HashSet<String> patientIDs = new HashSet<>();

        patients.add("Aman");
        patientIDs.add("P101");

        patients.add("Rahul");
        patientIDs.add("P102");

        patients.add("Priya");
        patientIDs.add("P103");

        System.out.println("Patient Names: " + patients);
        System.out.println("Patient IDs: " + patientIDs);

        patients.remove("Rahul");
        patientIDs.remove("P102");

        System.out.println("After Removing Rahul:");
        System.out.println("Patients: " + patients);
        System.out.println("IDs: " + patientIDs);

        if (patients.contains("Aman")) {
            System.out.println("Aman Found!");
        } else {
            System.out.println("Aman Not Found!");
        }
        System.out.println("Total Patients: " + patients.size());
    }
}
