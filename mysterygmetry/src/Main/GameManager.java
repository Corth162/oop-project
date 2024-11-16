
//  event01 holds the text in a public void function

package Main;

import Event.Event01;
import javax.swing.*;
import java.awt.*;
import java.net.URL;  // Add this line


public class GameManager {


    Actionhandler ahandler = new Actionhandler(this);
    //Ui must be public so Event can access it.
    public UI ui;
    public RoomChanger rchange = new RoomChanger(this);
    public Event01 ev1 = new Event01(this);
    Music music = new Music();

    public URL ethMusic = getClass().getClassLoader().getResource("resources/EthernightClub.wav");  // Path to your song file
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
        instructionsDialog.setSize(300, 200);
        instructionsDialog.setLocationRelativeTo(ui.GameApp);

        JTextArea instructionsText = new JTextArea("Welcome to the Game!\n\n"
                + "How to Play:\n"
                + "- Instructions go here...\n"
                + "- Details about characters...\n");
        instructionsText.setEditable(false);
        instructionsDialog.add(new JScrollPane(instructionsText));

        // Display the dialog
        instructionsDialog.setVisible(true);
    }
}


//other stuff i wanna add...
//1) music! --> not needed but i feel like it would make it seem more finished.
//2) more objects to make the mystery less obvious
//3) add an inventory for useful clues
//4) make accuse button!!!! --> NEEDED TO BE DONE
//      -   make it so inventory must be full to accuse
//      -   make it so when accuse wrong, comes up with a popup saying you lost,
//          game resets upon failure. (or window closes itself)
//5) flesh out how to play button w/ character descriptions
