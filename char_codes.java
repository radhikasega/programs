public class char_codes
{
    char letter1, letter2, letter3;
    
    void Initialize ()
    {
        letter1 = 'A';
        letter2 = (char)(letter1 + 1);
        letter3 = letter2;
    }
    
    void Display ()
    {
        System.out.println ("The sequence of Letters is: " +letter1+ " " +letter2+ " " +(++letter3));
        System.out.println ("The decimal codes of the letters are:\n" +letter1+ ":" +(int)letter1+ 
                             " " +letter2+ ":" +(int)letter2+ " " +letter3+ ":" +(int)letter3);
    }
    
    public static void main ()
    {
        char_codes letters;
        letters = new char_codes ();
        letters.Initialize ();
        letters.Display ();
    }
}

    