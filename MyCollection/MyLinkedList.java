// import java.util.Arrays;
class MyLinkedList<E>
{
	Node<E> head;
	Node<E> tail;
    int size;

	// public MyLinkedList()
	// {

	// }

	class Node<E>
	{
		E e;
		Node<E> next;
		public Node(E e)
		{
			this.e = e;
		}
	}

// METHODS
	public void addLast(E e)
	{
        Node<E> newNode = new Node<E>(e);
		if(head==null)
		{
            head = newNode;
            tail = newNode;
            size++;
        }
        
        Node<E> curNode = head;
        while(curNode.next!=null)
        {
            curNode = curNode.next;
        }
        curNode.next = newNode;
        size++;
        tail = newNode;
	}

    public void addFirst(E e)
    {
        Node<E> newNode = new Node<E>(e);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            size++;
        }else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public E getFirst()
    {
        if(head==null)
            throw new IndexOutOfBoundsException("No element here.");
        return head.e;
    }
    public E getLast()
    {
        if(head==null)
            throw new IndexOutOfBoundsException("No element here.");
        return tail.e;
    }

    public E removeFirst()
    {
        if(head==null)
            throw new IndexOutOfBoundsException("No element here.");
        Node<E> newNode = head;
        head = newNode.next;
        size--;
        return newNode.e;
    }
    public E removeLast()
    {
        if(head==null)
            throw new IndexOutOfBoundsException("No element here.");
        Node<E> currentNode = head;
        Node<E> temp;
        // while(currentNode.next!=null)
        // {
        //     temp = currentNode;
        //     currentNode = currentNode.next;
        // }
        // tail = temp;

        for(int i=0; i<size-2; i++)
        {
            currentNode = currentNode.next;
        }
        temp = currentNode.next;
        currentNode.next = null;
        tail = currentNode;
        size--;
        // System.out.println(tail.e);
        return temp.e;
    }
    public E remove(int index)
    {
        if(index<0 || index>=size)
            throw new IndexOutOfBoundsException("Wrong Index Entered.");
        Node<E> currentNode1 = head;
        Node<E> currentNode2;
        for(int i=0; i<index-1; i++)
        {
            currentNode1 = currentNode1.next;
        }
        currentNode2 = currentNode1.next;
        currentNode1.next = currentNode2.next;
        size--;
        return currentNode2.e;
    }

	@Override
	public String toString()
	{
		if(head==null)
			return "[]";
		
		String op = "[";
		Node<E> newNode = head;
		while(newNode.next!=null)
		{
			op += newNode.e+", ";
			newNode = newNode.next;
		}
		op +=  newNode.e+"]";
		return op;
	}
}

/*
transient int size;
transient java.util.LinkedList$Node<E> first;
transient java.util.LinkedList$Node<E> last;
public java.util.LinkedList();
public java.util.LinkedList(java.util.Collection<? extends E>);
void linkLast(E);
void linkBefore(E, java.util.LinkedList$Node<E>);
E unlink(java.util.LinkedList$Node<E>);
        public E getFirst();
        public E getLast();
        public E removeFirst();
        public E removeLast();
        public void addFirst(E);
		public void addLast(E);
public boolean contains(java.lang.Object);
        public int size();
public boolean add(E);
        public boolean remove(java.lang.Object);
public boolean addAll(java.util.Collection<? extends E>);
public boolean addAll(int, java.util.Collection<? extends E>);
public void clear();
public E get(int);
public E set(int, E);
public void add(int, E);
public E remove(int);
java.util.LinkedList$Node<E> node(int);
public int indexOf(java.lang.Object);
public int lastIndexOf(java.lang.Object);
public E element();
        public E remove();
public java.util.ListIterator<E> listIterator(int);
public java.util.Iterator<E> descendingIterator();
public java.lang.Object clone();
public java.lang.Object[] toArray();
		public <T> T[] toArray(T[]);
public java.util.Spliterator<E> spliterator();
public java.util.LinkedList<E> reversed();
public java.util.List reversed();
public java.util.SequencedCollection reversed();
public java.util.Deque reversed();
*/