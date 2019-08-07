import java.util.*;

public class HomeWork85{
     public static void main(String[] args){
		/*
		//杨辉三角
			int num = 10;
			int[] yangHui = new int[(1+num)*num/2];
			for(int i = 0;i<num;i++){
				for(int j=0;i<(num-i-1)/2;j++){
					System.out.print("\t");
				}
				int temp = (1+i)*i/2;
				for(int j=0;j<=i;j++){
					if(j==0||j==i){
						yangHui[temp+j]=1;
					}else{
						yangHui[temp+j] = yangHui[temp+j-i]+yangHui[temp+j-i-1];
						System.out.print(yangHui[temp+j]+"\t");
					}
				}
				
			}
			System.out.println(); 
		*/
		/*
			//兔子
			int i = 1,j = 0,x = 0;
			for(int month = 1;month<=36;month++){
				x = i;
				System.out.println("第"+month+"个月有"+2*i+"只兔子。");
				i = i+j;
				j=x;
			}
		*/
		/*
			//围圈圈
			Scanner scanner = new Scanner(System.in);
			System.out.print("请输入排成一圈的人数：")；
			int n=scanner.nextInt();
			boolean[] arr= new boolean[n];
			for(int i = 0;i<arr.length;i++){
				arr[i]=true;
			}
			int leftCount = n;
			int countNum = 0;
			int index = 0;
			while(leftCount>1){
				if(arr[index]==true){
					countNum++;
					if(countNum==3){
						countNum=0;
						arr[index]=false;
						leftCount--;
					}
				}
				index++;
				if(index==n){
					index=0;
				}
			}
			for(int i=0;i<n;i++){
				if(arr[i]==true){
					System.out.println("原排在第"+(i+1)+"位的人留下了。");
				}
			}
		*/
		/*
			//传输数据
			Scanner scanner = new Scanner(System.in);
			System.out.print("请输入数字：")；
			int n=scanner.nextInt();
			int oneNum=n%10;
			int twoNum=n/10%10;
			int threeNum=n/100%10;
			int forthNum=n/1000;
			oneNum=(oneNum+5)%10;
			twoNum=(twoNum+5)%10;
			threeNum=(threeNum+5)%10;
			forthNum=(forthNum+5)%10;
			finalNum=forthNum*1000+twoNum*100+threeNum*10+oneNum
			System.out.println("结果是："+finalNum);
		*/
		//小球
		double height=100,sum=100;
		for(int i=1;i<=9;i++){
			height=height/2;
			sum=sum+2*height;
		}
		height=height/2;
		System.out.println("第十次落地时的高度为："+height+"\n小球共经过："+sum+"米");
	 }
}















