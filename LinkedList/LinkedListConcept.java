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
	
	public static void printList(LinkedListConcept list) {
		Node curNode = list.start;
		
		System.out.println("Linked List");
		while(curNode != null) {
			System.out.print(curNode.data+" ");
			curNode = curNode.next;
		}
		System.out.println();
	}
	
	public static LinkedListConcept deleteAtPosition(LinkedListConcept list, int index) {
		Node curNode = list.start;
		Node prev = null;
		
//		case 1: index 0
		
		if(index == 0 && curNode != null) {
			list.start = curNode.next; // 2--->1
			System.out.println(index+ "Position element deleted");
			return list;
		}
		
//		case 2: index > 0, index < size of LL // 0-index
		int counter = 0;
		
		while(curNode != null) {
			if(counter == index) { // 1
				prev.next = curNode.next; // 3
				System.out.println(index+ "Position element deleted");
				break;
			}
			else {
				prev = curNode;
				curNode = curNode.next;
				counter++;
			}
		}
		
//		case 3: index > size of LL
		
		if(curNode == null) {
			System.out.println(index+ "Position element not found");
		}
		
		return list;
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
		
		printList(list);
		
		deleteAtPosition(list, 0);
		
		printList(list);
		
		deleteAtPosition(list, 2);
		
		printList(list);
		
		deleteAtPosition(list, 2);
		
		printList(list);

	}

}
