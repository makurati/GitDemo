package co.Arrays;

public class Arr1 {

	static void getmissingnum(int a[],int n){
		
		int x1=a[0];int x2=1;
		
		for(int i=1;i<n;i++){
			x1=x1^a[i];
			System.out.println(x1);
		
		}
		
		
		//return x1 ^ x2;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,4,5,6};
		
		getmissingnum(a, a.length);
		
		}
	

}
