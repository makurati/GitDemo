package co.list;

public class ListLength {

	public static class node {

		int data;
		node next;

		node(int d) {
			this.data = d;
			this.next = null;

		}

	}

	node head;

	public void length() {

		if (head == null) {
			System.out.println("List empty");
			return;
		}
		
		node temp=head; int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}

		System.out.println("Length::"+count);
		
	}
	
	public void printList(){
		
		node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListLength len=new ListLength();
		len.head=new node(1);
		node two=new node(2);
		node three = new node(3);
		node four=new node(4);
		node five=new node(5);
		len.head.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		five.next=null;
		len.printList();
		len.length();
				

	}

}
