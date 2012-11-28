public class IntQueueTest {

    public static void main(String[] args) {
	IntQueue iq = new IntQueue(2);

	//general tests:
	iq.put(3);
	iq.put(4);
	iq.put(5);
	
	//new function tests:


	// test for getall
	int[] temp= iq.getall();
	for(int i =0;i<temp.length; i++)
	    {
		System.out.println(temp[i]);
	    }
	System.out.println(iq.isEmpty());
    }

    //tests for popall
    int[] temp = is.popall();
    for(int i=0; i<temp.length; i++)
	{
	    System.out.println(temp[i]);
	}
    
    System.out.println(is.isEmpty());
}
