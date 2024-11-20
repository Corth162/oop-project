package Main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//tried doing extends jframe dont do that.
public class UI {
    private GameManager gm;
    public JFrame window;
    public Window GameApp;
    public JTextArea messageText;
    public JPanel[] bgPanel = new JPanel[10];
    public JLabel[] bgLable = new JLabel[10];
    private JFrame frame;


    public JFrame getFrame() {
        return frame;
    }

    JPanel inventoryPanel;
    public JPanel BookLabel, PlantLabel, NoteLabel, LipstickLabel;

    public UI(GameManager gm) {
        this.gm = gm;
        createmainfield(); // constructor, makes the window, and also holds the sample text which ima change later duh

        //values!!!!
        //rooms
        //1)living room
        createbackground(1, 50, 50, 700, 325,
                "/resources/livingroom.jpg");
        //2)sunroom
        createbackground(2, 50, 50, 700, 325,
                "/resources/sun_room.jpg");
        //3)bathroom
        createbackground(3, 50, 50, 700, 325,
                "/resources/bathroom.jpg");
        //4)dining room
        createbackground(4, 50, 50, 700, 325,
                "/resources/diningroom.jpg");
        //5)study
        createbackground(5, 50, 50, 700, 325,
                "/resources/study.jpg");
        //6)entrance
        createbackground(6, 50, 50, 700, 325,
                "/resources/entrance.jpg");
        //7)bedroom
        createbackground(7, 50, 50, 700, 325,
                "/resources/bedroom.jpg");
        //8)attic
        createbackground(8, 50, 50, 700, 325,
                "/resources/attic.jpg");
        //9)hidden room
        createbackground(9, 50, 50, 700, 325,
                "/resources/sun_room.jpg");
        //objects
        //cup
        createobject(1,200, 150, 100, 100,
                "/resources/cup.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_cup", "closer_cup", "pick_up_cup");
        //plant
        createobject(2,300, 160, 100, 100,
                "/resources/carnivorous-plant.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_plant", "closer_plant", "pick_up_plant");
        //soap
        createobject(3,500, 160, 100, 100,
                "/resources/soap.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_soap", "closer_soap", "pick_up_soap");
        //portrait
        createobject(4,300, 160, 100, 100,
                "/resources/portrait.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_portrait", "closer_portrait", "pick_up_portrait");
        //book
        createobject(5,300, 160, 100, 100,
                "/resources/white-book.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_book", "closer_book", "pick_up_book");
        //envelope
        createobject(6,450, 160, 100, 100,
                "/resources/envelope.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_note", "closer_note", "pick_up_note");
        //shirt
        createobject(7,400, 150, 100, 100,
                "/resources/shirt.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_shirt", "closer_shirt", "pick_up_shirt");
        //bottle
        createobject(8,300, 150, 100, 100,
                "/resources/bottle.png",
                "What's This?", "Look Closer", "Pick Up",
                "this_bottle", "closer_bottle", "pick_up_bottle");
        //arrows
        //1
        createarrowleft(1,0,150,
                "<--", "right8");
        createarrowright(1,650,150,
                "-->","right2");
        //2
        createarrowleft(2,0,150,
                "<--", "left1");
        createarrowright(2,650,150,
                "-->","right3");
        //3
        createarrowleft(3,0,150,
                "<--", "left2");
        createarrowright(3,650,150,
                "-->","right4");
        //4
        createarrowleft(4,0,150,
                "<--", "left3");
        createarrowright(4,650,150,
                "-->","right5");
        //5
        createarrowleft(5,0,150,
                "<--", "left4");
        createarrowright(5,650,150,
                "-->","right6");
        //6
        createarrowleft(6,0,150,
                "<--", "left5");
        createarrowright(6,650,150,
                "-->","right7");
        //7
        createarrowleft(7,0,150,
                "<--", "left6");
        createarrowright(7,650,150,
                "-->","right8");
        //8
        createarrowleft(8,0,150,
                "<--", "left7");
        createarrowright(8,650,150,
                "-->","right1");


    }

    public void createmainfield() {
        window = new JFrame();
        window.setSize(800, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setTitle("Point & Click: Mystery House");

        // "How to Play" button
        JButton tophelpButton = new JButton("How to Play");
        tophelpButton.setBounds(650, 15, 110, 30);
        tophelpButton.setBackground(Color.DARK_GRAY);
        //added in extra window?
        tophelpButton.addActionListener(e -> gm.showInstructions());
        window.add(tophelpButton);

        // Create "ACCUSE" button
        JButton bottomtrigger = new JButton("ACCUSE");
        bottomtrigger.setBounds(650, 600, 110, 50);

        //new
        bottomtrigger.addActionListener(e -> showAccuseOptions()); // Attach action listener

        window.add(bottomtrigger);

        window.setLayout(null);
        window.setResizable(false);
        window.setVisible(true);

        //sample text
        messageText = new JTextArea("Find clues to solve the Mystery.");
        //box
        messageText.setBounds(100, 400, 600, 150);
        messageText.setBackground(Color.BLACK);
        //text
        messageText.setForeground(Color.WHITE);
        messageText.setEditable(false);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("American Typewriter", Font.PLAIN, 22)); //new font?
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
        ImageIcon backgroundIcon = new ImageIcon(getClass().getResource(imagePath));
        if (backgroundIcon.getImageLoadStatus() != MediaTracker.ERRORED) {
            // Scaling the image
            Image scaledImage = backgroundIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            bgLable[panelIndex].setIcon(scaledIcon);
        } else {
            System.out.println("Image not found: " + imagePath);
        }

        bgPanel[panelIndex].add(bgLable[panelIndex]);
        window.revalidate();
        window.repaint();
    }

