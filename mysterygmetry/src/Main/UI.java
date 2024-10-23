package Main;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;

//tried doing extends jframe dont do that.
public class UI {
    GameManager gm;
    JFrame window;
    public JTextArea messageText;
    public JPanel[] bgPanel = new JPanel[10];
    public JLabel[] bgLable = new JLabel[10];

    public UI(GameManager gm) {
        this.gm = gm;
        createmainfield(); // constructor, makes the window, and also holds the sample text which ima change later duh

        // values!!!!

        //im not sure how to change the path between computers? that's a probable issue.
        //works on my computer tho lol
        //hiddenroom
        createbackground(1, 50, 50, 700, 300,
                "/Users/isabella/IdeaProjects/mysterygmetry/src/resources/hiddenroom(3).png");
        //bedroom
        createbackground(2, 50, 50, 700, 300,
                "/Users/isabella/IdeaProjects/mysterygmetry/src/resources/bedroom(7).jpg");

            //TRY THIS TO SEE IF THIS IS BETTER://this doesn't work i tried it...says something about nullpointer exception which i was getting a lot earlier too
            //createbackground(2, 50, 50, 700, 300, getClass().getResource("/resources/hiddenroom(3).png").toExternalForm());

        //objects
        //lipstick
        createobject(1,400, 150, 100, 100,
                "/Users/isabella/IdeaProjects/mysterygmetry/src/resources/lipstick.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_lipstick", "closer_lipstick", "pick_up_lipstick");
        //plant
        createobject(1,300, 160, 100, 100,
                "/Users/isabella/IdeaProjects/mysterygmetry/src/resources/carnivorous-plant.png",
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

        //sample text
        messageText = new JTextArea("Find clues to solve the Mystery.");
        //box
        messageText.setBounds(100, 400, 600, 150);
        messageText.setBackground(Color.BLUE);
        //text
        messageText.setForeground(Color.WHITE);
        messageText.setEditable(false);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("American Typewriter", Font.PLAIN, 26));
        window.add(messageText); // actually adding this text to the window
        window.setVisible(true);
    }

    //im trying with the img ill fix l8r
    public void createbackground(int panelIndex, int x, int y, int width, int height, String imagePath) {
        //practice with the gray box first before image, might delete this later if i can get the img to display
        //on its own, and not over this bgpanel
        bgPanel[panelIndex] = new JPanel();
        bgPanel[panelIndex].setBounds(x, y, width, height);
        bgPanel[panelIndex].setBackground(Color.BLACK);
        bgPanel[panelIndex].setLayout(null);
        window.add(bgPanel[panelIndex]);  // actually adding this box to the window

        bgLable[panelIndex] = new JLabel();
        bgLable[panelIndex].setBounds(0, 0, width, height);

        // Scaling the img because the img wasnt the exact size i need, and im just grabbing kinda random ones
        //to test, if i make custom ones should be able to ignore this too.
        ImageIcon backgroundIcon = new ImageIcon(imagePath);
        Image scaledImage = backgroundIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        bgLable[panelIndex].setIcon(scaledIcon);
        bgPanel[panelIndex].add(bgLable[panelIndex]);

        // Refresh the window so that the added components (image) are displayed properly
        window.revalidate();
        window.repaint();
    }

    public void createobject(int bgNum, int objx, int objy, int objwidth, int objheigth, String objFileNme,
                             String menu0,  String menu1, String menu2,
                             String choice0, String choice1, String choice2) {

        //MENU
        JPopupMenu popMenu = new JPopupMenu();
        JMenuItem menuItem[] = new JMenuItem[4]; //can change to add more items,
        //Menu items

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



        JLabel objectlable = new JLabel();
        objectlable.setBounds(objx, objy, objwidth, objheigth);

        objectlable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
                if(SwingUtilities.isRightMouseButton(e)){
                    popMenu.show(objectlable,e.getX(), e.getY());
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
        // Load and scale
        //scaling can be a problem for the image/obj to not show up. might just have all the objects be obvious
        //and the same size depending. i like the game-icons.net thing and we can cite it. I hopefully will later
        //change out the background images.
        ImageIcon objectIcon = new ImageIcon(objFileNme);
        Image scaledImage = objectIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledobjectIcon = new ImageIcon(scaledImage);

        objectlable.setIcon(scaledobjectIcon);

        // idk if I still need this but this adds the object JLabel after the background JLabel
        bgPanel[bgNum].add(objectlable);
        bgPanel[bgNum].setComponentZOrder(objectlable, 0);  // 0 places it on top
        bgPanel[bgNum].revalidate();
        bgPanel[bgNum].repaint();
        //SOOOOOO: I struggled so hard adding in an object because basically java swing is a dick.
        //Java sometimes won't update the order of things unless you explicitly change it.
        //setComponentZOrder(objectlabel, 0) directly states that the lipstick/objectlable is infront of bgpanel
        //regardless of the order they're added in.

    }

}
