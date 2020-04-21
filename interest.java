class interest
{
    double p, r, n, i;
    void init()
    {
        p = 2000;
        n = 5;
        r = 2;
    }
    void calc()
    {
        i = (p*r*n)/100;
    }
    void print()
    {
        System.out.println("The interest is "+i);
    }
    public static void main()
    {
        interest obj = new interest();
        obj. init();
        obj.calc();
        obj.print();
    }
}
