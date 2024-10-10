package midterm;

import java.util.*;

public class QueueSample {
    
    public static void main(String[] args) {
        Queue<String> foods = new  LinkedList<String>();

        // i add food to the queue

        foods.offer("Tapsilog");
        foods.offer("BBQ");
        foods.offer("Siomai Rice");
        foods.offer("Sisig");
        foods.offer("Burger Steak");

       
        System.out.println("Available foods: " + foods);
        System.out.println("The first food to be served is: "+ foods.peek());

         // i remove food to the queue until it becomes empty!
        while(!foods.isEmpty()) {
            System.out.println("The food "+ foods.poll() + " has been removed to the queue");
            
            
        }
        System.out.println("Available foods: "+ foods);

        if(foods.isEmpty()) {
            System.out.println("No more foods!!!!");
        }else {
            System.out.println("There is more foods!");
        }
    }

}