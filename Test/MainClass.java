package Test;

public class MainClass {

	public static void main(String[] args) {
	List list = new List();
	
	list.CreateaNode(1);
	list.CreateaNode(2);
	list.CreateaNode(3);
	list.CreateaNode(4);
	list.CreateaNode(5);
	
	list.MakeFirst(34);
	list.MakeLast(999);
	
	list.AddinMid(2, 666);
	list.DeleteFirst();
	list.DeleteLast();
	
	list.DeleteMid(3); // our index start with 1 first index are always 1 not 0 
	
	list.PrintList();
	
	}

}
