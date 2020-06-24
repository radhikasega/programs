// Board Paper 2013
public class FruitJuice
{
    int product_code, pack_size, product_price;
    String flavour, pack_type;
    
    FruitJuice ()
    {
        product_code = 00;
        pack_size = 00;
        product_price = 00;
        flavour = "";
        pack_type = "";
    }
    
    void input (int code, int size, int price, String Flavour, String type)
    {
        product_code = code;
        pack_size = size;
        product_price = price;
        flavour = Flavour;
        pack_type = type;
    }
    
    void discount ()
    {
        product_price = product_price - 10;
    }
    
    void display ()
    {
        System.out.println ("The Product Code Number of the Fruit Juice is " +product_code);
        System.out.println ("The Flavour of the Fruit Juice is " +flavour);
        System.out.println ("The Type of Packaging of the Fruit Juice is " +pack_type);
        System.out.println ("The Package Size of the Fruit Juice is " +pack_size);
        System.out.println ("The Price of the Fruit Juice is " +product_price);
    }
    
    public static void main ()
    {
        FruitJuice obj = new FruitJuice();
        obj.input (4379, 250, 85, "Strawbeery Flavour", "Mini-Bottle Pack");
        obj.discount ();
        obj.display ();
    }
}
        