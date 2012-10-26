public class IntQueueTest {

    public static void main(String[] args) {
	IntQueue iq = new IntQueue(2);

	//general tests:
	//iq.put(3);
	//iq.put(4);
	//iq.put(5);
	
	//new function tests:



	// test for getall
	int[] temp= iq.getall();
	for(int i =0;i<temp.length; i++)
	    {
		System.out.println(temp[i]);
	    }
	System.out.println(iq.isEmpty());

	
	//gold/seminara test for put(int[])
	int [] test = new int[3];
	test[0] = 1;
	test[1] = 2;
        test [2] = 3;
	iq.put(test);
	System.out.println(iq.get());

    }

}
