package TWOaRRAY;

public class testArrayCompare {
	//��������е����ֵ����Сֵ

	public static void main(String[] args) {
		int []array={4,9,3,1,7,5};
		int max=array[0];
		int min=array[0];
		for (int i=0;i<array.length;i++){//�Ƚ����ֵ
			if(array[i]>max){
				max=array[i];
			}
		}
		for (int j=0;j<array.length;j++){//�Ƚ���Сֵ
			if(min>array[j]){
				min=array[j];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
		