package co.vanila;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {

	Map<String,Integer> magazineMap;
	Map<String,Integer> noteMap;
	
	public void checkmagazine(String mag,String note){
		
		magazineMap=new HashMap<String,Integer>();
		noteMap=new HashMap<String,Integer>();
		
		for(String word: mag.split("")){
			Integer i=magazineMap.get(word);
		
		if(i==null)
			magazineMap.put(word, 1);
		else
		magazineMap.put(word, i+1);
		}
		
		for(String word: note.split("")){
			Integer i= noteMap.get(word);
			
			if(i==null){
				noteMap.put(word, 1);
			}else{
				noteMap.put(word, i+1);
			}
		}
		
	}
	
	public boolean solve(){
		
		for(Map.Entry<String,Integer> entry: noteMap.entrySet()){
			Integer i=magazineMap.get(entry.getKey());
			
			if(i==null)return false;
			else{
				if(entry.getValue()>i)return false;
			}
		}return true;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RansomNote rn=new RansomNote();
		rn.checkmagazine("hello hi","hi hello");
		rn.solve();
	}

}
