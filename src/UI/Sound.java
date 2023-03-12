/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author dhf
 */
public class Sound {
    
    //Jika jawaban user benar
    public static void SoundTrue() {
        AudioClip click;
        URL urlClick = Sound.class.getResource("/sound/true.wav");
        click = Applet.newAudioClip(urlClick);
        click.play();
    }
    
    //jika jawaban user salah
    public static void SoundFalse() {
        AudioClip click;
        URL urlClick = Sound.class.getResource("/sound/false-1.wav");
        click = Applet.newAudioClip(urlClick);
        click.play();
    }
    
    //sound effect seluruh button
    public static void SoundButton() {
        AudioClip click;
        URL urlClick = Sound.class.getResource("/sound/button.wav");
        click = Applet.newAudioClip(urlClick);
        click.play();
    }
    
    //jika user menang permainan
    public static void SoundWin() {
        AudioClip click;
        URL urlClick = Sound.class.getResource("/sound/win.wav");
        click = Applet.newAudioClip(urlClick);
        click.play();
    }
    
    //jika user kalah permainan
    public static void SoundLose() {
        AudioClip click;
        URL urlClick = Sound.class.getResource("/sound/lose.wav");
        click = Applet.newAudioClip(urlClick);
        click.play();
    }
               
}
