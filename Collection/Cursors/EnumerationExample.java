import java.util.*;
@SuppressWarnings("unchecked")
class EnumerationExample
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		for(int i=0; i<=10;)
			list.add(++i*5);

		Enumeration enumera = list.elements();
		while(enumera.hasMoreElements())
		{
			// Object i=enumera.nextElement();
			System.out.println(list.nextElement());
		}
	}
}