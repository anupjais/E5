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
	public void addLast(E e)
	{
    Node<E> newNode = new Node<E>(e);
		if(head==null)
		{
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
          Node<E> curNode = head;
          while(curNode.next!=null)
        {
            curNode = curNode.next;
        }
            curNode.next = newNode;
            size++;
        } 
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


	@Override
	public String toString()
	{
		if(head==null)
			return "[]";
		
		String op = "[";
		Node<E> newNode = head;
		while(newNode.next!=null)
		{
			op += newNode.next+", ";
			newNode = newNode.next;
		}
		op +=  newNode.e+"]";
		return op;
	}
}

/*
public class java.util.LinkedList<E> extends java.util.AbstractSequentialList<E> implements java.util.List<E>, java.util.Deque<E>, java.lang.Cloneable, java.io.Serializable {
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
  public E peek();
  public E element();
  public E poll();
  public E remove();
  public boolean offer(E);
  public boolean offerFirst(E);
  public boolean offerLast(E);
  public E peekFirst();
  public E peekLast();
  public E pollFirst();
  public E pollLast();
  public void push(E);
  public E pop();
  public boolean removeFirstOccurrence(java.lang.Object);
  public boolean removeLastOccurrence(java.lang.Object);
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