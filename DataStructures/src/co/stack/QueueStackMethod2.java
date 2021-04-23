package co.stack;

import java.util.Stack;

public class QueueStackMethod2 {

	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	
	
	public void enQueue(int d){
		
		if(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		
		s1.push(d);
		
	}
	
	public void deQueue(){
		
		if(s1.isEmpty()&&s2.isEmpty()){
			System.out.println("Q empty");
		}
		
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		
		if(!s2.isEmpty()){
			
			System.out.println(s2.pop());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueStackMethod2 queue=new QueueStackMethod2();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(6);
		queue.enQueue(7);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(8);
		queue.enQueue(9);
		queue.deQueue();
		queue.deQueue();queue.deQueue();

	}

}
