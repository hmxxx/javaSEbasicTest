import java.util.*;

public class HomeWork82{
    public static void main(String[] args){
		/*
			//��ϰ��
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
			System.out.println("�����ͣ�"+sum);
			System.out.println("ż���ͣ�"+sum2);
			System.out.println("�����ͺ�ż���͵�������"+(sum+3*sum2));
			System.out.println("��λ����10ȡ��"+((sum+3*sum2)%10));
			double step4 = (sum+3*sum2)%10;
			double step5 = 10-step4;
			double step6 = step5%10;
			System.out.println("У���룺"+step6);
		*/
		/*
			//ͳ��һ���ַ����ַ����е�����λ��
			String str="ͳ��һ���ַ����ַ����е�����λ��";
			Scanner scanner = new Scanner(System.in);
			System.out.print("��������ҵ���");
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
			//ͳ��һ���ַ����ַ������е�����λ��
			char[] chs={'ͳ','��','һ','��','��','��','��','��','��','��','��','��','��','��','��','λ','��'};
			Scanner scanner = new Scanner(System.in);
			System.out.print("��������ҵ���");
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
			//��������λ��ת
			int num = 56123;
			String changedNum = String.valueOf(num);
			StringBuffer stringBuffer = new StringBuffer(changedNum);
			StringBuffer stringBuffer2 = stringBuffer.reverse();
			String str = stringBuffer2.toString();
			int finalNum = Integer.parseInt(str);
			System.out.print(finalNum);
		*/
		//�ַ���ͳ��
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
		
		System.out.println("c1��"+c1);
		System.out.println("c2��"+c2);
	}
}








