import java.util.Scanner;

class InputOutputNumber {6200

    public static void main(String[] args) {

        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();

        // Displaying the number
        System.out.println("\n\nThe number entered by user: "+num);
    }
}