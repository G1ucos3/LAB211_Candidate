package model;

/**
 *
 * @author ASUS
 */
public class Experience extends Candidate{
    private int expInYear;
    private String proSkill;

    public Experience() {
        super();
    }
    
    public Experience(int expInYear, String proSkill, String candidateID, String firstName, String lastName, int birthDate, String address, String phone, String email, int type) {
        super(candidateID, firstName, lastName, birthDate, address, phone, email, type);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    
}
