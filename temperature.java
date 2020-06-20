public class temperature
{
    double temp; //Instance variable
    public temperature () //No argument or non-parametrised constructor
    {
        temp = 57;
    }
    public temperature (double t) //Parametrised constructor
    {
        temp = t;
    }
    double convert2celsius () //Methood for conversion from celsius to farenheit
    {
       double cel = (5.0/9)*(temp-32);
       return cel;
    }
    double get_temp ()
    {
       return temp;
    }
}


    
     