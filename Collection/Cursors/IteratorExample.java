import java.util.*;
@SuppressWarnings("unchecked")
class IteratorExample
{
	public static void main(String[] args)
	{
		List list = new ArrayList();
		for(int i=0; i<=10;)
			list.add(++i*10);

		list.forEach((ele)->System.out.print(ele+", "));
		System.out.println("\b\b.");
	}
}