    public void createobject(int bgNum, int objx, int objy, int objwidth, int objheigth, String objFileNme,
                             String menu0,  String menu1, String menu2,
                             String choice0, String choice1, String choice2) {

        //MENU
        JPopupMenu popMenu = new JPopupMenu();
        JMenuItem[] menuItem = new JMenuItem[4]; //can change to add more items,
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
        ImageIcon objectIcon = new ImageIcon(getClass().getResource(objFileNme));
        if (objectIcon.getImageLoadStatus() != MediaTracker.ERRORED) {
            Image scaledImage = objectIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon scaledObjectIcon = new ImageIcon(scaledImage);

            objectlable.setIcon(scaledObjectIcon);
        } else {
            System.out.println("Object image not found: " + objFileNme);
        }

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

    public void createarrowleft(int bgNUM, int x, int y, String arrowlble, String direction) {
        JButton arrowButton = new JButton(arrowlble);
        arrowButton.setBounds(x, y, 50, 50);
        arrowButton.setBackground(Color.BLACK);
        arrowButton.setOpaque(true);
        arrowButton.setFocusPainted(false);
        arrowButton.addActionListener(gm.ahandler);
        arrowButton.setActionCommand(direction);

        if (bgPanel[bgNUM].getLayout() != null) {
            bgPanel[bgNUM].setLayout(null);
        }

        bgPanel[bgNUM].add(arrowButton);
        bgPanel[bgNUM].setComponentZOrder(arrowButton, 0);  // Bring it to the front
        bgPanel[bgNUM].revalidate();
        bgPanel[bgNUM].repaint();
    }

    public void createarrowright(int bgNUM, int x, int y, String arrowlble, String direction) {
        JButton arrowButton = new JButton(arrowlble);
        arrowButton.setBounds(x, y, 50, 50);
        arrowButton.setBackground(Color.BLACK);
        arrowButton.setOpaque(true);  // Ensures the background color shows up
        arrowButton.setFocusPainted(false);
        arrowButton.addActionListener(gm.ahandler);
        arrowButton.setActionCommand(direction);

        // Ensure bgPanel has a null layout for absolute positioning
        if (bgPanel[bgNUM].getLayout() != null) {
            bgPanel[bgNUM].setLayout(null);
        }

        bgPanel[bgNUM].add(arrowButton);
        bgPanel[bgNUM].setComponentZOrder(arrowButton, 0);  // Bring it to the front
        bgPanel[bgNUM].revalidate();
        bgPanel[bgNUM].repaint();
    }
    public void inventory() {
        JPanel inventoryPanel = new JPanel();
        inventoryPanel.setBounds(100, 650, 300, 50); // Adjust width if more items are added
        inventoryPanel.setBackground(Color.PINK);
        inventoryPanel.setLayout(new GridLayout(1, 6));

        window.add(inventoryPanel);

        try {
            ImageIcon plantIcon = new ImageIcon(getClass().getClassLoader().getResource("resources/carnivorous-plant.png"));
            JLabel plantLabel = new JLabel(plantIcon);
            inventoryPanel.add(plantLabel);
        } catch (NullPointerException e) {
            System.out.println("Error loading plant icon.");
        }

        window.revalidate();
        window.repaint();
    }


    //ACCUSE OPTIONS
    private void showAccuseOptions() {
        String[] options = {"Kyle", "Garth", "Daisy Mae", "Great Aunt Myrtle"};
        int choice = JOptionPane.showOptionDialog(
                window, "Who do you accuse?", "Make Your Accusation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]
        );
        // if Daisy then win, else lose
        if (choice == 2) {
            showWinMessage();
        } else if (choice >= 0) {
            showLoseMessage();
        }
    }
    private void showWinMessage() {
        JOptionPane.showMessageDialog(
                window, "Congratulations! You solved the mystery!\n"
                        + "Daisy is so sad she breaks down in tears and gives you back your missing ring!\n"
                        + "she goes to prison forever :(",
                "You Win!", JOptionPane.INFORMATION_MESSAGE
                );
        finGame();
    }
    private void showLoseMessage() {
        JOptionPane.showMessageDialog(window,
                "Oh no! That was the wrong choice. \n"
                        + "They got so mad at you for falsely accusing them & they kill you :(\n"
                        + "Game over!",
                "Game Over", JOptionPane.ERROR_MESSAGE
                );
        disableGame();
    }
    private void disableGame() {
        window.getContentPane().removeAll();
        JLabel gameOverLabel = new JLabel("GAME OVER", SwingConstants.CENTER);
        gameOverLabel.setForeground(Color.RED);
        gameOverLabel.setFont(new Font("American Typewriter", Font.BOLD, 66));
        window.getContentPane().add(gameOverLabel);
        gameOverLabel.setBounds(0, 0, 800, 700);
        window.repaint();
    }
    private void finGame() {
        window.getContentPane().removeAll();
        JLabel winLabel = new JLabel("YOU WIN!", SwingConstants.CENTER);
        winLabel.setForeground(Color.GREEN);
        winLabel.setFont(new Font("American Typewriter", Font.BOLD, 66));
        window.getContentPane().add(winLabel);
        winLabel.setBounds(0, 0, 800, 700);
        window.repaint();
    }
    //END OF ACCUSE
}
}
