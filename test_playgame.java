import java.util.Scanner;
public class test_playgame{     //三局两胜
	public static void main(String [] args){
		Scanner input =new Scanner(System.in);
		int cCount=0;//记录电脑赢的次数
		int pCount=0;//记录玩家赢的次数
		for (int i=1;i<=3; ){  								//取个位数
			int computer = ((int)(Math.random()*10))%3+1;//第一次出错是因为Math中的m写为小写
			System.out.println("请输入猜拳编号1剪刀、2石头、3布");
		System.out.println(computer);
			int player=input.nextInt();
			if(computer==player){
				System.out.println("平局，再接再厉!");
			}else if ((player==1&&computer==3)||(player==2&&computer==1)||(player==3&&computer==2)){
				
				
				System.out.println("恭喜你赢了！");
				pCount++;
			}else {
				
				System.out.println("弱爆了！你输了！");
				cCount++;
			}
			if (cCount==2||pCount==2){
				break;
			}
			i++;
		}
	}
}