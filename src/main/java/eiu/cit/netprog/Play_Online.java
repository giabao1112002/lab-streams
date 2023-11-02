/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eiu.cit.netprog;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author admin
 */
public class Play_Online {

    public static void main(String[] args) {
      String audioFilePath = "AudioFileWithMp3Format.mp3";
SoundPlayerUsingJavaZoom player = new SoundPlayerUsingJavaZoom();
try {
    BufferedInputStream buffer = new BufferedInputStream(
      player.getClass().getClassLoader().getResourceAsStream(audioFilePath));
    Player mp3Player = new Player(buffer);
    mp3Player.play();
} catch (Exception ex) {
    System.out.println("Error occured during playback process:" + ex.getMessage());
}

    }

}
