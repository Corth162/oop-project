package Main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//tried doing extends jframe dont do that.
public class UI {
    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel[] bgPanel = new JPanel[10];
    public JLabel[] bgLabel = new JLabel[10];

    public UI(GameManager gm) {
        this.gm = gm;
        createmainfield(); // constructor, makes the window, and also holds the sample text which ima change later duh

        // Create backgrounds
        createbackground(1, 50, 50, 700, 300, "/resources/hiddenroom(3).png"); // Adjusted path
        createbackground(2, 50, 50, 700, 300, "/resources/bedroom(7).jpg"); // Adjusted path

        // Create objects
        createobject(1, 400, 150, 100, 100,
                "/resources/lipstick.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_lipstick", "closer_lipstick", "pick_up_lipstick");
        createobject(1, 300, 160, 100, 100,
                "/resources/carnivorous-plant.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_plant", "closer_plant", "pick_up_plant");
    }

    public void createmainfield() {
        window = new JFrame();
        window.setSize(800, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setResizable(false);

        // Sample text
        messageText = new JTextArea("Find clues to solve the Mystery.");
        messageText.setBounds(100, 400, 600, 150);
        messageText.setBackground(Color.BLUE);
        messageText.setForeground(Color.WHITE);
        messageText.setEditable(false);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("American Typewriter", Font.PLAIN, 26));
        window.add(messageText); // Actually adding this text to the window
        window.setVisible(true);
    }

    public void createbackground(int panelIndex, int x, int y, int width, int height, String imagePath) {
        bgPanel[panelIndex] = new JPanel();
        bgPanel[panelIndex].setBounds(x, y, width, height);
        bgPanel[panelIndex].setBackground(Color.BLACK);
        bgPanel[panelIndex].setLayout(null);
        window.add(bgPanel[panelIndex]);  // Actually adding this box to the window

        bgLabel[panelIndex] = new JLabel();
        bgLabel[panelIndex].setBounds(0, 0, width, height);

        // Load the image
        ImageIcon backgroundIcon = new ImageIcon(getClass().getResource(imagePath));
        if (backgroundIcon.getImageLoadStatus() != MediaTracker.ERRORED) {
            // Scaling the image
            Image scaledImage = backgroundIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            bgLabel[panelIndex].setIcon(scaledIcon);
        } else {
            System.out.println("Image not found: " + imagePath);
        }

        bgPanel[panelIndex].add(bgLabel[panelIndex]);
        window.revalidate();
        window.repaint();
    }

    public void createobject(int bgNum, int objx, int objy, int objwidth, int objheight, String objFileName,
                             String menu0, String menu1, String menu2,
                             String choice0, String choice1, String choice2) {

        // MENU
        JPopupMenu popMenu = new JPopupMenu();
        JMenuItem menuItem[] = new JMenuItem[4]; // Can change to add more items
        // Menu items
        menuItem[0] = new JMenuItem(menu0);
        menuItem[0].addActionListener(gm.ahandler);
        menuItem[0].setActionCommand(choice0);
        popMenu.add(menuItem[0]);

        menuItem[1] = new JMenuItem(menu1);
        menuItem[1].addActionListener(gm.ahandler);
        menuItem[1].setActionCommand(choice1);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(menu2);
        menuItem[2].addActionListener(gm.ahandler);
        menuItem[2].setActionCommand(choice2);
        popMenu.add(menuItem[2]);

        JLabel objectLabel = new JLabel();
        objectLabel.setBounds(objx, objy, objwidth, objheight);

        objectLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    popMenu.show(objectLabel, e.getX(), e.getY());
                }
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        // Load and scale object image
        ImageIcon objectIcon = new ImageIcon(getClass().getResource(objFileName));
        if (objectIcon.getImageLoadStatus() != MediaTracker.ERRORED) {
            Image scaledImage = objectIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon scaledObjectIcon = new ImageIcon(scaledImage);

            objectLabel.setIcon(scaledObjectIcon);
        } else {
            System.out.println("Object image not found: " + objFileName);
        }

        bgPanel[bgNum].add(objectLabel);
        bgPanel[bgNum].setComponentZOrder(objectLabel, 0);  // 0 places it on top
        bgPanel[bgNum].revalidate();
        bgPanel[bgNum].repaint();
    }
}
