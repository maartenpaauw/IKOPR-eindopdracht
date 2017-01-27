package MVCStudenten;

/**
 * Created by Maarten & Zowie on 21/01/2017.
 */

public class StudentController {
    // aangeven model
    private Student model;
    // aangeven view
    private StudentView view;

    // constructor studentcontroller die de model en view meegeeft
    public StudentController(Student model, StudentView view){
        // model instantieren
        this.model = model;
        // view instantieren
        this.view = view;
    }

    // methode voor het setten van studentnaam
    public void setStudentName(String name){
        // model voert setname uit met ingevoerde naam
        model.setName(name);
    }

    // methode voor verkrijgen student naam
    public String getStudentName(){
        // model gebruikt methode getname voor het teruggeven van studentnaam
        return model.getName();
    }

    // methode voor het setten van studentennummer
    public void setStudentstNummer(String stNummer){
        // model set het studentennummer door methode setStNummer
        model.setStNummer(stNummer);
    }

    // methode voor verkrijgen studentennummer
    public String getStudentstNummer(){
        // getStnummer aanroepen vanuit de model
        return model.getStNummer();
    }

    // methode voor het updaten van de studentenview met de nieuwe naam en studentennummer
    public void updateView(){
        // printen studentnummer en studentennaam van uit de view
        view.printStudentDetails(model.getName(), model.getStNummer());
    }
}
