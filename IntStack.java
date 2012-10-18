class IntStack
{
    //declarations:
    private int top = 0;
    private int[] stack;

    //constructor:
    public IntStack(int size)
    {
	stack = new int[size];
    }

    //functions:
    void push(int i)
    {
	stack[top++]=i;
	if(top==stack.length) resize();
    }
	
    int pop()
    {
	if(!isEmpty()) return stack[--top];
	return -1;
    }

    int peek()
    {
	if(!isEmpty()) return stack[top-1];
	return -1;
    }

    boolean isEmpty()
    {
	return top==0;
    }

    //resize
    private void resize()
    {
	int[] newArray = new int[2*stack.length];
	for(int i =0; i<stack.length; i++)
	    {
		newArray[i]=stack[i];
	    }
	
	stack=newArray;
    }

    /*
     * size function
     * @author cforster
     */
    int size()
    {
	return top;
    }
    
    /*
     * pop all function
     * @author Abby Kasdin, Soleil Ball Van Zee
     */
    int[] popall()
    {
	int[] newArray = new int[top];
	int i = 0;

	while(!isEmpty())
	    {
	        newArray[i++] = pop();
	    }	

	return newArray;
    }

}
