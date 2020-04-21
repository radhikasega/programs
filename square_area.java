class square_area
{
    int area,s;
    void init (int side)
    {
        s=side;
    }
    void calculate ()
    {
        area = s*s;
    }
    void print ()
    {
        System.out.println("The area of the square is "+area);
    }
   public static void main()
   {
       square_area obj = new square_area();
       obj.init(4);
       obj.calculate();
       obj.print();
    }
}
       
     
  