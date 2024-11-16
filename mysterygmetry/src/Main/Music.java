package Main;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {

    private Clip clip;  // Clip to handle the music playback

    // Set the music file
    public void setFile(URL name) {
        try {
            AudioInputStream sound = AudioSystem.getAudioInputStream(name);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (Exception e) {
            e.printStackTrace();  // Print any errors that occur during loading
        }
    }

    // Play the music from the beginning
    public void play(URL name) {
        if (clip != null) {
            clip.setFramePosition(0);  // Reset to the start of the clip
            clip.start();  // Start the music
        } else {
            System.out.println("Music clip not initialized.");
        }
    }

    // Loop the music continuously
    public void loop(URL name) {
        if (clip != null) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);  // Loop the music
        } else {
            System.out.println("Music clip not initialized.");
        }
    }

    // Stop the music
    public void stop(URL name) {
        if (clip != null) {
            clip.stop();  // Stop the music playback
        } else {
            System.out.println("Music clip not initialized.");
        }
    }
}
