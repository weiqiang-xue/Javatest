import java.util.*;

public class testList{//����Ĵ�������
//11 22 44 55 0
//11 22 44 55 66 77 0
//99 22 44 55 66 77 0
		static int []nums=new int [5];
		static int size=0;
	public static void main(String[] args){
		insert(0,11);
		insert(1,22);
		insert(2,33);
		remove(2);
		insert(2,44);
		insert(3,55);
		print();
		insert(4,66);
		insert(5,77);
		print();
		replace(0,99);
		print();
		
	}
		
		
	//�������в���һ��Ԫ��
	public static void insert(int position,int value){
		if(position<0||position >size){
			System.out.println("��Ǹ���������λ������");
			return ;
		}
		if (nums.length==size){//����λ��Ϊ���������һ��λ�ã��������������
			expend();
		}
		//ԭ�������������ƶ�
		for(int i=size;i>position;i--){
			nums[i]=nums[i-1];
		}
		//��ֵ����
		nums[position]=value;
		size++;
	}
	//��ӡ�����ֵ
	public static void print(){
		for(int i=0;i<=size;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	}
	
	//��������飨����ԭֵ��
	public static void expend(){
		nums=Arrays.copyOf(nums,nums.length*2);
	}
	
	//ɾ��Ԫ�أ�����Ԫ��ǰ��
	public static void remove(int position){
		if (position <0||position>size){
			System.out.println("���ã������λ������");
			return;
		}
		//ѭ���ƶ�Ԫ��
		for(int i=position;i<size-1;i++){
			nums[i]=nums[i+1];
		}
		size--;
		
	}
	
	//�滻λ�õ�Ԫ��
	public static void replace(int position,int value){
		
		if (position <0||position>=size){
			System.out.println("���ã������λ������");
			return;
		}		
		nums[position]=value;
	}
 }
	
	
	
