package TWOaRRAY;

public class testArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]array=new int [3][5];//定义二维数组
		array[0][0]=10;
		array[0][3]=20;
		array[1][1]=30;
		array[1][2]=40;
		array[2][4]=50;
		
		//高维为地址，低维为值
		System.out.println(array[0]);//s输出为地址
		System.out.println(array[1]);//s输出为地址
		System.out.println(array[2]);//s输出为地址
		
		for (int i=0;i<array.length;i++){//遍历array 数组
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		//printArray(array);
	}
		
		//二维数组的声明方法
		//1.先声明、再分配     数据类型[][] 数组名;   数组名= new 数据类型[n][n];
		int [][] array1;
		array1 =new int [5][4];
		//2.声明并分配空间     数据类型[][] 数组名=new  数据类型[n][n];
		int [][]nums=new int [3][];
		
		
		System.out.println(nums[0]);//输出为null
		System.out.println(nums[1]);//输出为null
		System.out.println(nums[2]);//输出为null
		
		nums[0]=new int[3];
		nums[1]=new int[4];
		nums[2]=new int[5];
		for (int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println();
		//printArray(array);
	}
		
		//3.声明并赋值（繁）数据类型[][] 数组名=new 数据类型[高维][]    自行new低维长度
		
		int [][] array2=new int [3][];
		//4.声明并赋值（简）数据类型[][ 数组名={{v1,v2,v3},{x1,x2,x3},{....}}
		
		int [][] array3={{1,2,3},{4,5,6},{7,8,9}};
	
		
		
	/*
	public static void printArray(){
		for (int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.println(array[i][j]);
			}
		}
		*/
		
	
}
}
	
