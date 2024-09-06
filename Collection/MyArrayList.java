import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;

public class MyArrayList
{
	int indx;
	Integer[] arr ;

	MyArrayList()
	{
		arr = new Integer[10];
	}
// 1.
	public void add(Integer e)
	{
		if(arr.length==indx)
		{
			int nSize = (((arr.length*3)/2)+1);
			Integer[] narr = Arrays.copyOf(arr,nSize);
			arr = narr;
		}
		arr[indx++]=e;
	}
// 1.1..
	public void add(int index, Integer e)
	{
		if(index<0 || index>indx)
			throw new IndexOutOfBoundsException("Wrong "+index+" index entered.");
		// if(index==indx)
		if(index==arr.length)
		{
			int nSize = (((arr.length*3)/2)+1);
			Integer[] narr = Arrays.copyOf(arr,nSize);
			arr = narr;
		}
		arr[index]=e;
		indx++;
	}
// 1.2..
	/*public void add(Collection e)
	{
		if(arr.length==indx)
		{
			int nSize = (((arr.length*3)/2)+1);
			Integer[] narr = Arrays.copyOf(arr,nSize);
			arr = narr;
		}
		arr[indx++]=e;
	}*/
// 2.
	public int capacity()
	{
		return arr.length;
	}
// 3.
	public int size()
	{
		return indx;
	}
// 4.
	public String toString()
	{
		if(indx==0)
			return "[]";
		String op = "[";
		for(int i=0; i<indx; i++) // Don't use forEach because it returns unnesessory data.
			op += arr[i]+", ";
		op += "\b\b]";
		return op;
	}
// 5. Have some work
	public void ensureCapacity(int indx)
	{
		Integer[] narr = new Integer[indx];
		arr = narr;
	}
// 6. Have some work
	public int length()
	{
		return indx;
	}
// 7.
	public int indexOf(Integer e)
	{
		for(int i=0; i<indx; i++)
		{
			if(arr[i].equals(e))
				return i;
		}
		return -1;
	}
// 7.
	public int lastIndexOf(Integer e)
	{
		for(int i=indx-1; i>=0; i--)
		{
			if(arr[i].equals(e))
				return i;
		}
		return -1;
	}
// 8. 
	public Integer get(int index)
	{
		if(index<0 || index>=indx)
			throw new IndexOutOfBoundsException("Wrong index");
		return arr[index];
	}
// 9. 
	public Integer set(int index, Integer e)
	{
		if(index<0 || index>=indx)
			throw new IndexOutOfBoundsException("Wrong index");
		Integer temp = arr[index];
		arr[index]=e;
		return temp;
	}
// 10.
	public void trimToSize()
	{
		Integer[] narr = Arrays.copyOf(arr, size());
		arr = narr;
	}
}