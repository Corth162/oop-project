package Main;
import java.awt.event.*;

public class Actionhandler implements ActionListener {
    GameManager gm;
    public Actionhandler (GameManager gm) {
        this.gm = gm;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String yourchoice = e.getActionCommand();
        System.out.println("Action Command: " + yourchoice);
        switch(yourchoice) {
            case "this_lipstick": gm.ev1.this_lipstick(); break;
            case "closer_lipstick": gm.ev1.closer_lipstick(); break;
            case "pick_up_lipstick": gm.ev1.pick_up_lipstick(); break;
            case "this_plant": gm.ev1.this_plant(); break;
            case "closer_plant": gm.ev1.closer_plant(); break;
            case "pick_up_plant": gm.ev1.pick_up_plant(); break;
            default: System.out.println("Unknown action: " + yourchoice); // debugging cuz this_PLaNT DIDNT WORK
        }
    }
}

