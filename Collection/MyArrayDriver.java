import java.util.Scanner;
class MyArrayDriver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size = sc.nextInt();
		MyArrayList list = new MyArrayList();
		System.out.println("capacity : "+list.capacity());
		System.out.println("\033[93mBefore Insertion : \033[91m"+list+"\033[0m");
		for(int i=1; i<=size; i++)
			list.add(i-1,i*10);

		System.out.println("\033[93mAfter Insertion : \033[91m"+list+"\033[0m");
		// list.trimToSize();
		// System.out.println("capacity : "+list.capacity());
		// System.out.println("\033[93mAfter Insertion : \033[91m"+list+"\033[0m");
		// System.out.print("Enter the element : ");
		// int index = sc.nextInt();
		// System.out.println(list.get(index));
	}
}