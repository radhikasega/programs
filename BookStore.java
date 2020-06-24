public class BookStore
{
    public static void main ()
    {
        Book Book1 = new Book ("Fict101", "Harry Potter and the Chamber of Secrets",450.00);
        Book Book2 = new Book ("Myth101","Hercules",375.00);
        Book Book3 = new Book ("Religious101","The Bible",820.00);
        System.out.println ("Book 1 Details");
        System.out.println ("Code: "+Book1.getCode()+"    Title: "+Book1.getTitle()+"    Price: "+Book1.getPrice());
        System.out.println();
        System.out.println ("Book 2 Details");
        System.out.println ("Code: "+Book2.getCode()+"    Title: "+Book2.getTitle()+"    Price: "+Book2.getPrice());
        System.out.println();
        System.out.println ("Book 3 Details");
        System.out.println ("Code: "+Book3.getCode()+"    Title: "+Book3.getTitle()+"    Price: "+Book3.getPrice());
    }
}