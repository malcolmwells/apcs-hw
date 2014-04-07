import java.util.*;
import java.io.*;
public class MyLLIterator<E> implements Iterator<E>{
    private Node<E> h;
    public MyLLIterator(Node<E> h){
	this.h = h;
    }
    public boolean hasNext(){
	return h.getNext() != null;
    }
    public E next(){
	E x = h.getData();
	h = h.getNext();
	return x;
    }
    public void remove(){
	h = h.getNext();
    }
}