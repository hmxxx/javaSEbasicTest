import java.util.*;

public class HomeWork82{
    public static void main(String[] args){
		/*
			//练习五
			String nums="692116851128";
			int sum = 0;
			int sum2 = 0;
			for(int i = 0;i<nums.length();i++){
				if(i%2==0){
					sum += nums.charAt(i)-'0';
					
				}else{
					sum2 +=nums.charAt(i)-'0';
				}
				
			}
			System.out.println("奇数和："+sum);
			System.out.println("偶数和："+sum2);
			System.out.println("奇数和和偶数和的三倍："+(sum+3*sum2));
			System.out.println("个位数对10取余"+((sum+3*sum2)%10));
			double step4 = (sum+3*sum2)%10;
			double step5 = 10-step4;
			double step6 = step5%10;
			System.out.println("校验码："+step6);
		*/
		/*
			//统计一个字符在字符串中的所有位置
			String str="统计一个字符在字符串中的所有位置";
			Scanner scanner = new Scanner(System.in);
			System.out.print("请输入查找的字");
			String content = scanner.next();
			char first = content.charAt(0);
			byte[] pos = {};
			for(int i = 0;i<str.length();i++){
				char c = str.charAt(i);
				if(c == first){
					pos = Arrays.copyOf(pos,pos.length+1);
					pos[pos.length-1] = (byte)i;
				}
			}
			System.out.print(Arrays.toString(pos));
		*/
		/*
			//统计一个字符在字符数组中的所有位置
			char[] chs={'统','计','一','个','字','符','在','字','符','数','组','中','的','所','有','位','置'};
			Scanner scanner = new Scanner(System.in);
			System.out.print("请输入查找的字");
			String content = scanner.next();
			char first = content.charAt(0);
			byte[] pos = {};
				for(int i = 0;i<chs.length;i++){
					char c = chs[i];
					if(c == first){
						pos = Arrays.copyOf(pos,pos.length+1);
						pos[pos.length-1] = (byte)i;
					}
				}
			System.out.print(Arrays.toString(pos));
		*/
		/*
			//将整数各位翻转
			int num = 56123;
			String changedNum = String.valueOf(num);
			StringBuffer stringBuffer = new StringBuffer(changedNum);
			StringBuffer stringBuffer2 = stringBuffer.reverse();
			String str = stringBuffer2.toString();
			int finalNum = Integer.parseInt(str);
			System.out.print(finalNum);
		*/
		//字符串统计
		String str = "123456789012";
		int c1 = 0;
		int c2 = 0;
		for(int i=0;i<=str.length();i++){
			if(i%2==0){
				c1 +=str.charAt(i)-'0';
			}else{
				c2 +=str.charAt(i)-'0';
			}
		}
		
		System.out.println("c1："+c1);
		System.out.println("c2："+c2);
	}
}








