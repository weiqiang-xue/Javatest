package TWOaRRAY;
import java.util.*;
public class testArrayRevert {//����һ�����飬������Ԫ�ؽ��еߵ�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array={1,9,6,8,7,3};
		//1�����鷳���Լ����
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
	
		//2����ʦ����
		for(int i=0;i<array.length/2;i++){
			int tempt=array[i];
			array[i]=array[array.length-1-i];
			
			array[array.length-1-i]=tempt;
		}
		printArray(array);

	}
	
	public static void printArray(int...array){//��ӡ����[]
		
		for (int j=0;j<array.length;j++){
			System.out.print(array[j]+"\t");
		}
		System.out.println();
		
	}

}
