import java.util.Scanner;
public class testAdd{//测试函数加、减、除
	public static void main (String[] args){
		System.out.print("请输入两个数的值：");
		Scanner input=new Scanner(System.in);
		double c =input.nextDouble();
		double d =input.nextDouble();
		double x=add(c,d);
		double z=subtra(c,d);
		double v=multichu(c,d);
		System.out.println(x);
		System.out.println(z);
		System.out.println(v);
     }
	public static double add(double a,double b){//定义函数 返回值类型、形参、return
	return a+b;
   }
	public static double subtra(double a,double b){
	   return a-b;
   }
	public static double multichu(double a,double b){
	   return a/b;
   }

 }