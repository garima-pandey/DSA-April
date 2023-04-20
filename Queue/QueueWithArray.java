package Queue;

class Queue {
	int front;
	int rear;
	int data[];
	int size;
	
	Queue(int len){
		data = new int[len];
		front = rear = -1;
		size = 0;
	}
	
	void enqueue(int value) {
		if(size == data.length)
			System.out.println("Queue is Full");
		
		if(size == 0)
			front = 0;
		
		rear++;
		size++;
		
		if(rear == data.length)
			rear = 0;
		
		data[rear] = value;
	}
	
	int dequeue() {
		if(size == 0)
			System.out.println("Queue is Empty");
		
		int temp = data[front];
		front++;
		
		if(front == data.length)
			front = 0;
		
		size--;
		
		if(size == 0)
			front = rear = -1;
		
		return temp;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	void print() {
		while(!isEmpty()) {
			System.out.println(dequeue());
		}
	}
}

public class QueueWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue(5);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
//		q.dequeue();
		q.print();

	}

}
