public class MyLinkedList{
    private Node head;
    public MyLinkedList(){
	head = null;
    }
    public MyLinkedList(Node head){
	this.head = head;
    }
    public MyLinkedList(String data){
	this.head = new Node(data);
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
	Node tmp = new Node(s);
	tmp.setNext(head);
	head = tmp;
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
	tmp = ins;
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
	tmp.setNext(nget(i));
	if(i>0){
	    nget(i-1).setNext(tmp);
	}else{
	    tmp.setNext(head);
	    head = tmp;
	}
    }
    public String remove(int i){
	String ans = get(i);
	if(i>0){
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
}