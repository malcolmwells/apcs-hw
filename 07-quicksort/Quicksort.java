//Doesn't work when the array contains two numbers of value pivot; I'm not sure how to fix this.
import java.util.*;
public class Quicksort{
    public static int[] qsort(int[] L){
	if(L.length <= 1){
	    return L;
	} else {
	    int pivot = L[(int)(Math.random()*L.length)];
	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();
	    for(int x : L){
		if(x < pivot){
		    lower.add(new Integer(x));
		}
		if(x > pivot){
		    upper.add(new Integer(x));
		}
	    }
	    Integer[] low = lower.toArray(new Integer[]{});
	    Integer[] high = upper.toArray(new Integer[]{});
	    int[] l = new int[low.length];
	    int[] h = new int[high.length];
	    for(int x = 0;x<low.length;x++){
		l[x] = low[x].intValue();
	    }
	    for(int x = 0;x<high.length;x++){
		h[x] = high[x].intValue();
	    }
	    l = qsort(l);
	    h = qsort(h);
	    for(int i = 0;i<L.length;i++){
		if(i<l.length){
		    L[i] = l[i];
		} else if(i == l.length){
		    L[i] = pivot;
		} else if(i>l.length){
		    L[i] = h[i-(l.length+1)];
		}
	    }
	    return L;
	}
    }
    public static void main(String[]args){
	int[] L = {4, 6, 1, 12, 5};
	L = qsort(L);
	for(int x : L){
	    System.out.print(x + " ");
	}
	System.out.println();
    }
}