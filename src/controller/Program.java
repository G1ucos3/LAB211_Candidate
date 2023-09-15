package controller;

import view.Menu;
import common.Create;
import java.util.ArrayList;
import model.Candidate;
/**
 *
 * @author ASUS
 */
public class Program extends Menu<String>{
    static String[] mChoice = {"Experience", "Fresher", "Internship", "Searching", "Exit"};
  //  protected Create Create;
    ArrayList cd;

    public Program(Candidate candidate) {
        super("MANAGE CANDIDATE", mChoice);
        candidate = new Candidate();
        this.cd = new ArrayList<Candidate>();
    }

    @Override
    public void execute(int n){
        switch(n){
            case 1:
                System.out.println("---Create Experience");
                Create.createCandiate(cd, 0);
                break;
            case 2:
                System.out.println("---Create Fresher");
                Create.createCandiate(cd, 1);
                break;
            case 3:
                System.out.println("---Create Intern");
                Create.createCandiate(cd, 2);
                break;
            case 4:
                Create.searchCandidate(cd);
                break;
            case 5:
                System.out.println("Exit!");
                System.exit(0);
        }
    }
}
