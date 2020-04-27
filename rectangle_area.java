public class rectangle_area
{
  int l,b,a;
   void initialize ()
    {
      l=15;
      b=10;
    }
   int calculate()
    {
      a = l*b;
      return a;
    }
    public static void main()
    {
     rectangle_area obj = new rectangle_area ();
     obj.initialize();
     int a = obj.calculate();
     System.out.println("The area of the rectangle is "+a);
    }
}
  