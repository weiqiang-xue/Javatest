import java.util.Scanner;
public class testdigui{//�ݹ�  ��Ʋ���������
	public static void main(String[] args){
		System.out.print("��������������и�����");
		Scanner input =new Scanner(System.in);
		int result=input.nextInt();
		int result2=fibonacci(result);//���ú���
		System.out.println(result2);
	}
	public static int fibonacci(int n){//�ݹ麯��
		if (n==0){
			return 0;
		}else if(n==1){
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}