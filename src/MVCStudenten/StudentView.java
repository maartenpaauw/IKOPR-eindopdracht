package MVCStudenten;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public class StudentView {
    // methode voor printen gegevens
    public void printStudentDetails(String studentName, String studentStNummer){
        // printen van gegevens
        System.out.println("Student: ");
        System.out.println("Naam: " + studentName);
        System.out.println("Studentnummer: " + studentStNummer);
    }
}