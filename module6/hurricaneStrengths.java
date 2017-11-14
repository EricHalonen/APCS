
/**
 * Write a description of class hurricaneStrengths here.
 * 
 * @author Eric Halonen
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
        File hurrDataFile = new File("hurcdata2.txt");
        Scanner hurrData = new Scanner(hurrDataFile);
        //Create initial print statements
        System.out.println("           Hurricane data");
        System.out.printf("%7s","year: ");
        System.out.println();
        String line = "";
        String secondLine= "";
        while(hurrData.hasNext())
        {
            line = hurrData.next();
            secondLine = hurrData.nextLine();
            System.out.printf("%7s",line);
            System.out.printf("%25s",secondLine);
            System.out.println();
        
    

      
    