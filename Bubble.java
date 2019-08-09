import java.util.*;

public class Bubble{
	public static void main(String[] args){
		int[] nums={-1,999,100,34,89};
		int[] newArr=bubble(nums);
		System.out.print(Arrays.toString(newArr));
	}
	public static int[] bubble(int[] arr){
		for(int i=0;i<arr.length-1;++i){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}