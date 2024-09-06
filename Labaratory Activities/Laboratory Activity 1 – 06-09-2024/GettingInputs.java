import java.util.Scanner;

public class GettingInputs {
    public static void main (String[] args ){
        int date_Year;
        String name_Genre;
        String name_Album;
        String name_Title;
        String name_Artist;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        date_Year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the genre: ");
        name_Genre = scanner.nextLine();
        
        System.out.print("Enter the album: ");
        name_Album = scanner.nextLine();
        
        System.out.print("Enter the song title: ");
        name_Title = scanner.nextLine();
        
        System.out.print("Enter the artist: ");
        name_Artist = scanner.nextLine();
        
        System.out.println("--------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------------------");
        System.out.println("Year Release: " + date_Year);
        System.out.println("Genre: " + name_Genre);
        System.out.println("Album: " + name_Album);
        System.out.println("Title: " + name_Title);
        System.out.println("Artist: " + name_Artist);
        
        scanner.close();
    }
}
