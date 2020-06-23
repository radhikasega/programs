class employee2
{
    public static void main ()
    {
        employee1 obj = new employee1 (124000);
        System.out.println ("The basic salary is " +obj.getBasic());
        System.out.println ("The gross pay is" +obj.allowances());
    }
}

    