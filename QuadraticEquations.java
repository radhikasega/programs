public class QuadraticEquations
{
    int a;//coefficient of the sqaure of x
    int b;//coefficient of x
    int c;//constant term
    int d;//discriminant
    
    void accept (int num1, int num2, int num3)
    {
        a = num1;
        b = num2;
        c = num3;
    }
    
    void compute ()
    {
        d = b*b - (4*a*c);
        
        if (d==0)
        {
            System.out.println ("Real and Equal roots");
            int r1,r2;
            r1 = -b/(2*a);
            r2 = b/(2*a);
            System.out.println ("Root 1 = " +r1+ "; Root 2 = " +r2 );
        }
        
        else if(d>0)
        {
            System.out.println("Real and unequal roots");
            int r1 = (-b+d)/(2*a);
            int r2 = (-b-d)/(2*a);
            System.out.println("Root 1 = "+r1+"; Root 2 = "+r2);
        }
        
        else
        {
            System.out.println("Imaginary roots");
        }
    }
    
    public static void main()
    {
        QuadraticEquations obj = new QuadraticEquations();
        obj.accept(3,6,3);
        obj.compute();
    }
}