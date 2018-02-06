public class DoubleTest {
	public static void main(String []args){
		double x = 0, y =0;
		
		double a = 0.3;
		double b = 0.1 + 0.1 + 0.1;
		
		
		x = Math.sqrt(5.0); //4 is fine, too
		y = x * x;
		
		
		System.out.printf("%f.20f\n", x);
		System.out.printf("%.20f\n", y);
		System.out.printf("%.20f\n", a);
		System.out.printf("%.20f\n", b);

	}
}