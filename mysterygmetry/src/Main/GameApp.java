package Main;
import javax.swing.*;

public class GameApp {
    public static void main(String[] args) {


    }

    private static void showInstructions(JFrame parent) {
        JDialog instructionsDialog = new JDialog(parent, "How to Play", true);
        instructionsDialog.setSize(300, 200);
        instructionsDialog.setLocationRelativeTo(parent);


    }
}

