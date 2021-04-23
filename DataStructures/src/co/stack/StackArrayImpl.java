package co.stack;

public class StackArrayImpl {

	static int MAX = 10;
	int a[] = new int[MAX];
	static int top;
	
	public StackArrayImpl() {
		top=-1;
	}
	
	public void push(int d){
		
		if(top>= MAX-1){
			System.out.println("stack overflow");
		return;}
		
		else{
			
			a[++top]=d;
			System.out.println("pushed:"+d);
			return;
			
		}
	}
	
	public void peek(){
		
		if(top<1)System.out.println("stack underflow");
		else
			System.out.println("top element"+ a[top]);
	}
	
	public void pop(){
		
		System.out.println("popped::"+a[top--]);
		
		
	}
	
	public void printStack(){
		for(int i=top;i>=0;i--)
			System.out.println(a[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackArrayImpl s=new StackArrayImpl();
		s.push(10);
		s.push(20);
		s.push(30);
		s.peek();
		s.push(40);
		s.peek();
		s.pop();
		s.peek();
		s.push(50);
		s.peek();
		System.out.println("stack elements::");
		s.printStack();

	}

}
