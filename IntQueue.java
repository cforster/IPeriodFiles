public class IntQueue {

    private int[] queue;
    private int front, back;
    
    public IntQueue(int size) {
	queue = new int[size];
	front = 0;
	back = 0;
    }

    public void put(int n) {
	queue[back++] = n;
	back %= queue.length;
	if(isEmpty()) resize();
    }

    public int get() {
	if(isEmpty()) return -1;

	int ret = queue[front++];
	front %= queue.length;	
	return ret;
    }
    //Elias and Deven #straightballin not finished!
    private void resize() {
	tempqueue = new int[size *2];
	for(int i = 0; i < tempqueue.length; i++;){
	    for(int j = 0; j < front; j ++;){
		queue[j] = tempqueue[i];
		
	    }
	}
	for(int i = tempqueue.length; i > 0 ; i--;){
	    for(int j = 0; j >= front; j ++;){
		queue[j] = tempqueue[i];
		
	    }
	}
	

    }

    public boolean isEmpty() {
	return back == front;
    }

    //Elias and Deven #straightballin
    public int getput(int i){
	int gotten = get();
	put(i);
	return gotten;
    }

}
