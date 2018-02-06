import java.util.Scanner;
import java.text.DecimalFormat;

public class MovieTickets {
	public static void main(String [] args){
	
		String movieTitle = "";
		int numChild = 0, numAdult = 0, numSenior = 0;
		
		final double CHILD_PRICE = 8.24;
		final double ADULT_PRICE = 11.54;
		final double SENIOR_PRICE = 9.89;
		
		double totalChild = 0, totalAdult = 0, totalSenior = 0, grandTotal = 0;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("$#,##0.00");
		
		
		System.out.println("Enter name of movie : " );
		movieTitle = scan.nextLine();   //terminates at enter
		
		System.out.println("How many child tickets : ");
		numChild = scan.nextInt();
		
		System.out.println("How many adult tickets : ");
		numAdult = scan.nextInt();
		
		System.out.println("How many senior tickets : ");
		numSenior = scan.nextInt();
		
		totalChild = numChild * CHILD_PRICE;
		totalAdult = numAdult * ADULT_PRICE;
		totalSenior = numSenior * SENIOR_PRICE;
		
		grandTotal = totalChild + totalAdult + totalSenior;
		
		System.out.printf("%s\n", movieTitle);
		System.out.printf("%15s%s%6s%s%6s%s\n"," ","Child"," ", "Adult"," ","Senior");
		
		System.out.printf("%-15s", "num tickets");
		System.out.printf("%d", numChild);
		System.out.printf("%11d", numAdult);
		System.out.printf("%11d\n", numSenior);
		
		System.out.printf("%-15s", "cost per");
		System.out.printf("%.2f", CHILD_PRICE);
		System.out.printf("%12.2f", ADULT_PRICE);
		System.out.printf("%10.2f\n", SENIOR_PRICE);
		
		System.out.printf("%-15s", "Total");
		System.out.printf("%.2f", totalChild);
		System.out.printf("%11.2f", totalAdult);
		System.out.printf("%10.2f\n", totalSenior);
		
		System.out.println("----------\nTotal Due : " + 
		                   formatter.format(grandTotal));
		
		
	}//end main()
}//end class