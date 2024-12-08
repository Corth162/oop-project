package Main;
import javax.swing.*;

public class GameApp {
    public static void main(String[] args) {
//was originally going to hold text but i found it easier to just put in main (gm)

    }

    private static void showInstructions(JFrame parent) {
        JDialog instructionsDialog = new JDialog(parent, "How to Play", true);
        instructionsDialog.setSize(300, 200);
        instructionsDialog.setLocationRelativeTo(parent);


    }
}

