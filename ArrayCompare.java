package TWOaRRAY;

public class testArrayCompare {
	//输出数组中的最大值、最小值

	public static void main(String[] args) {
		int []array={4,9,3,1,7,5};
		int max=array[0];
		int min=array[0];
		for (int i=0;i<array.length;i++){//比较最大值
			if(array[i]>max){
				max=array[i];
			}
		}
		for (int j=0;j<array.length;j++){//比较最小值
			if(min>array[j]){
				min=array[j];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
		