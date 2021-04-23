package co.stack;

import java.util.Stack;

//Not needed -- ref method 2 

public class QueueStackMeth3 {

	public static class queue {

		Stack<Integer> s1;
		Stack<Integer> s2;

	}
	
	public static void push(Stack<Integer> top_ref,int d){
		top_ref.push(d);
	}
	
	
	static int pop(Stack<Integer> top_ref){
		if(top_ref.isEmpty()){
			System.out.println("empty");
		}
		return top_ref.pop();
		
	}
	
	public static void enQueue(queue q,int d){
		
		push(q.s1,d);
		
	}
	
	public static int deQueue(queue q){
		
		int x=0;
		if(q.s1.isEmpty()&&q.s2.isEmpty()){
			System.out.println("empty");
		}
		
		while(!q.s1.isEmpty()){
			 x=pop(q.s1);
			push(q.s2,x);
		}
		
		if(!q.s2.isEmpty()){
			 x=pop(q.s2);
		}
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queue q3=new queue();
		q3.s1=new Stack<>();
		q3.s2=new Stack<>();
		enQueue(q3, 1);
		enQueue(q3, 2);
		enQueue(q3, 3);
		System.out.println(deQueue(q3));
		System.out.println(deQueue(q3));
		System.out.println(deQueue(q3));
		enQueue(q3, 4);
		System.out.println(deQueue(q3));
		

	}

}
