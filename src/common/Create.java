package common;

import java.util.ArrayList;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Intern;

/**
 *
 * @author ASUS
 */
public class Create {
    public static void createCandiate(ArrayList<Candidate> cd, int type){
        while (true){
            System.out.print("Enter candidate ID: ");
            String cID = (Validate.checkString());
            if (Validate.checkIdExist(cd, cID)){
                System.out.print("Enter first name: ");
                String firstName = Validate.checkString();
                System.out.print("Enter last name: ");
                String lastName = Validate.checkString();
                System.out.print("Enter birth date: ");
                int birthDate = Validate.checkLimit(1900, 2023);
                System.out.print("Enter address: ");
                String address = Validate.checkString();
                System.out.print("Enter phone: ");
                String phone = Validate.checkPhone();
                System.out.print("Enter email: ");
                String email = Validate.checkEmail();
                Candidate candidate = new Candidate(cID, firstName, lastName, birthDate, address, phone, email, type);
                switch (type){
                    case 0:
                        createExperience(cd, candidate);
                        break;
                    case 1:
                        createFresher(cd, candidate);
                        break;
                    case 2:
                        createInternship(cd, candidate);
                        break;
                }
            } else{
                return;
            }
            System.out.print("Do you want to continue (Y/N): ");
            if (!Validate.inputYN()){
                return;
            }
        }
    }
    
    public static void createExperience(ArrayList<Candidate> cd, Candidate candidate){
        System.out.print("Enter year of experience: ");
        int yearExperience = Validate.checkLimit(0, 100);
        System.out.print("Enter professional skill: ");
        String professionalSkill = Validate.checkString();
        Experience ex = new Experience(yearExperience, professionalSkill, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(),
                candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getType());
        cd.add(ex);
        System.out.println("--Create success!--");
    }

    public static void createFresher(ArrayList<Candidate> cd, Candidate candidate){
        System.out.print("Enter graduation date: ");
        int graduationDate = Validate.checkLimit(1900, 2023);
        System.out.print("Enter graduation rank: ");
        String graduationRank = Validate.checkRank();
        Fresher fr = new Fresher(graduationDate, graduationRank, graduationRank, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), 
                candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getType());
        cd.add(fr);
        System.out.println("--Create success!--");
    }

    public static void createInternship(ArrayList<Candidate> cd, Candidate candidate){
        System.out.print("Enter major: ");
        String major = Validate.checkString();
        System.out.print("Enter semester: ");
        String semester = Validate.checkString();
        System.out.print("Enter university: ");
        String university = Validate.checkString();
        Intern it = new Intern(major, semester, university, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), 
                candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getType());
        cd.add(it);
        System.out.println("--Create success!--");
    }

    public static void printList(ArrayList<Candidate> cd) {
        System.out.println("=======Experience Candidate=======");
        for (Candidate candidate : cd) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.out.println("=======Fresher Candidate=======");
        for (Candidate candidate : cd) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
        System.out.println("=======Internship Candidate=======");
        for (Candidate candidate : cd) {
            if (candidate instanceof Intern) {
                System.out.println(candidate.getFirstName() + " "
                        + candidate.getLastName());
            }
        }
    }
    
    public static void searchCandidate(ArrayList<Candidate> cd){
        printList(cd);
        System.out.print("Enter candidate name: ");
        String nameSearch = Validate.checkString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = Validate.checkLimit(0, 2);
        boolean found = false;
        for (Candidate candidate : cd){
            if (candidate.getType() == typeCandidate
                    && (candidate.getFirstName().toLowerCase().contains(nameSearch.toLowerCase())
                    || candidate.getLastName().toLowerCase().contains(nameSearch.toLowerCase()))){
                System.out.println(candidate.toString());
                found = true;
            }
        }
        
        if (!found) System.out.println("Not found!");
    }
}
