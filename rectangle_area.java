public class rectangle_area
{
  int l,b,a;
   void initialize ()
    {
      l=15;
      b=10;
    }
   void calculate()
    {
      a = l*b;
    }
  void printArea()
 {
  System.out.println("The area of the rectangle is "+a);
 }
 public static void main()
 {
     rectangle_area obj = new rectangle_area ();
     obj.initialize();
     obj.calculate();
     obj.printArea();
    }
}
  