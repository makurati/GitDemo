package co.list;

public class LList4 {

	public static class node {

		int data;
		node next;

		node(int d) {
			this.data = d;
			this.next = null;

		}
	}

	node head;

	public void push(int d) {

		node new_node = new node(d);
		new_node.next = head;
		head = new_node;

	}

	public void pushLast(int d) {
		node new_node = new node(d);
		node n = head;
		while (n.next != null) {

			n = n.next;

		}
		n.next = new_node;

	}

	public void append(int d, node prev_node) {

		if (prev_node == null)
			System.out.println("no node found");

		node new_node = new node(d);

		new_node.next = prev_node.next;
		prev_node.next = new_node;

	}

	public void delete(int d) {

		node temp = head, prev = null;

		if (temp != null && temp.data == d) {
			head = temp.next;
		}

		while (temp.data != d && temp != null) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null)
			return;
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

		LList4 list = new LList4();
		list.head = new node(1);
		node second = new node(2);
		node third = new node(3);
		list.head.next = second;
		second.next = third;
		third.next = null;
		node four = third.next;
		list.printList();
		System.out.println("-----After push 10----");
		list.push(10);
		list.printList();
		System.out.println("----after push 20---");
		list.push(20);
		list.printList();
		System.out.println("-----After push last 30 ");
		list.pushLast(30);
		list.printList();
		System.out.println("-----After push last 40 ");
		list.pushLast(40);
		list.printList();
		System.out.println("After append");
		list.append(100, third);
		list.printList();
		System.out.println("After delete ");
		list.delete(30);
		list.printList();

	}

}
