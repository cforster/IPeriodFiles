class IntStackTest
{
    public static void main(String[] args)
    {
	IntStack is = new IntStack(2);

	syso(is.isEmpty());
	is.push(10);
	is.push(20);
	is.push(30);
	syso(is.pop());
	syso(is.peek());
	syso(is.isEmpty());


	//tests for popall:
	int[] temp  = is.popall();
	for(int i =0; i<temp.length; i++)
	    {
	       	System.out.println(temp[i]);
	    }

	
	System.out.println(is.isEmpty());
	   
    }

    public static void syso(Object s)
    {
	System.out.println(s.toString());
    }
}
