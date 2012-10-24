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

    private void resize() {
	
    }

    public boolean isEmpty() {
	return back == front;
    }

}
