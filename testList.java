import java.util.*;

public class testList{//数组的创建方法
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
		
		
	//向数组中插入一个元素
	public static void insert(int position,int value){
		if(position<0||position >size){
			System.out.println("抱歉！您输入的位置有误。");
			return ;
		}
		if (nums.length==size){//插入位置为数组组最后一个位置，对数组进行扩容
			expend();
		}
		//原数组依次向右移动
		for(int i=size;i>position;i--){
			nums[i]=nums[i-1];
		}
		//新值插入
		nums[position]=value;
		size++;
	}
	//打印数组的值
	public static void print(){
		for(int i=0;i<=size;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
	}
	
	//获得新数组（带有原值）
	public static void expend(){
		nums=Arrays.copyOf(nums,nums.length*2);
	}
	
	//删除元素，数组元素前移
	public static void remove(int position){
		if (position <0||position>size){
			System.out.println("您好，输入的位置有误");
			return;
		}
		//循环移动元素
		for(int i=position;i<size-1;i++){
			nums[i]=nums[i+1];
		}
		size--;
		
	}
	
	//替换位置的元素
	public static void replace(int position,int value){
		
		if (position <0||position>=size){
			System.out.println("您好，输入的位置有误");
			return;
		}		
		nums[position]=value;
	}
 }
	
	
	
