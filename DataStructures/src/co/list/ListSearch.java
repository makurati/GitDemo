package co.list;

public class ListSearch {

	public static class node {

		int data;
		node next;

		node(int d) {

			this.data = d;
			this.next = null;
		}

	}

	node head;

	public int search(int d) {

		node temp = head;
		int count = 0, a = 0;

		if (head == null) {
			System.out.println("List empty");
			return 0;
		}

		while (temp != null) {
			count++;
			if (temp.data == d) {
				return count;
			}
			temp = temp.next;

		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListSearch ls = new ListSearch();
		ls.head = new node(1);
		node two = new node(2);
		node three = new node(3);
		node four = new node(4);
		ls.head.next = two;
		two.next = three;
		three.next = four;
		int count = ls.search(3);
		if (count > 1)
			System.out.println("found at:" + count);
		else
			System.out.println("not found");

	}

}
