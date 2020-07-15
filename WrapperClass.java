class WrapperClass
{
    int a = 10;
    String b = "2647";
    char c = 'r';
    byte d = 4;
    short e = 36;
    long f = 183;
    float g = 46;
    double h = 249.72;
    
    void IntegerClass ()
    {
        int demo1 = Integer.parseInt (b);
        int demo2 = Integer.valueOf (b);
        String demo3 = Integer.toString (a);
        System.out.println (demo1 +","+ demo2 +","+ demo3);
    }
    
    void ByteClass ()
    {
        byte demo1 = Byte.parseByte (b);
        byte demo2 = Byte.valueOf (b);
        String demo3 = Byte.toString (d);
        System.out.println (demo1 +","+ demo2 +","+ demo3);
    }
    
    void ShortClass ()
    {
        short demo1 = Short.parseShort (b);
        short demo2 = Short.valueOf (b);
        String demo3 = Short.toString (e);
        System.out.println (demo1 +","+ demo2 +","+ demo3);
    }
    
    void LongClass ()
    {
        long demo1 = Long.parseLong (b);
        long demo2 = Long.valueOf (b);
        String demo3 = Long.toString (f);
        System.out.println (demo1 +","+ demo2 +","+ demo3);
    }
    
    void FloatClass ()
    {
        float demo1 = Float.parseFloat (b);
        float demo2 = Float.valueOf (b);
        String demo3 = Float.toString (g);
        System.out.println (demo1 +","+ demo2 +","+ demo3);
    }
    
    void DoubleClass ()
    {
        double demo1 = Double.parseDouble (b);
        double demo2 = Double.valueOf (b);
        String demo3 = Double.toString (h);
        System.out.println (demo1 +","+ demo2 +","+ demo3);
    }
    
    void CharacterClass ()
    {
        boolean demo1 = Character.isDigit (c);
        boolean demo2 = Character.isLetter (c);
        boolean demo3 = Character.isLetterOrDigit (c);
        boolean demo4 = Character.isLowerCase (c);
        boolean demo5 = Character.isUpperCase (c);
        boolean demo6 = Character.isWhitespace (c);
        char demo7 = Character.toLowerCase (c);
        char demo8 = Character.toUpperCase (c);
        System.out.println (demo1 +"\n"+ demo2 +"\n"+ demo3 +"\n"+ demo4 +"\n"+ demo5 +"\n"+ demo6 +"\n"+ demo7 +"\n"+ demo8);
    }
}

    
    
    
    
   
        

        
        