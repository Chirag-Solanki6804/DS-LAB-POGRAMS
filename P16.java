class CirclarQueueMethods{
	int front=0;
	int rear=0;
	int[] queueArr = new int[5];
	void CQueueInsert(int y){
		if(rear==4){
			rear=0;
		}else{
			rear++;
		}
		if(rear==front){
			System.out.println("Stack overFlow");
		}
		queueArr[rear]=y;
		if(front==0){
			front=1;
		}
	}
	void CQueueDelet(){
		if(front==0){
			System.out.println("Queue Underflow");
			//return 0;
		}
		//int y=queueArr[front];
		if(front==rear){
			front=0;
			rear=0;
			//return y;
		}
		if(front==4){
			front=0;
		}else{
			front++;
			//return y;
		}
	}
	void display(){
		for(int i=0;i<=4;i++){
			int temp=queueArr[i];
			System.out.println(temp);
		}
	}

}
public class P16{
    public static void main(String[] args) {
    	CirclarQueueMethods obj=new CirclarQueueMethods();
    	obj.CQueueInsert(4);
    	obj.CQueueInsert(5);
    	obj.CQueueInsert(6);
    	obj.CQueueInsert(7);
    	obj.CQueueInsert(8);
    	obj.CQueueInsert(9);
    	obj.display();
    }
}


    	

   