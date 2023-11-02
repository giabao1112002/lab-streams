/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eiu.cit.netprog;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author admin
 */
public class Play_Music {


    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException {                           
        
        try {
            SimpleAudioPlayer audioPlayer= new SimpleAudioPlayer();
            audioPlayer.play();
        } catch (IOException ex) {
            Logger.getLogger(Play_Music.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    public static class SimpleAudioPlayer {
        String path="C:\\Users\\admin\\lab-streams\\sample1.wav";
        AudioInputStream audioInputStream;
        Clip clip;
        public SimpleAudioPlayer() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
            audioInputStream =
                    AudioSystem.getAudioInputStream(new File(path).getAbsoluteFile());
             clip = AudioSystem.getClip();
             clip.open(audioInputStream); 
             
    }
     public void play()  
    { 
        clip.start();
            try {
                Thread.sleep(clip.getMicrosecondLength()/1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Play_Music.class.getName()).log(Level.SEVERE, null, ex);
            }
    }    
  }
}
