public class TriangleArea
{
    
    void calculateArea (int a, int b, int c)
    {
        int s = (a + b + c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println ("The area of the triangle is " +area);
    }
    
    void calculateArea (int h, int b)
    {
        double area = (b*h)/2;
        System.out.println ("The area of the triangle is " +area);
    }
    
    public static void main ()
    {
        TriangleArea obj = new TriangleArea ();
        obj.calculateArea (10, 7, 5);
        obj.calculateArea (9, 2);
    }
}
        

    