package co.stack;

public class MiddleElement {

	public class DLLnode{
		
		int data;
		DLLnode next;
		DLLnode prev;

		public DLLnode(int d) {
			this.data = d;
			this.next = null;
			this.prev = null;
		}

	}
	
	class Mystack{
		
		DLLnode head;
		DLLnode mid;
		int count;
		
	}
	
	Mystack stack(){
		
		Mystack ms= new Mystack();
		ms.count=0;
		return ms;

	}

	public void push(Mystack ms, int d) {

		DLLnode node = new DLLnode(d);
		node.prev = null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
