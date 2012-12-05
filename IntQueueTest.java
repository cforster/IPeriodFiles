public class IntQueueTest {

    public static void main(String[] args) {
	IntQueue iq = new IntQueue(70);

	//general tests:

	//iq.put(3);
	//iq.put(4);
	//iq.put(5);
	iq.put(3);
	iq.put(4);
	iq.put(5);
	iq.put(6);
	iq.put(7);
	
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
      

    //tests for getall
    int[] tempo = iq.getall();
    for(int i=0; i<tempo.length; i++)
	{
	    System.out.println(tempo[i]);
	}
    
    System.out.println(iq.isEmpty());

    //tests for getUntil

    iq.put(3);
    iq.put(2);
    iq.put(4);
    iq.put(2);
    iq.put(3);
    int [] gotten = iq.getUntil(4);
    System.out.print("this is what we got: ");
    for (int i : gotten) {
	System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("this is what is next in the queue: " + iq.peek());


    //tests for get(depth) here:

    
    }
}
