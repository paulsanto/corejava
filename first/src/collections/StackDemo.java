package collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String atgs[]) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("America");
		stack.push("Germany");
		stack.push("India");
		
		System.out.println("Stack: " + stack);
		
		String poppedElement = stack.pop();
		System.out.println("Popped Element: " + poppedElement);
		
		System.out.println("Now stack looks like: " + stack);
		
		String topElement = stack.peek();
		System.out.println("Now top element is : " + topElement);
		
	}

}
