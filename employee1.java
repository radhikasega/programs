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

}
    

           