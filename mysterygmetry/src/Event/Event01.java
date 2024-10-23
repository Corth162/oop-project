package Event;

import Main.GameManager;

public class Event01 {
    GameManager gm;
    public Event01(GameManager gm) {
        this.gm = gm;
    }
    public void this_lipstick() {
        gm.ui.messageText.setText("This is Lipstick!");
    }
    public void closer_lipstick () {
        gm.ui.messageText.setText("This is Daisy-May's!");
    }
    public void pick_up_lipstick(){
        gm.ui.messageText.setText("You picked up the Lipstick!");
    }
    public void this_plant(){
        gm.ui.messageText.setText("This is a Plant.");
    }
    public void closer_plant(){
        gm.ui.messageText.setText("This is a poison Plant!\nYou should check another room.");
    }
    public void pick_up_plant(){
        gm.ui.messageText.setText("You picked up the Plant!");
    }
}

