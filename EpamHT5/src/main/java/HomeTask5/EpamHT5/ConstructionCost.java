package HomeTask5.EpamHT5;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {
	private static final Logger LOGGER = LogManager.getLogger(CalculateInterest.class);
	public static void ConstCost() {
		Scanner sc = new Scanner(System.in);
		LOGGER.error("Construction cost estimation:- ");
		LOGGER.error("Available Materials:- ");
		LOGGER.error("1. Standard materials");
		LOGGER.error("2. Above standard materials");
		LOGGER.error("3.High standard materials");
		LOGGER.error("4. High standard materials and fully automated home");
		LOGGER.error("Choose(1-4): ");
		try {
		int choice = sc.nextInt();
		double area, cost;
		switch(choice) {
		case 1:
		LOGGER.error("Enter the area of house: ");
		area = sc.nextDouble();
		cost = (1200 * area);
		LOGGER.error("Cost = " +cost+" Rupees");
		break;
		case 2:
		LOGGER.error("Enter the area: ");
		area = sc.nextDouble();
		cost = (1500 * area);
		LOGGER.error("The total cost to build the house = " +cost+" Rupees");
		break;
		case 3:
		LOGGER.error("Enter the area: ");
		area = sc.nextDouble();
		cost = (1800 * area);
		LOGGER.error("The total cost to build the house = " +cost+ " Rupees");
		break;
		case 4:
		LOGGER.error("Enter the area: ");
		area = sc.nextDouble();
		cost = (2500 * area);
		LOGGER.error("The total cost to build the house = " +cost+ " Rupees");
		break;
		default:
		LOGGER.error("Please enter a valid input!!! ");
		}
		} catch (Exception e) {
		LOGGER.error("Please enter a valid input!");
	
		}
		}

}
