import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String titleOfBook;
        String genreOfBook;
        String repeat;

        int numberOfPages;

        boolean exit = false;

        Library lb = new Library();

        try(Scanner input = new Scanner(System.in))
        {
            do{
                System.out.print("Please enter the title of the book: ");
                titleOfBook = input.nextLine();
                System.out.print("Please enter the genre of the book: ");
                genreOfBook = input.nextLine();
                System.out.print("Please enter the number of pages in the book: ");
                numberOfPages = input.nextInt();

                input.nextLine();

                Book bk = new Book(titleOfBook, genreOfBook, numberOfPages);
                lb.add(bk);

                System.out.print("Would you like to enter another book? (y/n) ");
                repeat = input.nextLine();

                if(repeat.equalsIgnoreCase("y"))
                {exit = false;}
                else {exit = true;}
            }while(!exit);

            System.out.println("Books Added to library: ");
            System.out.println(lb.libraryBooks.toString());
            
        }
        catch(Exception e)
        {
            System.out.println("Sorry that was an invalid input, please try again");
        }         

    }
}
