import java.util.Scanner;
public class testAdd{//���Ժ����ӡ�������
	public static void main (String[] args){
		System.out.print("��������������ֵ��");
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
	public static double add(double a,double b){//���庯�� ����ֵ���͡��βΡ�return
	return a+b;
   }
	public static double subtra(double a,double b){
	   return a-b;
   }
	public static double multichu(double a,double b){
	   return a/b;
   }

 }