package model;

/**
 *
 * @author ASUS
 */
public class Fresher extends Candidate{
    private int graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
        super();
    }

    public Fresher(int graduationDate, String graduationRank, String education, String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, type);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
}
