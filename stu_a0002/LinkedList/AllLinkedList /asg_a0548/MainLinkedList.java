class MainLinkedList
{
public static void main(String args[])
{
LinkedList x=new LinkedList();
x.addAtHead(9);
x.addAtHead(8);
x.addAtHead(7);
x.addAtHead(6);
x.printAll();
System.out.println("\nAdding element to Middle ");
x.addAtMiddle(8,2);
x.printAll();

}
}
