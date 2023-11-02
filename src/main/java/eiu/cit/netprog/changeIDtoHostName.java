package eiu.cit.netprog;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class changeIDtoHostName {
     public static void main(String[] args) throws IOException{
            Reader input = new FileReader("C:\\Users\\admin\\lab-streams\\input.txt", null);
            
            int i = input .read();

            while (i != -1) {
                System.out.print((char) i);

                i = input.read();
                
            }
            input.close();




        }
            
     }

