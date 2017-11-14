/**
 * Annual Climate description:
 *
 * @author:Eric Halonen
 * @version: 1
 *
 */
import java.util.Scanner;
class AnnualClimate
{
    public static void main (String [ ] args)
	{

		//Declare and intialize variables - programmer to provide initial values
		String city = "Vero Beach";
		String state = "Florida";

		String month [] ={"Jan", "Feb", "Mar", "Apr", "may", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		double temperature [] ={63.0, 63.9, 67.7, 71.5, 76.2, 80.4, 81.7, 81.6, 80.7, 76.5, 70.5, 64.7}; 		//initialize with Fahrenheit values
		double precipitation [] ={2.9, 2.5, 4.2, 2.9, 3.8, 6.0, 6.5, 6.0, 6.8, 5.0, 3.0, 2.2}; 	//initialize with inches values
        //double temperature [] ={63.0, 63.9, 67.7, -40, 76.2, 80.4, 81.7, 81.6, 80.7, 76.5, 0, 64.7}; 		//initialize with Fahrenheit values
		//double precipitation [] ={2.9, 2.5, 4.2, 2.9, 3.8, 90, 6.5, 6.0, 6.8, 0, 3.0, 2.2};
		String tempLabel = "F";   //initialize to F
		String precipLabel = "cm"; //initialize to cm

        //INPUT - ask user for temp and preciptation scale choice
        Scanner userInputScanner = new Scanner(System.in);
		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = userInputScanner.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = userInputScanner.next();
		
        //PROCESSING - convert from F to C and in to cm based on user's choices
		// remember 5/9 = 0, 5.0/9 = .5555
       	if(precipChoice.equalsIgnoreCase("c") && tempChoice.equalsIgnoreCase("C"))
		{
            tempLabel="(C)";
            precipLabel = "(cm)";
		    System.out.println();
		    System.out.println("Climate Data");
		    System.out.printf("Location: %s, %s", city, state);
		    System.out.println();
		    System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		    System.out.println();
		    System.out.printf("***************************************************");
		    System.out.println();
            double sumRain = 0.0;
            double sumTemp = 0.0;
          for( int ran = 0; ran < temperature.length; ran++)
		  { 
			double tempCelcius = (temperature[ran] - 32.0) * (5.0/9.0);
            double rainCenti = (precipitation[ran]) * 2.54; 
			System.out.printf("%5s %18.1f %18.1f", month[ran] , tempCelcius, rainCenti);
			System.out.println();
			sumRain = sumRain + rainCenti;
			sumTemp = sumTemp + tempCelcius;
           }
          double averageTemp = sumTemp/temperature.length;
          System.out.printf("Average temp(Celcius): " + "%4.1f", averageTemp);
          System.out.println();
          System.out.printf("Total rainfall(cm): " + "%4.1f", sumTemp);
          System.out.println();
		}
        else if(precipChoice.equalsIgnoreCase("i") && tempChoice.equalsIgnoreCase("F"))
        {
            System.out.println();
		    System.out.println("Climate Data");
		    System.out.println("Location: " + city +", " + state);
		    System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		    System.out.println();
		    System.out.printf("***************************************************");
		    System.out.println();
		    double totalTempFaren = 0.0;
		    double totalRainFallInch = 0.0;
		    for(int index = 0; index < temperature.length; index++)
		    {
		        double farenTemp = temperature[index];
		        double inchHeight = precipitation[index];
		        System.out.printf("%5s %18.1f %18.1f", month[index], farenTemp, inchHeight);
		        System.out.println();
		        totalTempFaren = totalTempFaren+ farenTemp;
		        totalRainFallInch = totalRainFallInch + inchHeight;
            } 
            double averageTempFaren = totalTempFaren/temperature.length;
            System.out.printf("Average temp(Farenheight): " + "%4.1f", averageTempFaren);
            System.out.println();
            System.out.printf("Total Rainfall(inches): " + "%4.1f", totalRainFallInch);
            System.out.println();
        }
	}//end main
}//end Annual Climate