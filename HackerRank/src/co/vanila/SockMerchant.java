package co.vanila;

import java.util.*;

public class SockMerchant {
	
	public void sock(int n, int ar[]){
		
		Set<Integer> colors= new HashSet<>();
				int pairs=0;
			for( int i=0; i<n; i++){
				if(!colors.contains(ar[i])){
					colors.add(ar[i]);
				}else{
					pairs++;
					colors.remove(ar[i]);
				}
			}
				System.out.println("pairs:"+pairs);
		
		
	}
	
	
	public static void main(String[] args){
		SockMerchant sm= new SockMerchant();
		int[] arr= {9,2,7,7,2,6,2};
		sm.sock(7, arr);
		
	}

}
