package co.list;

public class LinkedList {

	node head;

	static class node {

		int data;
		node next;

		node(int d) {
			this.data = d;
		}

	}

	public void printList() {
		node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.head = new node(1);
		node second = new node(2);
		node third = new node(3);

		list.head.next = second;
		second.next = third;

		/*
		 * System.out.println(list.head.data);
		 * System.out.println(list.head.next.data);
		 */

		list.printList();

	}

}
