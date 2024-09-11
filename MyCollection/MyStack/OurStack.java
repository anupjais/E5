public class OurStack<E>
{
	E[] e;
	int indx;
	OurStack()
	{
		e = (E[]) new Object[10];
	}
	public void push(E e)
	{
		if(indx==e.length)
		{
			e = 
		}
		this.e[indx++] = e;
	}
	public synchronized E pop()
	{
		if(indx==0)
			throw new EmptyStackException("There is no such element.");
			// throw new ArrayIndexOutOfBoundsException("There is no elements.");
		E temp = e[--indx];
		e[indx] = null;
		return temp;
	}
	public synchronized E peek()
	{
		if(indx==0)
			throw new EmptyStackException("There is no such element.");
			// throw new ArrayIndexOutOfBoundsException("There is no such element.");
		return e[indx-1];
	}
	public boolean empty()
	{
		if(indx==0)
			return true;
		return false;
	}

	public synchronized int search(E e)
	{
		if(indx==0)
			throw new EmptyStackException("There is no such element.");
		int cnt=0;
		for(int i=indx-1; i>=0;i--)
		{
			cnt++;
			if(this.e[i]==e)
				return cnt;
		}
		return -1;
	}

	public String toString()
	{
		if(indx==0)
			return "[]";
		String op = "[";
		for(int i=0; i<indx-1; )
			op += e[i++]+",";
		op += e[indx-1]+"]";
		return op;
	}
}


class EmptyStackException extends RuntimeException
{
	EmptyStackException(String str)
	{
		super(str);
	}
}

/*
public class java.util.Stack<E> extends java.util.Vector<E>
{
	public java.util.Stack();
	public E push(E);
	public synchronized E pop();
	public synchronized E peek();
	public boolean empty();
	public synchronized int search(java.lang.Object);
}
*/