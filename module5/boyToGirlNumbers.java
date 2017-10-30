
/**
 * This program will find the chance of each ratio of users kids gender using a text file.
 * 
 * @author (eric halonen) 
 * @version (10/29/17)
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class boyToGirlNumbers
{
    public static void main(String[] args) throws IOException
    {
        //.text file is brought in here
        String girlBoyString = "GB";
        File kidsFile1 = new File("MaleFemaleInFamily.txt");
        Scanner kidsFile = new Scanner(kidsFile1);
        
        //Input for number of family stimulations here
        Scanner kidsScanner = new Scanner(System.in);
        System.out.println(" Please enter amount of family stimulations here: ");
        String kidsString = kidsScanner.next();
        int kids = Integer.parseInt(kidsString);
        int kidsRan = 0;
        int boys2 = 0;
        int girls2 = 0;
        int girlBoy = 0;
        //loop for the .text file begins here
        while(kidsRan < kids)
        {
            if(kidsFile.hasNext("BB"))
            {
                boys2++;
            }
            else if(kidsFile.hasNext("GB"))
            {
                girlBoy++;
            }
            else if(kidsFile.hasNext("BG"))
            {
                girlBoy++;
            }
            else if(kidsFile.hasNext("GG"))
            {
                girls2++;
            }
            kidsRan++;
            kidsFile.next();
        }
        System.out.println("2 boys: " + boys2);
        System.out.println("2 Girls: " + girls2);
        System.out.print("1 Girl and 1 boy: " + girlBoy);
     }//end of main
}
   
