//The class for calculations
public class Calculations {
    static void addition(int num1,int num2){        //Addition
        int result=num1+num2;
        System.out.println(num1 + " + " + num2 + " = "+ result);
    }
    static void subtraction(int num1,int num2){     //Subtraction
        if (num1<num2){
            int result=num2-num1;
            System.out.println(num2 + " - " + num1 + " = "+ result);
        } else if (num2<num1) {
            int result=num1-num2;
            System.out.println(num1 + " - " + num2 + " = "+ result);
        }
    }
    static void multiplication(int num1,int num2){      //Multiplication
        int result = num1*num2;
        System.out.println(num1 + " X " + num2 + " = " + result);
    }
    static void division(int num1,int num2){        //Division
        int result=num1/num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
}
