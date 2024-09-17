import java.util.Stack;
@SuppressWarnings("unchecked")
class Demo
{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		for(int i=0; i<10; )
			s.push(++i*5);

		for(int i=1; i<5; i++)
			System.out.println(s.search(10));
	}
}