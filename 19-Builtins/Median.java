import java.util.*;
public class Median{
    private PriorityQueue<Integer> less;
    private PriorityQueue<Integer> greater;
    public Median(){
	less = new PriorityQueue<Integer>(10, new RevComp());
	greater = new PriorityQueue<Integer>();
    }
    public String toString(){
	String ans = less.peek().toString();
	return ans + ", " + greater.peek().toString();
    }
    public void add(int x){
	if(less.size() > greater.size())
	    greater.add(new Integer(x));
	else
	    less.add(new Integer(x));
    }
    public int findMedian(){
	if(less.size() > greater.size())
	    return less.peek().intValue();
	else
	    return (less.peek().intValue() + greater.peek().intValue())/2;
    }
    public int removeMedian(){
	if(less.size() > greater.size())
	    return less.poll().intValue();
	else
	    return (less.poll().intValue() + greater.poll().intValue())/2;
    }
    public static void main(String[]args){
	Median m = new Median();
	m.add(3);
	m.add(2);
	System.out.println(m.toString());
	m.add(10);
	m.add(100);
	System.out.println(m.toString());
	m.add(-5);
	System.out.println(m.toString());
	System.out.println(m.findMedian());
    }
    private class RevComp implements Comparator<Integer>{
	public int compare(Integer x, Integer y){
	    return y.intValue() - x.intValue();
	}
    }
	
}