package Queue;

class CirQueue {
	int arr[];
	int front;
	int rear;
	final int DEFAULT_CAPACITY = 10;
	
	CirQueue() {
		arr = new int[DEFAULT_CAPACITY];
		front = rear = 0;
	}
	
	CirQueue(int capacity) {
		if(capacity < 1)
		{
			throw new RuntimeException("Invalid Capacity");
		}
		arr = new int[capacity];
		front = rear = 0;
	}
	
	void enqueue(int data) {
		if(rear == arr.length) {
			throw new RuntimeException("Queue is Full");
		}
		
		int availableIndex = (front + rear) % arr.length;
		arr[availableIndex] = data;
		rear++;
	}
	
	int dequeue() {
		if(rear == 0) {
			throw new RuntimeException("Queue is Empty");
		}
		
		int data = arr[front];
		arr[front] = 0;
		front = (front + 1) % arr.length;
		rear--;
		
		return data;
	}
	
	public void print() {
		for(int i = 0; i < rear; i++)
		{
			int index = (front + i) % arr.length;
			System.out.print(arr[index]+" ");
		}
	}
}

public class CircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CirQueue q = new CirQueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.print();
		q.dequeue();
		System.out.println();
		q.print();
		
		q.enqueue(60);
		System.out.println();
		q.print();

		q.enqueue(70);
		System.out.println();
		q.print();
	}

}
