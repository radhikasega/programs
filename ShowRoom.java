// Board Paper 2019
public class ShowRoom
{
    String name;
    long mobno;
    double cost, dis, amount;
    
    ShowRoom ()
    {
        name = " ";
        mobno = 0000;
        cost = 00.00;
    }
    
    void input (String n, long mobile_no, double c)
    {
        name = n;
        mobno = mobile_no;
        cost = c;
    }
    
    void calculate ()
    {
        if (cost<=10000)
        {
            dis = cost * 5/100;
            amount = cost - dis;
        }
        else if ((cost>10000)&&(cost<=20000))
        {
            dis = cost*10/100;
            amount = cost - dis;
        }
        else if ((cost>20000)&&(cost<=35000))
        {
            dis = cost*15/100;
            amount = cost - dis;
        }
        else
        {
            dis = cost * 20/100;
            amount = cost - dis;
        }
    }
    
    void display ()
    {
        System.out.println ("The name of the customer is " +name);
        System.out.println ("The mobile number of the customer is " +mobno);
        System.out.println ("The amount to be paid after discount is " +amount);
    }

    public static void main ()
    {
     ShowRoom obj = new ShowRoom ();
     obj.input("Alicia Spencer", 932357655, 17500);
     obj.calculate();
     obj.display();
    }
}

    
        
        
            
        
        
        
    
        