public class methoodOverload
{
     void area ( int r)
     {
        double pi = 3.14;
        double a = pi*r*r;
        System.out.println("The area of the circle is "+a);
     }
     void area    ( int l, int b)
     {
        int a = l*b;
        System.out.println("The area of the rectangle is "+a);
     }
       void area(double s)
     {
        double a = s*s;
        System.out.println("The area of the rectangle is "+a);
     }
}
