class QueueMethods{
	int front=0;
	int rear=0;
	int[] queueArr = new int[100];
	void enQueue(int y){
		if(rear>=100){
			System.out.println("Queue Overflow");
		}
		rear++;
		queueArr[rear]=y;
		if(front==0){
			front=1;
		}
	}
	void deQueue(){
		if(front==0){
			System.out.println("Queue Underflow");
			//return 0;
		}
		//int y=queueArr[front];
		if(front==rear){
			front=0;
			rear=0;
		}else{
			front++;
		}
		//return y;
	}
	void display(){
		for(int i=front;i<=rear;i++){
			int temp=queueArr[i];
			System.out.println(temp);
		}
	}

}
public class P15{
    public static void main(String[] args) {
    	QueueMethods obj=new QueueMethods();
    	obj.enQueue(4);
    	obj.enQueue(5);
    	obj.enQueue(6);
    	obj.enQueue(7);
    	obj.enQueue(8);
    	obj.enQueue(9);
    	obj.deQueue();
    	obj.deQueue();
    	obj.display();
    }
}


    	

   