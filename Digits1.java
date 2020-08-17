// Program to count the digits in a number
import java.util.Scanner;
public class Digits1
{
    int num;
    void getNumber ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the number: ");
        num = sc.nextInt ();
    }
    
    void digitCount ()
    {
        int n = num; //Preserving the copy of the orginal number
        int count = 0;
        while (n!=0)
        {
            count++;
            n = n/10;
        }
        System.out.println ("The number of digits in the number is " +count);
    }
    
    public static void main ()
    {
        Digits1 obj = new Digits1 ();
        obj.getNumber ();
        obj.digitCount ();
    }
}

        