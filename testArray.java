package TWOaRRAY;

public class testArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]array=new int [3][5];//�����ά����
		array[0][0]=10;
		array[0][3]=20;
		array[1][1]=30;
		array[1][2]=40;
		array[2][4]=50;
		
		//��άΪ��ַ����άΪֵ
		System.out.println(array[0]);//s���Ϊ��ַ
		System.out.println(array[1]);//s���Ϊ��ַ
		System.out.println(array[2]);//s���Ϊ��ַ
		
		for (int i=0;i<array.length;i++){//����array ����
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		//printArray(array);
	}
		
		//��ά�������������
		//1.���������ٷ���     ��������[][] ������;   ������= new ��������[n][n];
		int [][] array1;
		array1 =new int [5][4];
		//2.����������ռ�     ��������[][] ������=new  ��������[n][n];
		int [][]nums=new int [3][];
		
		
		System.out.println(nums[0]);//���Ϊnull
		System.out.println(nums[1]);//���Ϊnull
		System.out.println(nums[2]);//���Ϊnull
		
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
		
		//3.��������ֵ��������������[][] ������=new ��������[��ά][]    ����new��ά����
		
		int [][] array2=new int [3][];
		//4.��������ֵ������������[][ ������={{v1,v2,v3},{x1,x2,x3},{....}}
		
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
	
