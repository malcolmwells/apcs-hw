import java.util.*;
public class Median{
    private PriorityQueue<Integer> less;
    private PriorityQueue<Integer> greater;
    public Median(){
	less = new PriorityQueue<Integer>();
	greater = new PriorityQueue<Integer>();
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
    /*Unsure how to implement a Comparator here; I don't think I understand the syntax. That said, it's
      necessary for the PriorityQueues to work correctly.
    */
	
}