class LinkedList
{
	ListNode head;

	LinkedList()
	{
		head=null;
	}

	public void addAtHead(int data)
	{
		if(head==null)
		{
			head=new ListNode(data);
			head.setNext(null);
		}
		else
		{
			ListNode temp=new ListNode(data);
			temp.setNext(head);
			head=temp;
		}
	}
	public void addAtMiddle(int m,int node )
	{
		ListNode n=new ListNode(m);;
		ListNode temp=head;
		ListNode temp1=head.getNext();
		if(node==1)
		{
			temp.setNext(n);
			n.setNext(temp1);
		}
		else
		{
			for(int i=0;i<node-1&&temp.getNext()!=null;i++)
			{
				temp=temp.getNext();
				temp1=temp1.getNext();
			}
			temp.setNext(n);
			n.setNext(temp1);
		}
	}


	public int delFromHead()
	{
		if(head==null)
		{
			System.out.println("linkedList is empty");
			return 0;
		}
		else if(head.getNext()==null)
		{
			ListNode temp=head;
			head=null;
			return temp.getData();
		}
		else
		{
			ListNode temp=head;
			head=head.getNext();
			return temp.getData();
		}
	}
	public void addAtTail(int data)
	{
		if(head==null)
		{
			head=new ListNode(data);
			head.setNext(null);
		}
		else
		{
			ListNode tail=new ListNode(data);
			ListNode temp=head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(tail);
			tail.setNext(null);
		}
	}

	public void compareHead(int data)
	{
		ListNode temp=new ListNode(data);
		if(head==null)
		{
			temp.setNext(null);
			head=temp;
		}
		else if(temp.getData()<=head.getData())
		{
			temp.setNext(head);
			head=temp;
		}
		else
		{
			ListNode point1=head;
			ListNode point2=head.getNext();

			if(point1.getNext()==null)
			{
				point1.setNext(temp);
				temp.setNext(null);
			}
			else
			{
				while(temp.getData()>point1.getData()&& point2.getNext()!=null)
				{
					if(temp.getData()>point1.getData() && temp.getData()>point2.getData())
					{
						point1=point1.getNext();
						point2=point2.getNext();
					}
					else if(temp.getData()>point1.getData() && temp.getData()<point2.getData())
					{
						break;
					}
				}

				if(point2.getNext()==null && temp.getData()>point2.getData())
				{
					point2.setNext(temp);
					temp.setNext(null);
				}
				else if(temp.getData()>point1.getData() && temp.getData()<point2.getData())
				{
					point1.setNext(temp);
					temp.setNext(point2);
				}
			}
		}
	}
	public void printAll(int x)
	{
		if(head==null)
		{
			System.out.println("linkedList is Empty");
		}
		else
		{
			ListNode temp=head;
			while(temp.getNext()!=null)
				
			{
				System.out.print(" " +temp.getData()+" ");
				
				temp=temp.getNext();
			}
			System.out.println(temp.getData());
		}
	}
}

