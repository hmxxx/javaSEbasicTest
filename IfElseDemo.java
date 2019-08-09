package basic.day03;

public class IfElseDemo{
    public static void main(string[] args){
	    double base = 7.7/100;
		int years = 5;
		double rate = base;
		
		if(years<=1){
		    rate *= 0.5;
			
		}else if(years<=3){
		    rate *= 0.7;
		}else if(years<=5){
		    rate = base;
		}else{
		    rate *= 1.1;
		}
		System.out.print("实际利率（%）："+rate);
	}
}