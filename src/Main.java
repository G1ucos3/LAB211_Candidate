
import controller.Program;
import model.Candidate;


/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        new Program(candidate).run();
    }
}
