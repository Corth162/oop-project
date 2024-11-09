package Main;
import javax.swing.*;
import java.awt.*;

public class GameApp {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Main Game UI");
        mainFrame.setSize(500, 500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Button to open the instructions dialog
        JButton instructionsButton = new JButton("Instructions");
        instructionsButton.addActionListener(e -> showInstructions(mainFrame));

        mainFrame.add(instructionsButton);
        mainFrame.setVisible(true);
    }

    private static void showInstructions(JFrame parent) {
        JDialog instructionsDialog = new JDialog(parent, "How to Play", true);
        instructionsDialog.setSize(300, 200);
        instructionsDialog.setLocationRelativeTo(parent);


    }
}
