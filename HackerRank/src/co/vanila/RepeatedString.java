package co.vanila;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class RepeatedString {

	public static void rep(){
		
		int count=0,n=50;
		String s="abcac";
		
	for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a')count++;
		} 
		//System.out.println(count);
	
	int factor= n/s.length();
	int rem=n%s.length();
	count=factor*count;
	for(int i=0;i<rem;i++){
		if(s.charAt(i)=='a')count++;
	}
		System.out.println(count);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RepeatedString.rep();
		
	}

}
