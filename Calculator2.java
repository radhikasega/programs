import java.util.Scanner;
public class Calculator2
{
    int a, b, c;
    static char ch;
    void accept ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the first number: ");
        a = sc.nextInt ();
        System.out.println ("Enter the second number: ");
        b = sc.nextInt();
        System.out.println ("Enter a operator to perform the calculation: ");
        ch = sc.next().charAt(0);
    }
    
    void addition ()
    {
        c = a+b;
        System.out.println ("The sum of the two numbers is " +c);
    }
    
    void subtraction ()
    {
        c = a-b;
        System.out.println ("The difference of the two numbers is " +c);
    }
    
    void multiplication ()
    {
        c = a*b;
        System.out.println ("The product of the two numbers is " +c);
    }
    
    void division ()
    {
        c = a/b;
        System.out.println ("The quotionet of the two numbers is " +c);
    }
    
    void remainder ()
    {
        c = a % b;
        System.out.println ("The remainder of the two numbers is " +c);
    }
    
    public static void main ()
    {
        Calculator2 obj = new Calculator2 ();
        obj.accept ();
        switch (ch)
        {
            case '+': obj.addition ();
                      break;
            case '-': obj.subtraction ();
                      break;
            case '*': obj.multiplication ();
                      break;
            case '/': obj.division ();
                      break;
            case '%': obj.remainder ();
                      break;
            default: System.out.println ("Invalid Character");
                     break;
        }
    }
}
