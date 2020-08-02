import java.util.Scanner;

public class Scanner2
{
    public static void main (String args [])
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter your full name: ");
        String name = scanner.nextLine ();
        
        System.out.println ("Enter your zodiac sign: ");
        String zodiac = scanner.next ();
        scanner.nextLine (); //flush the 'enter' before the next readLine()
        
        System.out.println ("Enter your Weight (in kgs): ");
        double weight = scanner.nextDouble ();
        
        System.out.println ("Enter your lucky number: ");
        int luckyNumber = scanner.nextInt ();
        
        System.out.println ("Hello " +name+ "!");
        System.out.println ("Your lucky number is " +luckyNumber);
        System.out.println ("Your Zodiac Sign is " +zodiac);
        System.out.println ("Your weight is " +weight);
    }
}

        
    