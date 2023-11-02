/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eiu.cit.netprog;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author admin
 */
public class Download_Play {

    public static void main(String[] args) throws MalformedURLException {
        String path = "C:\\Users\\admin\\lab-streams\\Output.wav";
        try {
            URL url = new URL("https://www.tanbinhtech.com:8443/sample1.wav");
            InputStream in = url.openStream();
            FileOutputStream w = new FileOutputStream(new File(path));
            int c;
            while ((c = in.read()) != -1) {
                w.write(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
