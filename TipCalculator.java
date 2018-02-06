import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.text.DecimalFormat;

public class TipCalculator {
	public static void main(String [] args){
		double billAmount = 0;
		int tipChoice = 0;
		double total = 0;
		
		billAmount = getBillAmount();
		tipChoice = getTipChoice();
		total = calculateBill(billAmount, tipChoice);
		displayAll(total, billAmount, tipChoice);
		
		
	}//end main()
	
	public static void displayAll(double total, double billAmount, int tipChoice){
	DecimalFormat formatter = new DecimalFormat("$#,###.00");
	JOptionPane.showMessageDialog(null, "Bill " + formatter.format(billAmount) + "Tip % :" + tipChoice + "%\n" + "Total : " +formatter.format(total));
	}//DisplayAll()
	
	
	public static double calculateBill(double billAmount,int tipChoice){
		double total = 0;
		total = billAmount + (billAmount * (tipChoice/100.0));
		return total;
	}//end calculateBill()
	
	public static int getTipChoice (){
		int tip = 0;
		Object[] options = {"10%", "15%", "20%"};
      ImageIcon icon = new ImageIcon("math.jpg");
      int n = JOptionPane.showOptionDialog(null,
         "Which tip %? ",
         "Tip % selector",
         JOptionPane.DEFAULT_OPTION,
         JOptionPane.PLAIN_MESSAGE,
         icon,
         options,
         options[2]);
			
			if (n ==0)
				tip = 0;
			else if (n==1)
				tip = 15;
			else 
				tip = 20;
				
			return tip;
			
	}//end getTipChoice()
	
	public static double getBillAmount(){
		String str = "";
		str = JOptionPane.showInputDialog("enter bill amount");
		double bill = Double.parseDouble(str);
		return bill;
	}//end getBillAmount()
}//end class