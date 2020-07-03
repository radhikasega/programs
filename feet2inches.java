public class feet2inches
{
    private static float feet;
    private static int inches;
    static String convertedTo;
    
    public feet2inches ()
    {
        feet = 0;
        inches = 00;
        convertedTo = "empty";
    }
    
    public feet2inches (float f, int i)
    {
        feet = f;
        inches = i;
        convertedTo = "Not changed yet";
    }
    
    public static float convertToFeet (feet2inches objInches)
    {
        int y = objInches.inches;
        float f = y;
        int fts = y/12;
        int ins = (int)(f-fts*12);
        f = fts;
        f += (float)ins/10;
        convertedTo = "feet";//because of call by reference this member will get changed
        return f;
    }
    
    public static int convertToInches (feet2inches objFeet)
    {
        int i;
        int fts = (int)objFeet.feet;
        int ins = objFeet.inches;
        convertedTo = "inches";//Because of call by reference this member will get changed
        i = fts*12 + ins;
        return i;
    }
    
    public String Distance ()
    {
        String distance = (int)feet + "\'" + inches + "\"";
        return distance;
    }
    
    public void feet2inches ()
    {
        feet2inches objFeet = new feet2inches (2,5);
        System.out.println ("Distance " +objFeet.Distance()+ "is equal to " +convertToInches(objFeet)+ 
                            "" +convertedTo);
        feet2inches objInches = new feet2inches (0,16);
        System.out.println ("Distance " +objInches.Distance()+ "is equal to " +convertToFeet(objInches)+ 
                            "" +convertedTo);
    }
}

                        
        
    
        
    
 