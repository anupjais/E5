import java.util.*;
class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0; i<size; i++)
			al.add(i, i*10);

		al.add(6,100);
		al.ensureCapacity(10);
		System.out.println(al);
		System.out.println(al.size());
	}
}