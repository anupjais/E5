class MyLinkedListDriver
{
	public static void main(String[] args)
	{
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.addFirst(70);
		System.out.println("List "+list);
		System.out.println("list-size : "+list.size);
		System.out.println("Revomed : "+list.remove(6));
		System.out.println("List "+list);
		System.out.println("list-size : "+list.size);

	}
}