package co.vanila;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	int a[]=new int[5];
	
	public void bubble(){
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter 5 array elements:");
		for(int i=0;i<5;i++)
			a[i]=s.nextInt();
		Arrays.sort(a);
		int n=a.length;
		for(int j=0;j<n;j++)
		for(int i=0;i<n-j-1;i++)
			if(a[i]>a[i+1]){
				//swap(a[i],a[i+1]);
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+" ");
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BubbleSort bs=new BubbleSort();
		bs.bubble();
		
	}

}
