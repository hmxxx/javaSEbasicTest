//2019.7.31随机数
import java.util.Random;

public class RandomDemo{
    public static void main(String[] args){
	    Random random = new Random();
            int num = random.nextInt(26)+65;
			if(num>=65){
				char Rannum = ((char)num);
				System.out.print(Rannum);	
			}
	    	
}
}