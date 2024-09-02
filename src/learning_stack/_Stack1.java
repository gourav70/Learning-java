package learning_stack;


	import java.util.Stack;

	
		public class _Stack1 {
	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        stack.push(34);
	        stack.push(3);
	        stack.push(31);
	        stack.push(98);
	        stack.push(92);
	        stack.push(23);

	        System.out.println("Original Stack: " + stack);

	        sortStack(stack);

	        System.out.println("Sorted Stack: " + stack);
	    }

	    public static void sortStack(Stack<Integer> stack) {
	        if (!stack.isEmpty()) {
	            int temp = stack.pop();
	            sortStack(stack);
	            sortedInsert(stack, temp);
	        }
	    }

	    private static void sortedInsert(Stack<Integer> stack, int element) {
	        if (stack.isEmpty() || element > stack.peek()) {
	            stack.push(element);
	            return;
	        }
	        int temp = stack.pop();
	        sortedInsert(stack, element);
	        stack.push(temp);
	    }
	}


