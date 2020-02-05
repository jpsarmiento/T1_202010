package model.data_structures;

public class LinkedList <Item>
{

	private Node<Item> first;

	private Node<Item> last;

	private int length;


	public LinkedList ()
	{
		first = null;
		last = null;
		length = 0;
	}

	public void addAtBeginning(Item x)
	{
		if(first == null) 
		{
			first = new Node<Item>(x);
			last = first;;
			length = 1;
		}
		else
		{
			Node<Item> oldFirst = first;
			first = new Node<Item>(x);
			first.setNext(oldFirst);
			length ++;
		}
	}

	public void addAtEnd(Item x)
	{
		if(first == null)
			addAtBeginning(x);
		else
		{
			Node<Item> newLast = new Node<Item>(x);
			last.setNext(newLast);
			last = newLast;
			length++;
		}
	}


	public void delete(int pos) throws Exception
	{
		if(pos>length-1)
			throw new Exception("Out of bounds!");
		
		if(pos == 0)
		{
			first = first.getNext();
			length--;
		}
		
		else
		{
			int i = 1;
			Node<Item> a = first.getNext();
			Node<Item> b = first;
			while(pos != i)
			{
				b = b.getNext();
				a = a.getNext();
				i++;
			}
			b.setNext(a.getNext());
			length--;
		}
	}

	public int getLength()
	{
		return length;
	}

	public Node getAt(int pos) throws Exception
	{
		if(pos>length-1)
			throw new Exception("Out of bounds!");
		
		int i = 1;
		Node<Item> r = first.getNext();
		while(i!=pos)
		{
			r = r.getNext();
			i++;
		}
		return r;
	}
	
	
}

