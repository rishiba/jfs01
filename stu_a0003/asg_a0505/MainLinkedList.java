class MainLinkedList
{
public static void main(String args[])
{
LinkedList x=new LinkedList();
ListNode head=new ListNode(1);
x.addAtHead(head);
//x.addAtHead(1);
x.addAtHead(new ListNode(2));
x.addAtHead(new ListNode (3));
x.addAtHead(new ListNode (4));
x.addAtHead(new ListNode (5));
//x.reverse(head);
ListNode reverseNode=x.reverse(head);
//x.reverse(head)=hh;
x.printlist(reverseNode);
}
}
