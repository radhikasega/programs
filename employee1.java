// Board Paper 2005
class employee1
{
    float basic;
    employee1 (float basic1)
    {
        basic = basic1;
    }
    
    float getBasic()
    {
        return basic;
    }
    
    double allowances ()
    {
       double dearness = (basic*25)/100;
       double house_rent = (basic*15)/100;
       double net_pay = basic + dearness + house_rent;
       double provident = (basic*8.33)/100;
       double gross_pay = net_pay - provident;
       return gross_pay;
    }
    
    public static void main ()
    {
        employee1 obj = new employee1 (124000);
        System.out.println ("The basic salary is " +obj.getBasic());
        System.out.println ("The gross pay is" +obj.allowances());
    }

}
    

           