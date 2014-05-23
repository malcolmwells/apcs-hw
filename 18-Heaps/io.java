import java.io.*;

public class io {

    public static void main(String[] args){
	PrintWriter out=null;
	try {

	    out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
	} catch (Exception e){};

	    out.print ("HELLO");
	    out.println (" World!");
	    out.close ();

    }
	

}
