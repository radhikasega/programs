import java.util.Scanner;
public class Calculator
{
    int a, b, c;
    static char ch;
    void accept ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the first number: ");
        int n1 = sc.nextInt ();
        a = n1;
        System.out.println ("Enter the second number: ");
        int n2 = sc.nextInt();
        b = n2;
        System.out.println ("Enter a operator to perform the calculation: ");
        char c = sc.next().charAt(0);
        ch = c;
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
        
        Calculator obj1 = new Calculator ();
        obj1.accept ();
        
        if (ch == '+')
            obj1.addition ();
        else if (ch == '-')
            obj1.subtraction ();
        else if (ch == '*')
            obj1.multiplication ();
        else if (ch == '/')
            obj1.division ();
        else if (ch == '%')
            obj1.remainder ();
        else
            System.out.println ("Invalid Character");
        
    }
}

        