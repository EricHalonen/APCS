
/**
 * This program will calculate the heat index of key West, Florida
 * 
 * @author (Eric Halonen) 
 * @version (1)
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.lang.Math;
public class heatIndex
{
    public static void main(String[] args) throws IOException
    {
        //Read in text files here
        File keyWestTemp = new File("KeyWestTemp.txt");
        Scanner Temp = new Scanner(keyWestTemp);
        
        String months [] ={"Jan", "Feb", "Mar", "Apr", "may", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.printf("%23s Index: Key West, Florida", "Heat");
        System.out.println();
        System.out.printf("%-10s ","Months");
        for(String m : months )
        {
           System.out.printf("%6s", m );
        }
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("%-10s ","Temp(F):");
        double[] doubleTempArray = new double[12];
        int ran = 0;
        double temperature =0.0;
        while(Temp.hasNext())
        {
            String y = Temp.next();
            System.out.printf("%6s", y ); 
            temperature = Double.parseDouble(y);
            doubleTempArray[ran] = temperature;
            ran++;
        }    
        System.out.println();      
        File keyWestHumid = new File("KeyWestHumid.txt");
        Scanner Humid = new Scanner(keyWestHumid);
        System.out.printf("%10s", "Humidity(%)");
        double[] doubleHumidArray = new double[12];
        double humidity = 0.0;
        int runs = 0;
        while(Humid.hasNext())
        {
            String x = Humid.next();
            System.out.printf("%6s", x);
            humidity = Double.parseDouble(x);
            doubleHumidArray[runs] = humidity;
            runs++;
        }
        System.out.println();    
        //declare variables
        double heatIndex = 0;
        double tmp1 = 0.0;
        double tmp2 = 0.0;
        double tmp3 = 0.0;
        double h = 0.0;
        double t= 0.0;
        System.out.printf("%-10s","Heat Index:");
        for(int run =0; run < 12; run++)
        {
            h = doubleHumidArray[run] ;
            t = doubleTempArray[run] * .01;
            //lengthy HI equation broken up into smaller ones to make easier to read/less errors tmp=temporary variable
            tmp1 = -42.379 + (2.04901523 * t) + (10.14333127 * h);  
            tmp2 = tmp1 - (.22475541 * t * h) - (.00683783 * (t * t));
            tmp3 = tmp2- (.005481717  * (h * h)) + (.00122874  * (t * t) * h);
            heatIndex = tmp3 + (.0085282  * ( h * h) * t) - (.0000199  * (t * t) * (h * h));
            System.out.printf("%6.4s", heatIndex);
        }    
        }//end of main
}
        
        