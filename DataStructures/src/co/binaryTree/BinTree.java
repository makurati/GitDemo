package co.binaryTree;

public class BinTree {

	static class Node{
		
		int key;
		Node right,left;
		
		public Node(int key) {
			this.key=key;
			left=null;
			right=null;
			
		}
	}
	
	static Node root;
	static Node temp=root;
	
	static void inorder(Node temp){
		if(temp==null)
			return;
		
		inorder(temp.left);
		System.out.println(temp.key);
		inorder(temp.right);
	}
	
	public static void main(String[] args) {
		
		root=new Node(10);
		root.left=new Node(11);
		root.right=new Node(12);
		inorder(root);

	}

}
