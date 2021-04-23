package co.list;

public class DllReverse {

	public static class node {

		int data;
		node next;
		node prev;

		public node(int d) {

			data = d;
			next = null;
			prev = null;

		}
	}

	node head;
	
	public void insert(int d){
		
		node new_node=new node(d);
		
		if(head==null){
			head=new_node;
		}
		
		new_node.prev=null;
		new_node.next=head;
		head=new_node;
		
	}
	
	public void printList(){
		
		node n=head;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
		
	}

	public static void main(String[] args) {
		
		DllReverse dr=new DllReverse();
		dr.head=new node(1);
		dr.insert(2);
		dr.printList();

		
	}

}
