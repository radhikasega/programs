public class ASCII
{
    int a; 
    char b;
    void initialize (char c)
    {
        b = c;
        a = c;
    }
    void display ()
    {
        System.out.println ("The character is "+b);
        System.out.println ("The ASCII code of the character " +a);
    }
}