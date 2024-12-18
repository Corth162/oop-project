package Main;
import java.awt.event.*;

public class Actionhandler implements ActionListener {
    GameManager gm;
    public Actionhandler (GameManager gm) {
        this.gm = gm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //this is for setting up the actions for the objects
        String yourchoice = e.getActionCommand();
        System.out.println("Action Command: " + yourchoice);
        gm.playClickSound();  // This will play the click sound that we added in


        switch(yourchoice) {

            //these are all the cases of each action that's done on an object such as clicking on it, examining it closer
            //or picking up the item
            case "this_cup": gm.ev1.this_cup(); break;
            case "closer_cup": gm.ev1.closer_cup(); break;
            case "pick_up_cup": gm.ev1.pick_up_cup(); break;

            case "this_plant": gm.ev1.this_plant(); break;
            case "closer_plant": gm.ev1.closer_plant(); break;
            case "pick_up_plant": gm.ev1.pick_up_plant(); break;

            case "this_soap":gm.ev1.this_soap(); break;
            case "closer_soap": gm.ev1.closer_soap(); break;
            case "pick_up_soap": gm.ev1.pick_up_soap(); break;

            case "this_portrait":gm.ev1.this_portrait(); break;
            case "closer_portrait": gm.ev1.closer_portrait(); break;
            case "pick_up_portrait": gm.ev1.pick_up_portrait(); break;

            case "this_book": gm.ev1.this_book(); break;
            case "closer_book": gm.ev1.closer_book(); break;
            case "pick_up_book": gm.ev1.pick_up_book(); break;

            case "this_note": gm.ev1.this_note(); break;
            case "closer_note": gm.ev1.closer_note(); break;
            case "pick_up_note": gm.ev1.pick_up_note(); break;

            case "this_shirt": gm.ev1.this_shirt(); break;
            case "closer_shirt": gm.ev1.closer_shirt(); break;
            case "pick_up_shirt": gm.ev1.pick_up_shirt(); break;

            case "this_bottle": gm.ev1.this_bottle(); break;
            case "closer_bottle": gm.ev1.closer_bottle(); break;
            case "pick_up_bottle": gm.ev1.pick_up_bottle(); break;

            //the rooms are set up from numbers 1-8 and these actions are for going between the rooms
            //swithcing in room 1
            case "left8": gm.rchange.callroom8();break;
            case "right2": gm.rchange.callroom2();break;
            //switiching in room 2
            case "left1": gm.rchange.callroom1();break;
            case  "right3": gm.rchange.callroom3();break;
            //switching in room 3
            case "left2":gm.rchange.callroom2();break;
            case "right4": gm.rchange.callroom4();break;
            //switching for room 4
            case "left3":gm.rchange.callroom3();break;
            case "right5": gm.rchange.callroom5();break;
            //switching in room 5
            case "left4":gm.rchange.callroom4();break;
            case "right6": gm.rchange.callroom6();break;
            //switching in room 6
            case "left5":gm.rchange.callroom5();break;
            case "right7": gm.rchange.callroom7();break;
            //switching for room 7
            case "left6":gm.rchange.callroom6();break;
            case "right8": gm.rchange.callroom8();break;
            //swithcing for room 8
            case "left7":gm.rchange.callroom7();break;
            case "right1":gm.rchange.callroom1();break;

            default: System.out.println("Unknown action: " + yourchoice);
        }
    }
}
