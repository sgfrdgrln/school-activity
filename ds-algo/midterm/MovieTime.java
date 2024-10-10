import java.util.*;

public class MovieTime {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String chosenMovies, chosenSnacks;

        int movieCount = 0, snackCount = 0;
        
        Queue<String> movies = new LinkedList<String>();
        Queue<String> snacks = new LinkedList<String>();

        while(movieCount < 3) {
            System.out.print("Enter movie " + (movieCount + 1) + " of 3: ");
            chosenMovies = input.nextLine();
            if(chosenMovies.isEmpty()) {
                System.out.println("Please input a movie title.");
            }else {
                movies.offer(chosenMovies);
                movieCount++;
            }
            
        }

        while(snackCount < 3) {
            System.out.print("Enter snack " + (snackCount + 1) + " of 3: ");
            chosenSnacks = input.nextLine();
            if(chosenSnacks.isEmpty()) {
                System.out.println("Please input a snack.");
            }else {
                snacks.offer(chosenSnacks);
                snackCount++;
            }
            
        }
       

        System.out.println("Movies to watch are: " + movies);
        System.out.println("Snacks available are: " + snacks);

        while(!snacks.isEmpty()) {
            System.out.println("Press S to finish a snack.");
            String action = input.nextLine();

            if(action.equalsIgnoreCase("S")) {
                snacks.poll();

                if(snacks.size() != 0) {
                    System.out.println(snacks);
                }else {
                    System.out.println("No more snacks.");
                }
            }
        }

    }

}
