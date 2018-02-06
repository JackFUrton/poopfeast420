import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class UnitConversion {
	public static void main (String [] args){
		double length = 0;
		double volume = 0;
		double temperature = 0;
	
		length = getLength();
		volume = getVolume();
		temperature = getTemp();
		
		
		displayAll(length, volume, temp);
	}//end main()
	
	public static void displayAll(double length, double volume, double temp){
		
		DecimalFormat formatter = new DecimalFormat("$#,###.00");
		System.out.println("length : " + length);
		System.out.println("volume : " + volume);
		System.out.println("temperature : " + temperature);
		System.out.println("Tuition : " + formatter.format(tuition));
		
		JOptionPane.showMessageDialog(null, "Residency : " + res + "\n" +
												"Level : " + lev + "\n" +
												"Credits : " + cred + "\n" +
												"Tuition : " + formatter.format(tuition));

												
	}//end displayAll()
		
	
	public static double calculateTuition(char res, char lev, int cred){
		double tuition = 0;
		if(res == 'i')		{	// don't need == 'I' used toLowerCase()
			if (lev == 'u' || lev == 'U')	{
				tuition = 483.27 * cred;
			}
			else {
				tuition = 1619.67 * cred;
			}//end else
		}//end if res	----- these are optional braces around if (res)
		else {
			if (lev == 'u' || lev == 'U')	{
				tuition = 1571.60 * cred;
			}
			else {
				tuition = 2370.56 * cred;
			}//end else
		}//end else 
		
		switch (res){
			case 'i' : 
						switch(lev) {
							case 'u':
							case 'U':tuition = 483.27 * cred;
										break; 
							case 'g':
							case 'G':tuition = 1619.67 * cred;
						}//end lev switch   
						break ; //end case 'i'
		
			case 'o' :
						switch(lev) {
							case 'u':
							case 'U':tuition = 1571.60 * cred;
										break; 
							case 'g':
							case 'G':tuition = 2370.56 * cred;
						}//end lev switch
						break; //case 'o'
			default: JOptionPane.showMessageDialog(null, "Invalid residency. Tuition set to 0");
		}//end switch(res)

		
			return tuition; 
	}//end caclculateTuition()
		
		
		
		
	public static int getNumCredits(){
		String str = "";
		str = JOptionPane.showInputDialog("enter credits");
		int credits = Integer.parseInt(str);
		return credits;
	}//end getNumCredits()
	
	public static char getResidency(){
		String str = "";
		str = JOptionPane.showInputDialog("enter residency - i or o");
		String str2 = str.toLowerCase();
		
		char ch = str2.charAt(0);
		return ch;
	}//end getResidency()
		
	public static char getLevel(){
		String str = "";
		str = JOptionPane.showInputDialog("enter residency - u or g");
		char ch = str.charAt(0);
		return ch;
	}//end getLevel()
	
}