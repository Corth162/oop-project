package Main;
import java.awt.event.*;

public class Actionhandler implements ActionListener {
    GameManager gm;
    public Actionhandler (GameManager gm) {
        this.gm = gm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //objs
        String yourchoice = e.getActionCommand();
        System.out.println("Action Command: " + yourchoice);
        switch(yourchoice) {

            //objs
            case "this_lipstick": gm.ev1.this_lipstick(); break;
            case "closer_lipstick": gm.ev1.closer_lipstick(); break;
            case "pick_up_lipstick": gm.ev1.pick_up_lipstick(); break;

            case "this_plant": gm.ev1.this_plant(); break;
            case "closer_plant": gm.ev1.closer_plant(); break;
            case "pick_up_plant": gm.ev1.pick_up_plant(); break;

            case "this_book": gm.ev1.this_book(); break;
            case "closer_book": gm.ev1.closer_book(); break;
            case "pick_up_book": gm.ev1.pick_up_book(); break;

            case "this_note": gm.ev1.this_note(); break;
            case "closer_note": gm.ev1.closer_note(); break;
            case "pick_up_note": gm.ev1.pick_up_note(); break;

        //rooms
            //1
            case "left8": gm.rchange.callroom8();break;
            case "right2": gm.rchange.callroom2();break;
            //2
            case "left1": gm.rchange.callroom1();break;
            case  "right3": gm.rchange.callroom3();break;
            //3
            case "left2":gm.rchange.callroom2();break;
            case "right4": gm.rchange.callroom4();break;
            //4
            case "left3":gm.rchange.callroom3();break;
            case "right5": gm.rchange.callroom5();break;
            //5
            case "left4":gm.rchange.callroom4();break;
            case "right6": gm.rchange.callroom6();break;
            //6
            case "left5":gm.rchange.callroom5();break;
            case "right7": gm.rchange.callroom7();break;
            //7
            case "left6":gm.rchange.callroom6();break;
            case "right8": gm.rchange.callroom8();break;
            //8
            case "left7":gm.rchange.callroom7();break;
            case "right1":gm.rchange.callroom1();break;

            default: System.out.println("Unknown action: " + yourchoice);
        }
    }
}



