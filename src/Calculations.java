import java.util.Scanner;

public class Calculations {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userInput = sc.nextInt();
        System.out.println("Enter another number:");
        int userInput2 = sc.nextInt();
        int sum = userInput + userInput2;
        int pr = userInput * userInput2;


        System.out.println("Sum :" + sum + "\nProduct:" + pr);

        System.out.println("The square of a number. \nInput:");
        int userInput3 = sc.nextInt();
        int sq = userInput3 * userInput3;
        System.out.println("Output:" + sq);
        System.out.println("The square of a number 2. \nInput:");
        int userInput4 = sc.nextInt();
        int sq2 = userInput4 * userInput4;
        System.out.println("Output:" + sq2);
        //buffer
        sc.nextLine();
        // Get two different string input from user and print them in the same line
        System.out.println("Get two different string input from user and print them in the same line. \nInput:");
        String userInput5 = sc.nextLine();
        System.out.println("Second Input:");
        String userInput6 = sc.nextLine();


        System.out.println("Output:" + userInput5 + userInput6);


    }

}
