package co.vanila;

import java.util.Scanner;

public class JumpingClouds {

	Scanner sc=new Scanner(System.in);
	
	public void jc(){
		int count=0;
		System.out.println("enter n");
		int n = sc.nextInt();
		int c[]= new int[n];
		System.out.println("enter string");
		for (int i=0;i<n;i++){
			c[i]=sc.nextInt();
		}
		//System.out.println(c[0]);
		for (int i=0;i<n-1;i++){
			
			if(c[i+2]==0){count++;i++;}
			
		}
		System.out.println(count);
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("main");
		JumpingClouds j=new JumpingClouds();
		j.jc();

	}

}
