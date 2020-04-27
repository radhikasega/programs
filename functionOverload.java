public class functionOverload
{
    void add (int a,int b)
    {
        int ans = a+b;
        System.out.println("The sum of the two integers is" +ans);
    }
    void add (float a,float b)
    {
        float ans = a+b;
        System.out.println("The sum of the two floats is" +ans);
    }
    void add (double a,double b)
    {
        double ans = a+b;
        System.out.println("The sum of the two double is" +ans);
    }
    void add (int a, float b)
    {
        float ans = a+b;
        System.out.println("The sum is" +ans);
    } 
      void add (float a, double b)
    {
        double ans = a+b;
        System.out.println("The sum is" +ans);
    } 
      void add (double a, int b)
    {
        double ans = a+b;
        System.out.println("The sum is" +ans);
    } 
      void add (float a, int b)
    {
        float ans = a+b;
        System.out.println("The sum is" +ans);
    } 
      void add (double a, float b)
    {
        double ans = a+b;
        System.out.println("The sum is" +ans);
    } 
}