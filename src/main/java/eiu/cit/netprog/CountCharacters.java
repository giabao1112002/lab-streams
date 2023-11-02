package eiu.cit.netprog;
import java.io.*;
public class CountCharacters {
     

	public static void main(String[] args) throws Throwable {
		
		String name = "C:\\Users\\admin\\lab-streams\\src\\main\\java\\doc1.txt";
		InputStream reader=new FileInputStream(new File(name));
		int count=0;
		while(reader.read()>-1) {
			count+=1;
		}
		System.out.println(count);

	}

}
