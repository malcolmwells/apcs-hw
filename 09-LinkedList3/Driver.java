public class Driver{
    public static void main(String[]args){
      	Node a = new Node("A");
	a.setNext(new Node("B"));
	a.getNext().setNext(new Node("C"));
	//0
	MyLinkedList l = new MyLinkedList(a);
	l.add("D");
	//1
	System.out.println(l.toString());
	//2
	l.add(0, "0");
	l.add(4, "E");
	System.out.println(l.toString());
	//3
	System.out.println(l.get(2));
	//4
	l.set(1, "1");
	//5
	l.remove(3);
	System.out.println(l.toString());
	//6
	System.out.println(l.find("0"));
	//7
	System.out.println(l.length());
	/*	Node a = new Node("a");
	MyLinkedList l = new MyLinkedList(a);
	MyLinkedList n = new MyLinkedList(a);
	for(int x = 0;x<100000;x++){
	    l.add("a");
	    n.add("a");
	}
	System.out.println("start");
	System.out.println(l.length());
	System.out.println(n.nlength());*/
    }
}