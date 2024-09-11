import java.util.*;
class VectorCollectionCapacity
{
	public static void main(String[] args)
	{
		// Vector<Object> v1 = new Vector<>(14,30);
		// System.out.println(v1.size()+", "+v1.capacity());
		// for(int i=0; i<15; i++)
		// 	v1.add(i);
		// System.out.println(v1.size()+", "+v1.capacity());

		// Vector<Object> v2 = new Vector<>(v1);
		// System.out.println(v2.size()+", "+v2.capacity());
		// for(int i=1; i<20; i++)
		// 	// firstElement()
		// 	// v2.firstElement(i*10);
		// 	v2.add(i*10);
		// System.out.println(v2.size()+", "+v2.capacity());


		Vector<Object> v1 = new Vector<>();
		System.out.println(v1.capacity()+", "+v1.size());
		System.out.println(v1);
		v1.add("Anup");
		v1.add(10);
		System.out.println(v1.capacity()+", "+v1.size());
		System.out.println(v1);
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		v1.checkInvariants();
	}
}