// this is the main class, everything else comes through here
//  event01 holds the dialogue

package Main;

import Event.Event01;
import javax.swing.*;
import java.awt.*;

import java.net.URL;  


public class GameManager {


    Actionhandler ahandler = new Actionhandler(this);
    //Ui must be public so Event can access it.
    public UI ui;
    public Roomchanger rchange = new Roomchanger(this);
    public Event01 ev1 = new Event01(this);
    Music music = new Music();
    SE se = new SE();

    public URL ethMusic = getClass().getClassLoader().getResource("resources/EthernightClub.wav");  
    public URL clickSound = getClass().getClassLoader().getResource("resources/click.wav");  
    public URL currentMusic;

    public static void main(String[] args) {
        // Start the game manager
        new GameManager();
    }

    public GameManager() {
        //must have UI outside of main which is what i was trying to do and of course no window
        //showed up.
        ui = new UI(this);
        rchange.callroom1();
        showInstructions();

        if (ethMusic != null) {
            currentMusic = ethMusic;  // Assign ethMusic to currentMusic
            playMusic(currentMusic);   // Play the selected music
        } else {
            System.out.println("Music file not found.");
        }
    }

    public void playClickSound() {
        if (clickSound != null) {
            se.setFile(clickSound);  // Set the file for the click sound
            se.play(clickSound);     // Play the click sound from the beginning
        } else {
            System.out.println("Click sound file not found.");
        }
    }

    public void playMusic(URL url) {
        if (url != null) {
            music.setFile(url);  // Set the file for the music
            music.play(url);     // Play the music from the beginning
            music.loop(url);     // Loop the music
        } else {
            System.out.println("Music file not found.");
        }
    }

    // Stop the background music
    public void stopMusic() {
        if (music != null) {
            music.stop(currentMusic);
        }
    }

    public void showInstructions() {
        // Create a non-modal dialog
        JDialog instructionsDialog = new JDialog((Dialog) ui.GameApp, "How to Play", false);
        instructionsDialog.setSize(700, 600);
        instructionsDialog.setLocationRelativeTo(ui.GameApp);

        JTextArea instructionsText = new JTextArea("Welcome to the Game!\n\n"
                + "How to Play:\n\n"
                + "- You wake up from a wild party from the night before only to realize your priceless ring that your\n"
                + "late grandmother left behind for you is missing. You cannot remember anything that happened last night.\n"
                + "Did you lose the ring or was it stolen from you and why?\n"
                + "You need to find the ring and if someone took it before everyone leaves.\n\n\n"
                + "SUSPECTS:\n\n"
                + "1. Kyle, he's your late grandmother's neighbor and helped her with technical problems \n"
                + "which made them have an oddly close relationship. \n"
                + "Could he have been jealous that you inherited the ring and manor?\n\n"
                + "2. Garth, your older brother that has always gotten everything he wanted, \n"
                + "except the inheritance.\n"
                + "Could he have possibly tried to steal the ring for revenge?\n\n"
                + "3. Daisy Mae, she's been your best friend at college and has always stood by your side. \n"
                + "You notice she's been distant since last night, but she couldn't have possibly done it, right?\n\n"
                + "4. Great-Aunt Myrtle, she's your late grandmother's older sister.\n "
                + "She's a raging alcoholic, she is the one that started the crazy party the night before.\n"
                +" Did she do that to take the ring from you since her sister didn't?\n\n\n"
                + "MISSION: \n\n"
                + "You must search the rooms throughout the manor for objects that contain clues to solve this mystery.\n"
                + "If you do not find the right culprit, you may be doomed to start all over!\n");
        instructionsText.setEditable(false);
        instructionsDialog.add(new JScrollPane(instructionsText));

        // Display the dialog
        instructionsDialog.setVisible(true);
    }
}


//other stuff i wanna add...


//3) add an inventory for useful clues
//4) make accuse button!!!! --> NEEDED TO BE DONE
//      -   make it so inventory must be full to accuse
//      -   make it so when accuse wrong, comes up with a popup saying you lost,
//          game resets upon failure. (or window closes itself)
