/**Class: Circle
 * @author Jah St. Aimee
 * @version 1.0
 * Course: ITEC 2150 Fall 2023
 * Written: August 21, 2023
 *
 * This class – returns the area of the circle.
 * By creating an instance of the class and calculate its area.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Poem2 {

    private String name;
    private String poet;


    public Poem2(String name, String poet) {
        // Initialize attributes
        this.name = name;
        this.poet = poet;
    }

    public String getName() {
        return name;
    }

    public String getPoet() {
        return poet;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("poem2.txt"))) {
            String line;
            String poemName = null;
            String poemPoet = null;

            while ((line = reader.readLine()) != null) {
                if (poemName == null) {
                    poemName = line;
                } else {
                    poemPoet = line;
                }

                if (poemName != null && poemPoet != null) {
                    Poem2 poem = new Poem2(poemName, poemPoet);
                    System.out.println("Name: " + poem.getName());
                    System.out.println("Poet: " + poem.getPoet());
                    System.out.println();

                    // Reset poemName and poemPoet
                    poemName = null;
                    poemPoet = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
