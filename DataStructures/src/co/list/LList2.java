package co.list;

public class LList2 {

	static class node {

		int data;
		node next;

		node(int d) {
			this.data = d;
			next = null;
		}

	}

	node head;

	public void print() {

		node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void push(int d) {
		node new_node = new node(d);
		new_node.next = head;
		head = new_node;

	}

	public void inserAfter(node prev_node, int data) {

		if (prev_node == null) {
			System.out.println("no node found");
			return;
		}

		node new_node = new node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;

	}

	public void append(int data) {
		node new_node = new node(data);
		if (head == null)
			System.out.println("list is empty");

		new_node.next = null;
		node last = head;
		while (last.next != null)
			last = last.next;

		last.next = new_node;
		return;

	}

	public void delete(int data) {
		node temp = head, prev = null;

		if (temp != null && temp.data == data) {
			head = temp.next;

		}

		while (temp != null && temp.data != data) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null)
			return;
		prev.next = temp.next;
	}

	public static void main(String[] args) {

		LList2 ll = new LList2();
		ll.head = new node(2);
		node second = new node(3);
		node third = new node(4);
		ll.head.next = second;
		second.next = third;
		third.next = null;

		ll.print();
		System.out.println("====After push at head====");
		ll.push(10);
		ll.print();
		System.out.println("====After push at second====");
		ll.inserAfter(second, 20);
		ll.inserAfter(second, 30);
		ll.print();
		System.out.println("====After append====");
		ll.append(8);
		ll.append(9);
		ll.print();
		System.out.println("====After delete====");
		ll.delete(4);
		ll.print();
		// System.out.println(ll.head.next.next.data);

	}

}
