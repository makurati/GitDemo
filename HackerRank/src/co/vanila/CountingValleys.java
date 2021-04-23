package co.vanila;

import java.util.Scanner;

public class CountingValleys {
	Scanner sc= new Scanner(System.in);

	public static void valley(){
		
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		
		int v=0;
		int lvl=0;
		
		//System.out.println(s);
		
		for(char c: s.toCharArray())
		{
			if(c=='U')lvl++;
			if(c=='D')lvl--;
			
			if(lvl==0&&c=='U')
				v++;
			
		}
		System.out.println("valleys:"+v);
	}
	
	public void valley2(){
		
		int v=0, lvl=0,n;
		String s= sc.next();
		n=s.length();
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)=='U'){
				if(++lvl==0)v++;}else lvl--;
		
		}
		
		System.out.println(v);
	}
	
	
	public static void main(String[] args){
		CountingValleys cv=new CountingValleys();
		//CountingValleys.valley(); It is working can use this also 
		cv.valley2();
		
	}
	
	
}
