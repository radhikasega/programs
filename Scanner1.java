import java.util.Scanner;
public class Scanner1
{
    public static void main (String [] args)
    {
        System.out.println ("Enter the First Number to be added: ");
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt ();
        System.out.println ("Enter the Second Number to be added: ");
        int num2 = scan.nextInt ();
        int num3 = num1+num2;
        System.out.println ("The answer: " +num3);
    }
}