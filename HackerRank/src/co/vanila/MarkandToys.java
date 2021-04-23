package co.vanila;

import java.util.Arrays;
import java.util.Scanner;

public class MarkandToys {

	int a[]=new int[5];
	
	public void toy(){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter price:");
		int n=0;
		n=sc.nextInt();
		System.out.println("enter items");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
		int sum=0,i=0;
		System.out.println("The items:");
		while(sum<=n)
		{
			sum= sum+a[i];
			if(sum>n)break;
			System.out.println(a[i]);
			 i++;
			 
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarkandToys mt=new MarkandToys();
		mt.toy();
		
	}

}
