import java.io.*;
class BinarySearchTree
{
	public static void main(String args[]) throws IOException
	{
		BST bst=new BST();
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		String line=br.readLine();
		while(line!=null){
			String[] array=line.split("\\|");
			bst.insert(array[0],array[1]);
			line=br.readLine();
		}
		bst.search("ga");
	}
}
