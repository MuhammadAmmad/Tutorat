package user;

/**
 * Created by mamadou on 7/9/16.
 */

public class Tutor /*extends user*/ {
    private final int MAX_DIPLOMES = 4; // maximum of the diplome that are allowed
    private final int MAX_DOMAINES = 10;
    private Degree[] degrees;
    private  Competence[] competences;
    private double classement;
    private static int currentDiplome;
    private static int currentDomaine;
    private String programOfStudy;

    public String getProgramOfStudy() {
        return programOfStudy;
    }

    public void setProgramOfStudy(String programOfStudy) {
        this.programOfStudy = programOfStudy;
    }

    public Tutor(String nom, String prenom) {
        //super(nom, prenom);
        this.degrees = new Degree[MAX_DIPLOMES];
        this.competences = new Competence[MAX_DOMAINES];
        this.classement = 0;
        currentDiplome = 0;
        currentDomaine = 0;
    }

    public Degree[] getDiplomes() {
        return degrees;
    }

    public void addDiplomes(Degree degree) {
        degrees[currentDiplome++]= degree;
    }

    public Competence[] getCompetences() {
        return competences;
    }

    public void addDomaines(Competence competence) {
        competences[currentDomaine++] = competence;
    }

    public double getClassement() {
        return classement;
    }

    public void setClassement(double classement) {
        this.classement = classement;
    }
}
