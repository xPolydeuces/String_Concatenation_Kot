import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// This app uses String class method concat() to concatenate two strings together
        Scanner myScan = new Scanner(System.in);

        String firstString;
        String secondString;
        String result1;
        String result2;

        System.out.print("Input the first string: ");
        firstString = myScan.nextLine();
        System.out.print("Input the second string: ");
        secondString = myScan.nextLine();

        result1 = firstString.concat(secondString);
        result2 = secondString.concat(firstString);

        System.out.println(result1);
        System.out.println(result2);

        System.out.println(result1.equals(result2));
        System.out.println(result2.equals(result1));
    }
}
