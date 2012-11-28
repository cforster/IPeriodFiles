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
    
    public int peek(){
	return queue[front];
   }

    
    //Elias and Deven #straightballin not finished!
    private void resize() {
	int[] tempqueue;
	
	tempqueue = new int[size() *2];
	for(int i = 0; i < tempqueue.length; i++){
	    for(int j = 0; j < front; j ++){
		queue[j] = tempqueue[i];
		
	    }
	}
	for(int i = tempqueue.length; i > 0 ; i--){
	    for(int j = 0; j >= front; j ++){
		queue[j] = tempqueue[i];	
	    }
	}
    }
    
    public boolean isEmpty() {
	return back == front;
    }

    /*   
 //Elias and Deven #straightballin
    public int getput(int i){
	int gotten = get();
	put(i);	return gotten;

*/
 
 /*
     * get all function
     * @author Abby "Rock Hard Abz" Kasdin and Soleil "Stoooopid Soleel" Ball Van Zee
     */
    int [] getall()
    {
	int [] newArray = new int [size()];
	int i = 0;
	
	while(!isEmpty())
	    {
		newArray[i++]=get();
	    }	

	return newArray;
    }

    /* size ABZ AND STUOPUID */
    int size()
    {
	if(front>back) return queue.length - (front-back);
	else return back-front;
    }


    //Adam and Alison
    int[] getUntil(int a)
    {
	IntQueue newqueue = new IntQueue(size());
	
	while(!isEmpty()&&peek()!=a){
	    newqueue.put(get());
	}
	return newqueue.getall();
    }
  
}
