class OurStackDriver
{
	public static void main(String[] args)
	{
		OurStack stack = new OurStack();
		System.out.println(stack);
		System.out.println(stack.empty());
		// stack.push(10);
		// stack.push(20);
		// stack.push(30);
		// stack.push(70);
		// stack.push(0);
		// stack.push(true);
		// stack.push("Udit Narayan");
		
		// System.out.println(stack);
		// System.out.println(stack.search(true));
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}