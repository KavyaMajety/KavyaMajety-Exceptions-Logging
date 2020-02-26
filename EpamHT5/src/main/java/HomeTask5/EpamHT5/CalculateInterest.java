package HomeTask5.EpamHT5;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateInterest {
	
	private static final Logger LOGGER = LogManager.getLogger(CalculateInterest.class);
		public static void CalInterest() {
			Scanner sc = new Scanner(System.in);
			LOGGER.error("Enter the principle amount: ");
			try {
			double principal = sc.nextDouble();
			LOGGER.error("Enter the time period(in years) : ");
			double timePeriod = sc.nextDouble();
			LOGGER.error("Enter the rate: ");
			double rate = sc.nextDouble();
			LOGGER.error("The simple interest = " +((principal * timePeriod * rate) / 100));
			LOGGER.error("The compound interest = " +((principal * Math.pow(1 + (rate / 100), timePeriod)) - principal));
		
			} catch (Exception e) {
			LOGGER.error("Please enter a valid input!");
		
			}
			LOGGER.error("*******************************************");
		
		
			}
	
		}



