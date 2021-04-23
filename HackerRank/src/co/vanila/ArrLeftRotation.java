package co.vanila;

import java.util.Scanner;

public class ArrLeftRotation {

	Scanner sc=new Scanner(System.in);
	int []a=new int[5];
	
	public void rotate(){
		System.out.println("enter array values and number of rotations:");
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		int r=sc.nextInt();
		for(int j=0;j<r;j++){
		int temp=a[0];
		
		for(int i=0;i<4;i++){
			
			a[i]=a[i+1];
			//a[a.length-1]=temp;
		}a[a.length-1]=temp;}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+",");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrLeftRotation r=new ArrLeftRotation();
		r.rotate();
		
	}

}
