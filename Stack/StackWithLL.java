package Stack;

public class StackWithLL {
	
	Node top;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		
		if(top == null) { // LL is empty
			top = newNode;			
		}
		else { // LL is not empty
			Node temp = top;
			top = newNode;
			temp.next = top;
		}
		
		System.out.println(data+ " Pushed into a stack");
	}

	public int pop() {
		int popped = Integer.MIN_VALUE;
		
		if(top == null) {
			System.out.println("Stack Underflow");
		}
		else {
			popped = top.data;
			top = top.next;
		}
		
		return popped;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithLL s = new StackWithLL();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		
		System.out.println(s.pop()+ " Popped from the stack");
		
	}

}
