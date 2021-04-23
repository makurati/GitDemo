package co.vanila;

import java.util.Arrays;

public class TwoStrings {

	public void substring(){
		
		String s1="hi";
		String s2="heblloa";
		System.out.println(s2);
		
		char ca[] = s2.toCharArray();
		Arrays.sort(ca);
		System.out.println(ca);
		String s3=String.valueOf(ca);
		//Convert char array to string System.out.println(s3);
		
		for(int i=0;i<s3.length();i++){
		s3.substring(i);}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStrings ts=new TwoStrings();
		ts.substring();

	}

}
