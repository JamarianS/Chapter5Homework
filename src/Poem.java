/**Class: Poem
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: October 20, 2023
 *
 * This class – program to read in the 10 numbers from the file Book1.csv
 * The program should then print the sum all the numbers,
 * find the lowest number, find the highest number, and computer the average
 */
import java.io.FileWriter;
import java.io.IOException;

    public class Poem
    {

        private String name;
        private String poet;

        /**
         * no-arg constructor
         */
        public Poem(String name, String poet)
        {
            // initialize attributes
            this.name = name;
            this.poet = poet;
        }

        public String getName()
        {
            return name;
        }

        public String getPoet()
        {
            return poet;
        }


    public static void main(String []args){
        Poem poem1 = new Poem("Harlem","Langston Hughes");
        Poem poem2 = new Poem("The Raven", "Edgar Allen Poe");
        Poem poem3 = new Poem("Ode to the West Wind", "Percy Shelley");

        try(FileWriter writer = new FileWriter("poems.txt")){
            writer.write(poem1.getName() + "\n");
            writer.write(poem1.getPoet() + "\n\n");

            writer.write(poem2.getName() + "\n");
            writer.write(poem2.getPoet() + "\n\n");

            writer.write(poem3.getName() + "\n");
            writer.write(poem3.getPoet() + "\n\n");

            System.out.println("Poems have been written to poems.txt");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
