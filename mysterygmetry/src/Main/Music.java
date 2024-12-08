//This class is for setting up the music so it can be called in the main to play

package Main;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {

    private Clip clip;  // This is a clip to handle the music playback

    // This will set the music file up
    public void setFile(URL name) {
        try {
            AudioInputStream sound = AudioSystem.getAudioInputStream(name);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (Exception e) {
            e.printStackTrace();  // This is tp print any errors that occur during loading
        }
    }

    //We want the music to play from the beginning so that's what is done here
    public void play(URL name) {
        if (clip != null) {
            clip.setFramePosition(0);  //This is to reset the music to the start of the clip
            clip.start();  //This actually starts the music
        } else {
            System.out.println("Music clip not initialized.");
        }
    }

    //We wanted to ensure we looped the music continuously
    public void loop(URL name) {
        if (clip != null) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } else {
            System.out.println("Music clip not initialized.");
        }
    }

    //This is for stopping the music
    public void stop(URL name) {
        if (clip != null) {
            clip.stop();  
        } else {
            System.out.println("Music clip not initialized.");
        }
    }
}
