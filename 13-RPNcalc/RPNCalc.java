import java.util.*;
import java.io.*;
public class RPNCalc{
    public ArrayStack s;
    public RPNCalc(){
	s = new ArrayStack();
    }
    public void result(String l){
	if(l.equals("+")){
	    Double n = Double.parseDouble(s.pop()) + Double.parseDouble(s.pop());
	    s.push(Double.toString(n));
	    System.out.println(n);
	}
	else if(l.equals("-")){
	    Double n = Double.parseDouble(s.pop()) - Double.parseDouble(s.pop());
	    s.push(Double.toString(n));
	    System.out.println(n);
	}
	else if(l.equals("*")){
	    Double n = Double.parseDouble(s.pop()) * Double.parseDouble(s.pop());
	    s.push(Double.toString(n));
	    System.out.println(n);
	}
	else if(l.equals("/")){
	    Double n = Double.parseDouble(s.pop()) / Double.parseDouble(s.pop());
	    s.push(Double.toString(n));
	    System.out.println(n);
	} else {
	    s.push(l);
	}
    }
    public static void main(String[]args){
	RPNCalc c = new RPNCalc();
	Scanner i = new Scanner(System.in);
	while(i.hasNext()){
	    String l = i.next();
	    c.result(l);
	}
    }
}