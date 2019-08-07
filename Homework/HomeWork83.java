import java.util.*;

public class HomeWork83{
    public static void main(String[] args){
		/*
			//正方形
			for(int i = 0; i <=5;i++){
				for(int j = 0;j<=5;j++){
					System.out.print("*");
				
				}
				System.out.println(" ");
			}
		*/
		/*
			//空心正方形
			for(int i = 0;i<=5;i++){
				System.out.print("*");
				for(int j=0;j<=5;j++){
					if(i==0||i==5||j==5){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				
				}
				System.out.println();
			}
		*/
		/*
			//九九乘法表
			for(int i = 1;i<=9;i++){
				for(int j = 1;j<=i;j++){
					System.out.print(j+("*")+i+("=")+(j*i)+"\t");
				}
				System.out.println();
			}
		*/
		/*
			//房子
			for(int i=0;i<11;i++){
				if(i==6||i==10){
					System.out.println("**************");
				}else if(i>6&&i<10){
					System.out.println("*            *");
				}else if(i<5){
					for(int j=0;j<4-i;j++){
						System.out.print(" ");
					}
					System.out.print("*****");
					for(int k=0;k<2*i;k++){
						System.out.print(" ");
					}
					System.out.println("*");
				}
			}
		*/
		/*
		//合并数组
			int [] numA = {1,7,9,11,13,15,17,19};
			int [] numB = {2,4,6,8,10};
			int [] numC = new int[numA.length+numB.length];
			System.arraycopy(numA,0,numC,0,numA.length);
			System.arraycopy(numB,0,numC,numA.length,numB.length);
			Arrays.sort(numC);
			System.out.println(Arrays.toString(numC));
		*/
		/*
			//水仙花数
			for(int i=100;i<=1000;i++){
				int oneNum = i/100;
				int twoNum = i/10%10;
				int threeNum = i%10;
				if(oneNum*oneNum*oneNum+twoNum*twoNum*twoNum+threeNum*threeNum*threeNum == i){
					System.out.println("水仙花数："+i);
				}
			}
		*/
		/*
		//第八题
			int sum = 0;
			for(int i = 1;i<=1000;i++){
				for(int j=1;j<i;j++){
					if(i%j == 0)
						sum += j;
					if(sum == i)
						System.out.print(i +" ");
					
				}
			}
		*/
		
		/*
			//第十题
			int sum = 0;
			for(int i = 0;i<=100;i++){
				if(i%10 != 3){
				sum += i;
				}
			}
			System.out.print(sum);
		*/
		//买鸡
		for(int Rooster = 0;Rooster<=20;Rooster++){
			for(int hen = 0;hen<=33;hen++){
				if(Rooster*5+hen*3+(100-Rooster-hen)/3 == 100&&(100-Rooster-hen)%3==0){
					System.out.println("公鸡"+Rooster+"只，母鸡"+hen+"只，小鸡"+(100-Rooster-hen)+"只。")；
				}
			}
		}
		
		
	}
}























