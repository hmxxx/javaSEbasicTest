public class Calculator{
    public static void main(String[] args){
	    double newResult =getQua(10,50);
		System.out.print(newResult);
	}
	/*public static double getSum(double num1,double num2){
	    double result = num1+num2;
		return result;
	}*/
	/*public static double getDiff(double num3,double num4){
		double result = num3-num4;
		return result;
	}*/
	public static double getQua(double num1,double num2){
		double result = num1*num2;
		return result;
	}
}