public class ArrayCreate{//数组的创建方法
	public static void main(String[] args){
		
		//1先声明，再分配
		int[]nums;
		nums=new int [5];
		//2声明分配空间
		int[] array=new int [5];
		//3声明并赋值
		int []array2=new int []{5,6,7,8,9};
		//4声明并赋值
		int []array3={5,6,7,8,9};
		System.out.println(nums[0]);
		System.out.println(array[0]);
		System.out.println(array2[0]);
		System.out.println(array3[0]);
		
	}
	
}





import java.util.Scanner;

//统计int类型的数组中所有元素的和，并输出元素的平均值
public class testArrayAdd{
	public static void main (String [] args){
		int sum=0;
		Scanner input=new Scanner(System.in);
		int []Array1=new int[5];
		for (int i=0;i<Array1.length;i++){
			System.out.print("请输入第"+(i+1)+"个数组元素");
			
			Array1[i]=input.nextInt();
			}
		for (int j=0;j<Array1.length;j++){
			sum+=Array1[j];
			
		}
		System.out.print("数组元素和为");
		System.out.println(sum);
		System.out.print("数组元素平均值为");
		int a=Array1.length;
		System.out.println(sum/a);
	}
	
	
	
}