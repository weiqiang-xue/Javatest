/*
 ������������뷽��������ֱ�Ӷ����������String name;��������Ϊ��Ϊ��public ����ֵ���� ���������βΣ���
 �������أ���������ͬ��������ͬ��
 ���췽�����вι���----Ϊ���Ը�ֵ���޲ι���Ĭ��Ϊ�޲ι��죩

 ���췽���Ķ��壺
			 *������������ͬ��
			 *û�з���ֵ����
			 *��������ʱ���������췽���ĵ��ã�����ͨ���������ֶ�����
			 *ע�⣺û�ж��幹�췽�����������Ĭ���ṩ�޲εĹ��췽�� 
 
 ����Ĵ����Ĺ��̣�
				 * �ڴ��п��ٶ���ռ�
				 * Ϊ�������Ը����ʼֵ��
				 * ִ�й��췽���еĴ���
				 * ���������еĵ�ַ��ֵ��������
 * 

 * */
public class testObject{
	public static void main(String [] args){
		Student s1=new Student();//�߼������У������ֲ������������ַ
		s1.name="����";
		s1.sex="��";
		s1.age=20;
		s1.score=95D;
		s1.sayHi();
		
		Student s2=new Student();
		s2.name="����";
		s2.sex="��";
		s2.age=21;                      
		s2.score=96D;
		s2.sayHi();
		
		Student s3=new Student();
		s3.name="С��";
		s3.sex="Ů";
		s3.age=19;
		s3.score=90D;
		s3.sayHi();
		
		Student s4=new Student();
		s4.name="С��";
		s4.sex="Ů";
		s4.age=18;
		s4.score=100.0;
		s4.sayHi();

		//�вι��췽��Ϊ����ֵ
		Student s5=new Student("����","��",25,105.0);
		s5.sayHi();
		//��ʦ
		Teacher t1=new Teacher();
		t1.name="jack";
		t1.sex="��";
		t1.age=18;
		t1.salary=10000;
		t1.sayHi();
		double result=t1.calc(s1.score, s2.score, s3.score, s4.score);
		System.out.println(result);
		
		//������
		Calculator c1=new Calculator();
		c1.name="����";
		double result1=c1.add(5,6);
		double result2=c1.subtract(5,6);
		double result3=c1.multiply(5,6);
		double result4=c1.divide(5,6);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
	
}
class Student {
	String name;
	String sex;
	int age;
	double score;
	//�޲ι���
	public Student (){
		//�߼���һ�У������Խ��г�ʼ��
		//�߼��ڶ��У�ִ�й��췽���еĴ���
		System.out.println("�޲ι��췽��");
	}//�߼������У��ص����췽���ĵ��ô�
	
	//�вι���----Ϊ���Ը�ֵ
	public Student (String n,String s,int a,double sc){
		//�߼���һ�У���ʼ������
		//�߼��ڶ��У�ִ�й��췽���еĴ���
		//�߼������У����ص����ù��췽����λ��
		//������ĵ�ַ��ֵ������
		name=n;
		sex=s;
		age=a;
		score=sc;
	}
	public void sayHi(){
		System.out.println("��Һã�����"+name+",�Ա�"+sex+",����"+age+",�ҵĳɼ�Ϊ"+score);
	}
}

class Teacher{
	
	String  name;
	String sex;
	int age;
	double salary;
	public void sayHi(){
		System.out.println("��Һã�����һ����ʦ���ҽ�"+name+",�Ա�"+sex+",����"+age+",�ҵ�нˮΪ"+salary);
	}
	public double  calc(double  a,double  b,double  c,double  d){
		return a + b+ c+ d;
		
	}
}
class Calculator {
	String name;
	public double add(double a,double b){
		return a+b;
	}
	public double subtract(double a,double b){
		return a-b;
	}
	public double multiply(double a,double b){
		return a*b;
	}
	public double divide (double a,double b){
		return a%b;
	}

}
