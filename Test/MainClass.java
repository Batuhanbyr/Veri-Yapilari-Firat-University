package Test;

public class MainClass {

	public static void main(String[] args) {
	List list = new List();
	
	list.CreateaNode(1);
	list.CreateaNode(2);
	list.CreateaNode(3);
	list.CreateaNode(4);
	list.CreateaNode(5);
	
	//list.MakeFirst(34);
	//list.MakeLast(999);
	
	//list.AddinMid(2, 666);
	//list.DeleteFirst();
	//list.DeleteLast();
	
	//list.DeleteMid(3); // our index start with 1 first index are always 1 not 0 
	
	//list.PrintList();
	
	//list.AddNodestotheFirst(list ,555,545,23);
	//list.AddNodesattheEnd(list,1,2,3);
	//list.AddNodestotheMid(2, list,8,8,8);
	
	//list.DeleteFirst(2,list);
	
	//list.DeleteLast(2,list);
	
	//list.DeleteMidNodes(1, 3, list);
	list.PrintList();
	//System.out.println(list.head.value);
	//list.ListHead(list);
	}

}
