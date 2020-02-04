import java.util.Scanner;
public class testdigui{//递归  求菲波那契数列
	public static void main(String[] args){
		System.out.print("请输入所求的数列个数：");
		Scanner input =new Scanner(System.in);
		int result=input.nextInt();
		int result2=fibonacci(result);//调用函数
		System.out.println(result2);
	}
	public static int fibonacci(int n){//递归函数
		if (n==0){
			return 0;
		}else if(n==1){
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}