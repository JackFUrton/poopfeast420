import java.util.Scanner;

public class CelsiusConversion {

   public static void main(String[] args){
   
      float temp;
      System.out.println("Enter the temp to conver in to celsius");
      Scanner sc=new Scanner(System.in);
      temp=sc.nextFloat();
      temp=((temp-32)*5)/9;
      System.out.println("temp in celsius" +temp);
      
      }
}