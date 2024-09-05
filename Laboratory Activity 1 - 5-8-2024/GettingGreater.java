import java.util.Scanner;

public class GettingGreater {
    public static void main (String[]args)  {
        Scanner input = new Scanner(System.in);

        System.out.println("Getting the Greater Value");
        
        System.out.print ("Enter first character: ");
        char firstChar = input.next().charAt(0);

        System.out.print("Enter the second character: ");
        char secondChar = input.next().charAt(0);
        
        int asciiVal1 = (int) firstChar;
        int asciiVal2 = (int) secondChar;

        input.close();

        System.out.println("----------------------------------------------");
        System.out.println("The character with greater value is : " + (char) Math.max(firstChar, secondChar) );
        System.out.println("----------------------------------------------");

        System.out.println("Showing the  ASCII Codes");
        System.out.println(firstChar + " : " + asciiVal1);
        System.out.println(secondChar + " : " + asciiVal2);
    }
}