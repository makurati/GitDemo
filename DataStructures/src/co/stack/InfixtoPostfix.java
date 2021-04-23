package co.stack;

import java.util.Stack;

public class InfixtoPostfix {

	int a[] = new int[10];

	public void postfix(String exp) {
		
		
		String result="";
		Stack<Character> stack=new Stack<>();

		for (int i = 0; i < exp.length(); i++) {

			char c = exp.charAt(i);
			if (Character.isLetterOrDigit(c)) 
				result += c;
			 else 
				
				if(c=='(')
				stack.push(c);
				
				
			else{	if(c==')'){
				
			}}
			

		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp = "a+b*c+d";
		InfixtoPostfix ip = new InfixtoPostfix();
		ip.postfix(exp);

	}

}
