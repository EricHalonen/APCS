
/**
 * Write a description of class hurricaneStrengths here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class hurricaneStrengths

{
    public static void main(String[] args) throws IOException
    {
        //read in files here
        File hurrDataFile = new File("hurcdata2");
        Scanner hurrData = new Scanner(hurrDataFile);
        //Create initial print statements
        System.out.println("           Hurricane data");
        System.out.printf("%7s year: ");
        System.out.printf("&7s ");
        System.out.printf("&7s ");
        System.out.printf("&7s ");
        while(hurrData.hasNext())
        {
            System.out.println(hurrData);
        }
    }
}
      
    