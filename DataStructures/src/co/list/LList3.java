package co.list;

//this is a sample class to test static inner classes 

public class LList3 {

	static class node {
		int data;
	}

	int a = 3;
	node b;
	static int c = 10;

	public class printList {

		public void print() {
			System.out.println("inner class:" + c);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LList3 ll = new LList3();
		LList3.node n = new LList3.node();
		n.data = 4;
		ll.b = n;
		n = ll.b;
		node m = new node();
		m.data = 7;
		// LList3.print p= new LList3.print();
		LList3.printList pl = new LList3().new printList();
		pl.print();

		System.out.println("static inner class " + n.data);

	}

}
