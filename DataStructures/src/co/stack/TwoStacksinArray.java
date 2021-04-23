package co.stack;

public class TwoStacksinArray {

	
	int a[];
	static int top1,top2,size;
	
	public TwoStacksinArray(int n) {
		size=n;
		top1= n/2 +1;
		top2=n/2;
		a=new int[size];
	}
	
	
	public void push1(int d){
		
		if(top1>0){
			top1--;
			a[top1]=d;
		} else {
			System.out.println("stack overflow at"+top1+"of element"+d);
		}
		
	}
	
	public void push2(int d){
		
	if(top2<size-1){
	
		top2++;
		a[top2]=d;
	}else{
		System.out.println("stack overflow at"+top2+"of element"+d);
	}
	
	}
	
	public void pop1(){
		
		System.out.println("popped"+a[top1--]);
		
	}
	
	
	public void printStack(){
		for(int i=0;i<=size-1;i++)
			
			System.out.println(a[i]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoStacksinArray sa=new TwoStacksinArray(10);
		sa.push1(10);
		sa.push1(11);
		sa.push2(100);
		sa.push2(200);
		sa.printStack();
		sa.pop1();
		sa.printStack();
		
	}

}
