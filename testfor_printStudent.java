import java.util.Scanner;
public class testfor_printStudent{
	public static void main(String [] args){
	
		for(int i=1;i<=3;i++){//��ӡ�����༶
			int sum=0;//�ֲ���������һ�γ���������Ϊȫ�ֱ���
			System.out.println("�������"+i+"���༶��ѧ���ɼ���");
			for(int j=1;j<=5 ;j++){//��ӡ5λͬѧ�ɼ�
				
				System.out.print("��"+j+"��ѧ���ĳɼ�Ϊ��");
				Scanner input=new Scanner(System.in);
				
				int score=input.nextInt();
				sum+=score;
				
			}
			int avg=sum/5;//����ƽ���ɼ�
			System.out.println("ƽ���ɼ�Ϊ��"+avg);
			
		}
		
	
	}
}
		
		
		
		
		