import java.util.Scanner;
public class ShipmentCharges
{
    int units, bill;
    double discount, cost;
    void accept ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the total number of units consumed: ");
        int u = sc.nextInt ();
        units = u;
    }
    
    void calculate ()
    {
        if (units <= 15)
            bill = units*150;
        else if (units>15 && units<=20)
            bill = units*145;
        else if (units>20 && units<=30)
            bill = units*140;
        else if (units>30 && units<=50)
            bill = units*135;
        else 
            bill = units*130;
    }
    
    void discount ()
    {
        Scanner sc1 = new Scanner (System.in);
        System.out.println ("Enter the letter 'n' or 'N' if you are a normal customer and enter 'y' or 'Y' if you are special customer");
        char ch = sc1.next().charAt(0);
        switch (ch)
        {
            case 'y':
            case 'Y':
                     discount = bill*10/100;
                     cost = bill - discount;
                     System.out.println ("The total cost is " +cost);
                     break;
            case 'n':
            case 'N':
                     System.out.println ("The total cost is " +bill);
                     break;
            default:
                     System.out.println ("The letter you have entered is invalid.");
                     break;
        }
    }
    
    public static void main ()
    {
        ShipmentCharges obj = new ShipmentCharges ();
        obj.accept ();
        obj.calculate ();
        obj.discount ();
    }
}

                      
                      
            
        
        