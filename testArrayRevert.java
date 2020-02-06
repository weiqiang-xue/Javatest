package TWOaRRAY;
import java.util.*;
public class testArrayRevert {//给定一个数组，将所有元素进行颠倒

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={1,9,6,8,7,3};
		//1、好麻烦，自己想的
		printArray(array);
		Arrays.sort(array);//
		printArray(array);
		int a=array.length-1;
		int []nums=new int[array.length];
		
		for (int i=0;i<array.length;i++){
			nums[i]=array[a];
			a--;	
		}
		printArray(nums);
	
		//2、老师讲的
		for(int i=0;i<array.length/2;i++){
			int tempt=array[i];
			array[i]=array[array.length-1-i];
			
			array[array.length-1-i]=tempt;
		}
		printArray(array);

	}
	
	public static void printArray(int...array){//打印数组[]
		
		for (int j=0;j<array.length;j++){
			System.out.print(array[j]+"\t");
		}
		System.out.println();
		
	}

}
