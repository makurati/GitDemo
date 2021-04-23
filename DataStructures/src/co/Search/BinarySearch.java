package co.Search;

public class BinarySearch {

	public  void binary(int x){
		
		int arr[]={1,3,4,12,14,16};
		int len=arr.length;
		
		int head=0;
		
		
		
		
		while(head<=len){
			int m=head+(len-head)/2;
			
			if(arr[m]==x){
				System.out.println("Element found at index:"+m);
			}
			
			if(arr[m]<x)
				head=m+1;
			else
				len=m-1;
		}
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		BinarySearch bs=new BinarySearch();
		bs.binary(4);
		
		
	}

}
