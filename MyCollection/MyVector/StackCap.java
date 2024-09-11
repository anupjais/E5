class StackCap
{
	static int count;
	public static void main(String[] args)
	{
		m1();
	}
	public static void m1()
	{
		System.out.print(count++ +" ");
		m1();
	}
}