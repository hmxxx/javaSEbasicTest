import java.util.Scanner;

public class Practice{
    public static void main(String[] args){
	    double result = fX();
		System.out.print(result);
	}
	public static double fX(){
	     
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("x=");
		 double x = scanner.nextDouble();
		 return (x*x - 2*x +4);
	}
}