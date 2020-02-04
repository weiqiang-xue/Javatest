import java.util.Scanner;
public class testfor_printStudent{
	public static void main(String [] args){
	
		for(int i=1;i<=3;i++){//打印三个班级
			int sum=0;//局部变量，第一次出错是设置为全局变量
			System.out.println("请输入第"+i+"个班级的学生成绩：");
			for(int j=1;j<=5 ;j++){//打印5位同学成绩
				
				System.out.print("第"+j+"个学生的成绩为：");
				Scanner input=new Scanner(System.in);
				
				int score=input.nextInt();
				sum+=score;
				
			}
			int avg=sum/5;//计算平均成绩
			System.out.println("平均成绩为："+avg);
			
		}
		
	
	}
}
		
		
		
		
		