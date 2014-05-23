import java.util.*;
import java.io.*;
public class ScanSkel{
    public static void main(String[]args){
	File file = new File("test.out");
	try{
	    Scanner sc = new Scanner(file);
	    while(sc.hasNext()){
		System.out.println(sc.nextLine());
	    }
	}
	catch(FileNotFoundException e){
	    System.out.println("file not found");
	}
    }
}