package midterm;

import java.util.Scanner;

public class RunBloodData {

    // SIEGFRIED A. GAERLAN BSIT309

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String input1, input2;

        System.out.print("Enter blood type of patient: ");
        input1 = input.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        input2 = input.nextLine();

        if(input1.isEmpty() || input2.isEmpty()) {
            BloodData bd = new BloodData();
            bd.display();
            return;
        }

        if(input1.equalsIgnoreCase("A") 
        || input1.equalsIgnoreCase("AB") || input1.equalsIgnoreCase("B") 
        || input1.equalsIgnoreCase("O")) {

            if(input2.equals("+") || input2.equals("-")){
                BloodData bd = new BloodData(input1, input2);
                bd.display();
               
            }else {
                System.out.println("Not a valid rh factor.");
            }

        }else {
            System.out.println("Not a valid blood type.");
        }

    }

}

class BloodData {
    static String bloodType, rhFactor;
    
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }
    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }
    public void display() {
        System.out.println(bloodType.toUpperCase() + rhFactor + " is added to the blood bank.");
    }
}