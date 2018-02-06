import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter2Part2 {
	public static void main(String []args){
		int a, b;
		double x, y;
		String str = "";	//instantiate string
		
		a = b = 10;
		x = y = 0;	//watch the order if combine
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		
		//a++;	
		//++b;
		
		x = ++a + 10;
		
		System.out.println(a +"\t\t" + b);
		System.out.printf("x = %.29f \n", x);
		
		
		//combined assignment
		a += 100;	//	/=, %=, -=, *=
		
		System.out.println(a);
		
		x = 55.55555;
		a = (int)x;
		
		y = (double)a;
		
		y = a / b;	//cast at least one for floating point precision 
		 
		char ch = (char) a;	//ASCII 55 is character 7
		
		System.out.println(ch);
		
			}//end main()
}//end class


/*
System.out.printf("%10d cubed is %10.2f\n", a, x);
	   str = String.format("%10d cubed is %10.2f\n", a, x);
		System.out.println(str); 
	System.out.println(String.format("%10d cubed is %10.2f\n", a, x));
	
	System.out.print("Enter int : ");
		a = scan.nextInt();	//could use nextShort(), could use nextByte()
		
		//NO NO
		//b = Math.pow(a, 3);
		x = Math.pow(a, 3);
		
		System.out.println(a + " cubed is " + formatter.format(x));
		b = 10 * (2 - a) + 18 / 6;
		System.out.println(b);

	
	
	
	
	
*/

