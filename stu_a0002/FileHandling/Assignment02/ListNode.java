class ListNode
{
private ListNode next;
private int id;
private String pos;
private String color;
private int marks;
private String subject;

public ListNode(int d,String p,String c,int m,String s)
{
id=d;
pos=p;
color=c;
marks=m;
subject=s;
next=null;
}

public void setId(int d)
{
id=d;
}

public void setPos(String p)
{
pos=p;
}

public void setColor(String c)
{
color=c;
}

public void setMarks(int m)
{
marks=m;
}

public void setSubject(String s)
{
subject=s;
}

public int getId()
{
return id;
}

public String getPos()
{
return  pos;
}

public String getColor()
{
return color;
}

public int getMarks()
{
return marks;
}

public String getSubject()
{
return subject;
}

public void setNext(ListNode n)
{
next=n;
}

public ListNode getNext()
{
return next;
}
}
