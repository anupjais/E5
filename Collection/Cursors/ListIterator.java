import java.util.*;
@SuppressWarnings("unchecked")
class ListIterator
{
	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add("10");
		list1.add(null);
		list1.add(true);
		list1.add('a');
		list1.add(10.0);
		System.out.println(list1);

		ArrayList<Integer> list2 = new ArrayList<>(list1);
		System.out.println(list2);
		for (Object i : list2)
			System.out.print(i+" instanceof : "+instanceof(i) );
		System.out.println();
	}
}