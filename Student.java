public class Student
{
    int age;
    String name;
    double m1, m2, m3, maximum, average;
    
    public Student (String n, int a, double marks1, double marks2, double marks3)
    {
        age = a;
        name = n;
        m1 = marks1;
        m2 = marks2;
        m3 = marks3;
    }
    
    void calculate ()
    {
        maximum = Math.max(m1,Math.max(m2,m3));
        average = (m1+m2+m3)/3;
    }
    
    void display ()
    {
        System.out.println ("The name of the student is " +name);
        System.out.println ("The age of the student is " +age);
        System.out.println ("The marks of the student is " +m1+ ", " +m2+ ", " +m3);
        System.out.println ("The maximum marks secured by the student is " +maximum);
        System.out.println ("The average marks of the student is " +average);
    }
    
    public static void main ()
    {
        Student obj = new Student ("Rhea Sebastin", 14, 98.00, 95.00, 92.00);
        obj.calculate ();
        obj.display ();
    }
}
        
        