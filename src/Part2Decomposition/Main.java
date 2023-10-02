package Part2Decomposition;
import java.util.Scanner;

/*
1.Ask user for word
2. Get user input
3. Reverse letter position in a word
4. Output the reversed result
5. Ask user if he wants to continue (Y/N)
6. if input == "Y" goto #1
7. Ask user if  he wants to repeat (Y/N)
8. if input == "Y" goto #1
9. Output loop exit text
*/

public class Main {
    public static void print(String s,String value) {
        System.out.println(s + " " + value);
    }
    public static void print(String s) {
        System.out.println(s);
    }

    public static String getUserString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public static String getUserString(String caption) {
        System.out.println(caption);
        return getUserString();
    }
    public static boolean getUserAnswer(String question) {
        String input = getUserString(question + " (Y/N)");
        return input.toUpperCase().equals("Y");
    }



    public static void main(String[] args) {

        String reverse1 = "";
        do {

            do {
                String reverse = getUserString("Enter a word: ");
                for (int i = reverse.length()- 1; i >= 0; i--) {
                    reverse1 += reverse.charAt(i);

                }
                print("Your word backwards: " , reverse1);
                reverse1 = "";


            } while (getUserAnswer("Do you want to continue?"));

        }
        while (getUserAnswer("Do you want to repeat?"));
        print("Thanks for using our services!");

    }
}
