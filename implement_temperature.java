class implement_temperature
{
   public static void main (String args [])
   {
     temperature obj = new temperature (94); //First object
     System.out.println ("The temperature in fearenheit is " +obj.get_temp());
     System.out.println ("The temperature in celsius is "+obj.convert2celsius());
     temperature obj2 = new temperature(); //Second object
     System.out.println ("The other temperature in farenheit is "+obj2.get_temp());
     System.out.println ("The other temperature in celsius is "+obj2.convert2celsius());
   }
}