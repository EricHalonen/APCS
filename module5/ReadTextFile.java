import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class ReadTextFile
 {
 public static void main(String[] args) throws IOException
   {
    String token = "";
    Scanner inFile = new Scanner(new File("data1.txt"));
  while (inFile.hasNext())
    {
          token = inFile.next( );
       System.out.println (token);
    }
   inFile.close();
     }//end of main method
 }//end of class