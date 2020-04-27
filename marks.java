class marks
{
    int eng, maths, hindi, avg;
    void init(int e, int m, int h)
    {
        eng = e;
        maths = m;
        hindi = h;
    }
    int calculate()
    {
        avg = (eng+maths+hindi)/3;
        return avg;
    }
     public static void main()
 {
     marks obj = new marks ();
     obj.init(99,94,93);
     int avg = obj.calculate();
     System.out.print("The aveage is "+avg); 
    }
}
        