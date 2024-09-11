import java.util.Scanner;

public class RemoveWhiteSpace{

    public static String removeSpaces(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        // Input string
        System.out.println("Enter a string: ");
        String inputString = input.nextLine();


        String resultString = removeSpaces(inputString);
        System.out.println("String without white spaces: " + resultString);


        input.close();
    }
}
