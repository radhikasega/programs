class MINE 
{
    MINE()
    {
        calculate();
        System.out.print ("constructor");
    }
    public void calculate ()
    {
        show();
        System.out.print ("calculating ");
    }
    public void show ()
    {
        System.out.print ("I am displaying ");
    }
    public static void main (String args [])
    {
        MINE one = new MINE();
    }
}