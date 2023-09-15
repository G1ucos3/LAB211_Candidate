package common;

import java.util.ArrayList;
import java.util.Scanner;
import model.Candidate;

/**
 *
 * @author ASUS
 */
public class Validate {
    final static Scanner sc = new Scanner(System.in);
    final static String phoneValid = "^\\d{1,10}$";
    final static String mailValid = "^[A-Za-z0-9]+@[A-Za-z.]+\\.[A-Za-z]+$";
    
    public static int checkLimit(int min, int max){
        while(true){
            try{
                int result = Integer.parseInt(sc.nextLine().trim());
                if(result < min || result > max){
                throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException E){
                System.err.println("Enter number in range (" + min + "-" + max + ") :");
                System.out.println("Enter again: ");
            }
        }
    }
    
    public static String checkString(){
        while (true){
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Empty");
                System.out.print("Enter again: ");
            } else{
                return result;
            }
        }
    }
    
    public static String checkPhone(){
        while (true){
            String result = checkString();
            if (result.matches(phoneValid)){
                return result;
            } else{
                System.err.println("Wrong format");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkEmail(){
        while (true){
            String result = checkString();
            if (result.matches(mailValid)){
                return result;
            } else{
                System.err.println("Wrong format");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkRank(){
        while (true){
            String result = checkString();
            if (result.equalsIgnoreCase("Excellence")
                    || result.equalsIgnoreCase("Good")
                    || result.equalsIgnoreCase("Fair")
                    || result.equalsIgnoreCase("Poor")) {
                return result;
            } else{
                System.err.println("Excellence/Good/Fair/Poor");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkIdExist(ArrayList<Candidate> cd, String id){
        for (Candidate candidate : cd){
            if (candidate.getId().equalsIgnoreCase(id)){
                System.err.println("Id exist.");
                return false;
            }
        }
        return true;
    }
    
    public static boolean inputYN(){
        while (true){
            String result = checkString();
            if (result.equalsIgnoreCase("Y")){
                return true;
            } else if (result.equalsIgnoreCase("N")){
                return false;
            }
            System.out.print("Enter again: ");
        }
    }
}
