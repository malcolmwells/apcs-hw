import java.util.*;
import java.io.*;
public class MyLinkedList<E> implements Iterable{
    private Node<E> head;
    public MyLinkedList(){
	head = null;
    }
    public MyLinkedList(Node head){
	this.head = head;
    }
    public MyLinkedList(E data){
	this.head = new Node(data);
    }
    public Iterator<E> iterator(){
	return new MyLLIterator<E>(head);
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
    public void add(E s){
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
    public E get(int index){
	return nget(index).getData();
    }
    public void add(int i, E s){
	Node tmp = new Node(s);
	tmp.setNext(nget(i));
	if(i>0){
	    nget(i-1).setNext(tmp);
	}else{
	    tmp.setNext(head);
	    head = tmp;
	}
    }
    public E remove(int i){
	E ans = get(i);
	if(i>0){
	    nget(i-1).setNext(nget(i+1));
	} else {
	    head = nget(i+1);
	}
	return ans;
    }
    public int find(E s){
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
	}
	return counter;
    }
}