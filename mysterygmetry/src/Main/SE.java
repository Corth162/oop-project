//This class is for setting up the sound effect, clicking sound, so that it can be called in the main and played
//It's set up very similar to the music class, we switched a few functions but the set up is similar because it was easier for us

package Main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SE {

    Clip clip;

    public void setFile(URL name) {

        try {
            AudioInputStream sound = AudioSystem.getAudioInputStream(name);
            clip = AudioSystem.getClip();
            clip.open(sound);
        }
        catch(Exception e) {

        }
    }

    public void play(URL name) {

        clip.setFramePosition(0);
        clip.start();
    }

    public void loop(URL name) {

        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void stop(URL name) {

        clip.stop();
    }
}
