import java.util.Scanner;

public class Shopping
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        float PurchaseAmount, Discount = 0;
        float AdditionalDiscount = 0, NetAmount = 0;
        System.out.println ("BigLife Garment Store");
        System.out.println ("Enter purchase amount: ");
        if (sc.hasNextFloat ())
        {
             PurchaseAmount = sc.nextFloat ();
             
             if (PurchaseAmount <= 5000)
                 Discount = 400;
             else if ((PurchaseAmount > 5000) && (PurchaseAmount <= 10000))
                 Discount = 800;
             else if ((PurchaseAmount > 10000) && (PurchaseAmount <= 20000))
                 Discount = 1000;
             else if (PurchaseAmount > 20000)
                 Discount = 2000;
             
             NetAmount = PurchaseAmount - Discount;
             System.out.println ("The Purchase Amount is " +PurchaseAmount);
             System.out.println ("The Discount Amount is " +Discount);
             
             if (PurchaseAmount > 20000)
             {
                 AdditionalDiscount = NetAmount * 3/100;
                 System.out.println ("Additional Discount on " +NetAmount+ "is " +AdditionalDiscount);
                 NetAmount = NetAmount - AdditionalDiscount;
             }
             
             System.out.println ("The Net Amount is " +NetAmount);
        }
        else 
        {
            System.out.println ("Non-integer value entered");
        }
    }
}

            
                
  