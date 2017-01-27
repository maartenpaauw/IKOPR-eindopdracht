package MVCStudenten;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public class Main {
    public static void main(String[] args) {

        // student informatie verkrijgen
        Student model  = verkrijgStudent();

        // view maken voor het uitlezen van studentgegevens
        StudentView view = new StudentView();

        // controller aanmaken die de model en view meekrijgt
        StudentController controller = new StudentController(model, view);

        // updaten van de view is nu nog leeg
        controller.updateView();

        // setten van studentnaam
        controller.setStudentName("Zowie");
        // setten van studentnummer
        controller.setStudentstNummer("1097398");
        // updaten view
        controller.updateView();
    }

    private static Student verkrijgStudent(){
        // aanmaken nieuwe student
        Student student = new Student();
        // setten naam
        student.setName("Maarten");
        // setten studentnummer
        student.setStNummer("1094220");
        // teruggeven student
        return student;
    }
}
