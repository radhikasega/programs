public class Cuboid
{
    double length, bredth, height, volume;
    
    double getVolume ()
    {
        volume = length * bredth * height;
        return volume;
    }
    
    Cuboid (double l, double b, double h)
    {
        length = l;
        bredth = b;
        height = h;
    }
    
    Cuboid ()
    {
        length = 5.0;
        bredth = 3.0;
        height = 10.0;
    }
    
    public static void main ()
    {
        Cuboid vol1 = new Cuboid ();
        System.out.println ("The volume of the cuboid is " +vol1.getVolume());
        Cuboid vol2 = new Cuboid (73.00, 247.00, 6294.000);
        System.out.println ("The volume of the cuboid is " +vol2.getVolume());
    }
}

    
   