public class IntQueueTest {

    public static void main(String[] args) {
	IntQueue iq = new IntQueue(2);

	//general tests:
<<<<<<< HEAD
	//iq.put(3);
	//iq.put(4);
	//iq.put(5);
=======
	iq.put(3);
	iq.put(4);
	iq.put(5);
	iq.put(6);
	iq.put(7);
>>>>>>> working?
	
	//new function tests:
<<<<<<< HEAD



	// test for getall
	int[] temp= iq.getall();
	for(int i =0;i<temp.length; i++)
	    {
		System.out.println(temp[i]);
	    }
	System.out.println(iq.isEmpty());
<<<<<<< HEAD

	
	//gold/seminara test for put(int[])
	int [] test = new int[3];
	test[0] = 1;
	test[1] = 2;
        test [2] = 3;
	iq.put(test);
	System.out.println(iq.get());

=======
=======
      
	
>>>>>>> made resize
>>>>>>> working?
    }

}
