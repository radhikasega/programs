public class AllStatic
{
    static int m = 0;
    static int n = 0;
    
    public static void main (Strng[ ] args)
    {
        int m = 10;
        int x = 20;
        {
            int n = 30;
            System.out.println ("m + n = " + m+n);
            check (5);
        }
        x = m + n;
        System.out.println ("x = " +x);
    }
    
    public static void check int k;
    {
        int m = 5;
        n = k;
        System.out.println ("m is " +m);
        System.out.println ("n is " +n);
    }
}
