package LinkedList;

public class LinkedListConcept {
	
	Node start;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static LinkedListConcept insert(LinkedListConcept list, int data) {
		
		Node newNode = new Node(data);
		
		if(list.start == null) { //list is empty
			list.start = newNode;
		}
		else { //list is not empty
			Node last = list.start;
			
			while(last.next != null) {
				last = last.next;
			}
			
			last.next = newNode;
		}
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListConcept list = new LinkedListConcept();
		
		list = insert(list, 11);
		list = insert(list, 134);
		list = insert(list, 156);
		list = insert(list, 10);
		list = insert(list, 12);

	}

}
