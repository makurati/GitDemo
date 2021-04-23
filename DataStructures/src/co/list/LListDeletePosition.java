package co.list;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class LListDeletePosition {

	public static class node {

		int data;
		node next;

		node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	node head;

	public void delete(int position) {

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (position == 0) {
			head = head.next;
		}

		node temp = head, prev = null;

		for (int i = 0; temp != null && i < position; i++) {
			prev = temp;
			temp = temp.next;
		}

		prev.next = temp.next;

	}

	public void printList() {

		node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LListDeletePosition del = new LListDeletePosition();
		del.head = new node(1);
		node two = new node(2);
		node three = new node(3);
		node four = new node(4);
		node five = new node(5);
		del.head.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = null;
		System.out.println("List");
		del.printList();
		System.out.println("After delete at position 2");
		del.delete(2);
		del.printList();

	}

}
