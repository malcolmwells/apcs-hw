public class MyLinkedList{
    private Node head;
    private Node tail;
    public MyLinkedList(){
	head = null;
	tail = null;
    }
    public MyLinkedList(Node head){
	this.head = head;
	tail = head;
    }
    public MyLinkedList(String data){
	this.head = new Node(data);
	tail = head;
    }
    public String toString(){
	Node tmp = head;
	String ans = "";
	while(tmp != null){
	    ans += tmp.getData()+", ";
	    tmp = tmp.getNext();
	}
	return ans;
    }
    public void add(String s){
	tail.setNext(new Node(s));
	tail = tail.getNext();
    }
    private Node nget(int index){
	Node tmp = head;
	for(int x = 0;x<index;x++){
	    tmp = tmp.getNext();
	}
	return tmp;
    }
    private void nset(int index, Node ins){
	Node tmp = head;
	for(int x = 0;x<index;x++){
	    tmp = tmp.getNext();
	}
	tmp.setData(ins.getData());
    }
    public void set(int i, String s){
	Node tmp = new Node(s);
	nset(i, tmp);
    }
    public String get(int index){
	return nget(index).getData();
    }
    public void add(int i, String s){
	Node tmp = new Node(s);
	if(i >= length()){
	    add(s);
	} else {
	    tmp.setNext(nget(i));
	    if(i>0){
		nget(i-1).setNext(tmp);
	    }else{
		tmp.setNext(head);
		head = tmp;
	    }
	}
    }
    public String remove(int i){
	String ans = get(i);
	if(i>0){
	    if(i == length()){
		tail = nget(i-1);
	    }
	    nget(i-1).setNext(nget(i+1));
	} else {
	    head = nget(i+1);
	}
	return ans;
    }
    public int find(String s){
	for(int x = 0;x<length();x++){
	    if(get(x).equals(s)){
		return x;
	    }
	}
	return -1;
    }
    public int length(){
	Node tmp = head;
	int counter = 0;
	while(tmp != null){
	    counter++;
	    tmp = tmp.getNext();
	}
	return counter;
    }
    public int nlength(){
	return head.length();
    }
}