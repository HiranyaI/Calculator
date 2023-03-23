//Importing packages for the code
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Initializing a new scanner
        Scanner scn=new Scanner(System.in);

        //User input 1
        System.out.print("Please enter number one : ");
        int user_input_one=scn.nextInt();

        //User input 2
        System.out.print("Please enter number two : ");
        int user_input_two=scn.nextInt();

        //User's calculation method
        System.out.print("Please select your calculation method (1 - addition, 2 - subtraction, 3 - multiplication, 4 - division) : ");
        int calculation_method=scn.nextInt();

        //The Calculations class
        Calculations add = new Calculations();

        if (calculation_method==1) {        //If user select "1" addition between 2 number will appear
            add.addition(user_input_one, user_input_two);
        } else if (calculation_method==2) {         //If user select "2" subtraction between 2 number will appear
            add.subtraction(user_input_one,user_input_two);
        } else if (calculation_method==3) {         //If user select "3" division between 2 number will appear
            add.multiplication(user_input_one,user_input_two);
        } else if (calculation_method == 4) {       //If user select "4" division between 2 number will appear
            add.division(user_input_one,user_input_two);
        }else {         //If user enter a invalid number an error will pop up
            System.out.println("Error");
        }
    }
}