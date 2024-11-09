
//  event01 holds the text in a public void function

package Main;

import Event.Event01;
import javax.swing.*;
import java.awt.*;

public class GameManager {


    Actionhandler ahandler = new Actionhandler(this);
    //Ui must be public so Event can access it.
    public UI ui;
    public Roomchanger rchange = new Roomchanger(this);
    public Event01 ev1 = new Event01(this);


    public static void main(String[] args) {

        new GameManager();
    }

    public GameManager() {
        //must have UI outside of main which is what i was trying to do and of course no window
        //showed up.
        ui = new UI(this);
        rchange.callroom1();
        showInstructions();
    }
    public void showInstructions() {
        JDialog instructionsDialog = new JDialog(ui.GameApp, "How to Play");
        instructionsDialog.setSize(700, 700);
        instructionsDialog.setLocationRelativeTo(ui.GameApp);
        instructionsDialog.setPreferredSize(new Dimension(400, 300));
        instructionsDialog.getContentPane().setBackground(Color.BLACK);
        instructionsDialog.setForeground(Color.PINK);
        instructionsDialog.setFont(new Font("Arial", Font.BOLD, 16));
        JTextArea instructionsText = new JTextArea("Welcome to the Game!\n\n"
                +" MISSION: FIND YOUR MISSING RING (WORTH $500,000!!!)\n"
                +"-----------------------------"
                +"\nYou wake up groggy, remnants of last night’s wild celebration scattered around—your \n" +
                "first night in your own home, surrounded by friends. The fun is fresh in your mind until \n" +
                "a sickening feeling hits. You reach for the precious ring your grandmother left you—a family\n" +
                " heirloom worth half a million—but your hand finds nothing. Frantically, you search, \n" +
                "but it’s gone. Heart pounding, you realize someone at the party must have stolen it. \n" +
                "Betrayal stings as you sift through hazy memories, wondering who could have taken something \n" +
                "so priceless. Now, you’re determined to find the culprit and reclaim what’s yours.\n\n"
                + "How to Play:\n"
                +"-----------------------------"
                + "\nGo through each room, collect objects to find clues about who stole your ring.\n " +
                "when you're ready, click the 'accuse' button in the bottom right corner and select your\n " +
                "suspect. Be careful though, if you pick the wrong person it's GAME OVER!\n"
                +" \n"
                + "Suspects:\n "
                +"-----------------------------"
                + "\n- Kyle: Thinks he knows everything. \n" +
                "   Tech-Savy guy. Seems to have a slightly too familiar relationship with your grandma.\n" +
                "   could he have stolen it to bring her back from her year in Monte Carlo, Monaco.\n" +
                "   Did he steal it just to get your grandma back?\n"
                +"- Garth AKA Barf: Jealous older brother that believes as favorite should’ve \n" +
                "   gotten the house (and the ring) from grandma instead of you.\n" +
                "   How could he betray his family- his own sibling, for something so petty.\n"
                +"- Daisy Mae: Lovely girl and your best friend since forever. \n " +
                "   However she is in a lot of student debt and needs the money...\n"
                + " - Great-Aunt Myrtle, grandma’s sister that’s raging alcoholic and party animal \n" +
                "   that started the chaotic night of partying. \n" +
                "   Could she have started on purpose as a distraction to steal the ring?\n"
                );

        instructionsText.setEditable(false);
        instructionsDialog.add(new JScrollPane(instructionsText));

        instructionsDialog.setVisible(true);
    }
}
