import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Movie theMovie = Movie.getMovie("Science", "Star Wars");
        //theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S fo SciFi , or Q to quit): ");

            String type = s.nextLine();
            if("Qq".contains(type)) {
                System.out.print("Have a nice day :)");
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title  = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }


    }
}