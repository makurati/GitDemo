package co.stack;

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public void enQueue(int d) {

		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		s1.push(d);

		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}

	}

	public void deQueue() {

		if (s1.isEmpty()) {
			System.out.println("Stack is empty ");
		}

		int x = s1.peek();
		s1.pop();
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueUsingStack queue = new QueueUsingStack();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();

	}

}
