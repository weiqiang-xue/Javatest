public class ArrayCreate{//����Ĵ�������
	public static void main(String[] args){
		
		//1���������ٷ���
		int[]nums;
		nums=new int [5];
		//2��������ռ�
		int[] array=new int [5];
		//3��������ֵ
		int []array2=new int []{5,6,7,8,9};
		//4��������ֵ
		int []array3={5,6,7,8,9};
		System.out.println(nums[0]);
		System.out.println(array[0]);
		System.out.println(array2[0]);
		System.out.println(array3[0]);
		
	}
	
}





import java.util.Scanner;

//ͳ��int���͵�����������Ԫ�صĺͣ������Ԫ�ص�ƽ��ֵ
public class testArrayAdd{
	public static void main (String [] args){
		int sum=0;
		Scanner input=new Scanner(System.in);
		int []Array1=new int[5];
		for (int i=0;i<Array1.length;i++){
			System.out.print("�������"+(i+1)+"������Ԫ��");
			
			Array1[i]=input.nextInt();
			}
		for (int j=0;j<Array1.length;j++){
			sum+=Array1[j];
			
		}
		System.out.print("����Ԫ�غ�Ϊ");
		System.out.println(sum);
		System.out.print("����Ԫ��ƽ��ֵΪ");
		int a=Array1.length;
		System.out.println(sum/a);
	}
	
	
	
}