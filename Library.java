// Question for Programming 10 marks test 
public class Library
    {
        int acc_num;
        String title, author;
            
        void input (int acc_number, String t, String a) //A method to input the value from user
        {
                 acc_num = acc_number;
                 title = t;
                 author = a;
        }
            
        void compute (int daysLate) //A method to compute the total fine and display it
        {
                int fine = daysLate * 2;
                System.out.println ("The fine is " +fine); //It displays the total fine 
        }
        
        void display () //It is used to display the details of the book
        {
                 System.out.println ("Accession Number" +"\t"+ "Title" +"\t"+ "Author");
                 System.out.println (acc_num +"\t"+ title +"\t"+ author);
        }
        
        public static void main ()//Main method
        { 
          Library Book = new Library();//A new object is created
          Book.input (5386, "Harry Potter and The Chamber of Secrets", "J.K. Rowling");
          Book.compute (7);
          Book.display ();
        }
}
  
                 
