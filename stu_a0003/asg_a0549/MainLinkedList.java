class MainLinkedList
{
public static void main(String args[])
{
LinkedList x=new LinkedList();
x.addAtHead(2);
x.addAtHead(3);
x.addAtHead(4);
x.addAtHead(5);
x.printAll();
System.out.println("\nAfter deleting element of tail ");
x.delFromTail();
x.printAll();

}
}
