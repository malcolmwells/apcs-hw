import java.util.*;
import java.io.*;
public class ArrayStack{
    private int index;
    private String[] data;
    public ArrayStack(){
	index = 0;
	data = new String[10];
    }
    public void push(String s){
	if(index >= data.length){
	    String[] temp = new String[data.length + 10];
	    for(int x = 0;x<data.length;x++){
		temp[x] = data[x];
	    }
	    data = temp;
	}
	data[index] = s;
	index++;
    }
    public String pop(){
	index--;
	return data[index];
    }
    public String peek(){
	return data[index-1];
    }
    public boolean isEmpty(){
	return index < 1;
    }
    public int getSize(){
	return index;
    }
    public String toString(){
	String tmp = "";
	for(int x = 0;x<index;x++){
	    tmp += data[x] + ", ";
	}
	return tmp;
    }
    public static void main(String[]args){
	ArrayStack s = new ArrayStack();
	s.push("a");
	System.out.println(s.peek());
	s.push("B");
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.isEmpty());
	s.push("a");
	System.out.println(s.toString());
	System.out.println(s.getSize());
    }
}
