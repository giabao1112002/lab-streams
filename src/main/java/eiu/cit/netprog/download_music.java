/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eiu.cit.netprog;
import java.io.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
/**
 *
 * @author admin
 */
public class download_music {
    public static void main(String[] args) throws MalformedURLException {
String path = "C:\\Users\\admin\\lab-streams\\Output.wav";
try {
URL url = new URL("https://www.tanbinhtech.com:8443/sample1.wav");
InputStream in = url.openStream();
FileOutputStream w = new FileOutputStream(new File (path));
int c;
while ((c = in.read()) != -1) {
w.write(c);
}
} catch (Exception e) {
System.out.println(e);
}

}

}


