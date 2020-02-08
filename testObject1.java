/*
 类与对象、属性与方法、属性直接定义变量（例String name;），方法为行为（public 返回值类型 方法名（形参））
 方法重载（方法名相同、参数不同）
 构造方法（有参构造----为属性赋值、无参构造默认为无参构造）

 构造方法的定义：
			 *名称与类名相同，
			 *没有返回值类型
			 *创建对象时，触发构造方法的调用，不可通过句点进行手动调用
			 *注意：没有定义构造方法，则编译器默认提供无参的构造方法 
 
 对象的创建的过程：
				 * 内存中开辟对象空间
				 * 为各个属性赋予初始值，
				 * 执行构造方法中的代码
				 * 【将对象中的地址赋值给变量】
 * 

 * */
public class testObject{
	public static void main(String [] args){
		Student s1=new Student();//逻辑第四行，创建局部变量，保存地址
		s1.name="张三";
		s1.sex="男";
		s1.age=20;
		s1.score=95D;
		s1.sayHi();
		
		Student s2=new Student();
		s2.name="李四";
		s2.sex="男";
		s2.age=21;                      
		s2.score=96D;
		s2.sayHi();
		
		Student s3=new Student();
		s3.name="小花";
		s3.sex="女";
		s3.age=19;
		s3.score=90D;
		s3.sayHi();
		
		Student s4=new Student();
		s4.name="小丽";
		s4.sex="女";
		s4.age=18;
		s4.score=100.0;
		s4.sayHi();

		//有参构造方法为对象赋值
		Student s5=new Student("王五","男",25,105.0);
		s5.sayHi();
		//老师
		Teacher t1=new Teacher();
		t1.name="jack";
		t1.sex="男";
		t1.age=18;
		t1.salary=10000;
		t1.sayHi();
		double result=t1.calc(s1.score, s2.score, s3.score, s4.score);
		System.out.println(result);
		
		//计算器
		Calculator c1=new Calculator();
		c1.name="索尼";
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
	//无参构造
	public Student (){
		//逻辑第一行，对属性进行初始化
		//逻辑第二行，执行构造方法中的代码
		System.out.println("无参构造方法");
	}//逻辑第三行，回到构造方法的调用处
	
	//有参构造----为属性赋值
	public Student (String n,String s,int a,double sc){
		//逻辑第一行，初始化属性
		//逻辑第二行，执行构造方法中的代码
		//逻辑第三行，返回到调用构造方法的位置
		//将队象的地址赋值给变量
		name=n;
		sex=s;
		age=a;
		score=sc;
	}
	public void sayHi(){
		System.out.println("大家好，我是"+name+",性别"+sex+",今年"+age+",我的成绩为"+score);
	}
}

class Teacher{
	
	String  name;
	String sex;
	int age;
	double salary;
	public void sayHi(){
		System.out.println("大家好，我是一名老师，我叫"+name+",性别"+sex+",今年"+age+",我的薪水为"+salary);
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
