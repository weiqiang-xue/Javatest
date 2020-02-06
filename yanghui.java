package TWOaRRAY;

public class yanghui {
	/*
	1	
	1	1	
	1	2	1	杨辉三角
	1	3	3	1	
	1	4	6	4	1	
	1	5	10	10	5	1	
	1	6	15	20	15	6	1	
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=10;
		int [][] yh=new int [rows][];
		for(int i=0;i<rows;i++){
			yh[i]=new int[i+1];
		}
		for (int i=0;i<rows;i++){//对全为1的数组进行赋值为1
			yh[i][i]=1;
			yh[i][0]=1;
		}
		for (int i=2;i<yh.length;i++){
			for(int j=1;j<i;j++){
				yh[i][j]=yh[i-1][j-1]+yh[i-1][j];
			}
		}
			for (int k=0;k<yh.length;k++){//遍历杨辉 数组
				for(int l=0;l<yh[k].length;l++){
					System.out.print(yh[k][l]+"\t");
				}
				System.out.println();
			}
		}
}
