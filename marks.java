class marks
{
    int eng, maths, hindi, avg;
    void init(int e, int m, int h)
    {
        eng = e;
        maths = m;
        hindi = h;
    }
    void calculate()
    {
        avg = (eng+maths+hindi)/3;
    }
    void print()
    {
        System.out.println("The average marks of the student in hindi, english and maths is "+avg);
    }
     public static void main()
 {
     marks obj = new marks ();
     obj.init(99,94,93);
     obj.calculate();
     obj.print();
    }
}
        