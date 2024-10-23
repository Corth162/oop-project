
//  event01 holds the text in a public void function
//note: fix image path to be NOT directed to my computer.
//  currently using Absolute path, need to use content root path

package Main;

import Event.Event01;

public class GameManager {

    Actionhandler ahandler = new Actionhandler(this);
    //Ui must be public so Event can access it.
    public UI ui;
    public Event01 ev1 = new Event01(this);

    public static void main(String[] args) {
        // Start the game manager
        new GameManager();
    }

    public GameManager() {
        //must have UI outside of main which is what i was trying to do and of course no window
        //showed up.
        ui = new UI(this);
    }
}