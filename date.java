public class date //Program to demonstrate constructor overloading
{
    int dd, mm, yy; //Instance variable
    
    date() //Default Constructor
    {
        dd=0;
        mm=0;
        yy=0;
    }
    
    date (int d, int m, int y) //Parameterized constructor
    {
        dd=d;
        mm=m;
        yy=y;
    }
    
    public static void main ()
    {
        date obj = new date (20,6,2020);
        System.out.println (obj.dd+"/"+obj.mm+"/"+obj.yy);
        date obj1 = new date();
        System.out.println (obj1.dd+"/"+obj1.mm+"/"+obj1.yy);
    }
}
        
        