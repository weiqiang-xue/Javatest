import java.util.Scanner;
public class test_playgame{     //������ʤ
	public static void main(String [] args){
		Scanner input =new Scanner(System.in);
		int cCount=0;//��¼����Ӯ�Ĵ���
		int pCount=0;//��¼���Ӯ�Ĵ���
		for (int i=1;i<=3; ){  								//ȡ��λ��
			int computer = ((int)(Math.random()*10))%3+1;//��һ�γ�������ΪMath�е�mдΪСд
			System.out.println("�������ȭ���1������2ʯͷ��3��");
		System.out.println(computer);
			int player=input.nextInt();
			if(computer==player){
				System.out.println("ƽ�֣��ٽ�����!");
			}else if ((player==1&&computer==3)||(player==2&&computer==1)||(player==3&&computer==2)){
				
				
				System.out.println("��ϲ��Ӯ�ˣ�");
				pCount++;
			}else {
				
				System.out.println("�����ˣ������ˣ�");
				cCount++;
			}
			if (cCount==2||pCount==2){
				break;
			}
			i++;
		}
	}
}