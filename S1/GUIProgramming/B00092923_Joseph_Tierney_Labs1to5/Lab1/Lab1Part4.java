import java.util.Scanner;
public class Lab1Part4 {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int age, result;
    	String fName, lName, name;

    	//prompt user to enter their age
    	System.out.print("Enter age: ");
    	age = input.nextInt();

    	//prompt user to enter thier first name
    	System.out.print("Enter first name: ");
    	fName = input.next();

    	//prompt user to enter their last name
    	System.out.print("Enter last name: ");
    	lName = input.next();

    	//method call
    	result = tripleAge(age);
    	name = printMyName (fName, lName);

    	System.out.println();	//blank line
    	System.out.print("Your age tripled is: " + result + "\n");
    	System.out.print("Your name is: " + name + "\n\n");
    }//end main

    public static int tripleAge(int agex){
    	return agex*agex*agex;
    }//end tripleAge method

    public static String printMyName(String fNamex, String lNamex){
    	return fNamex + " " + lNamex;
    }//end printMyName

}//end class