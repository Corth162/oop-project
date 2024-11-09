package Main;

public class Roomchanger {
    GameManager gm;

    public Roomchanger(GameManager gm) {
        this.gm = gm;

    }

    public void callroom1() {
        gm.ui.bgPanel[1].setVisible(true); //
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.messageText.setText("You're in the living room.");
    }

    public void callroom2() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(true); //
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.messageText.setText("You're in the sun room.");
    }

    public void callroom3() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(true); //
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.messageText.setText("You're in the bathroom.");
    }

    public void callroom4() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(true); //
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.messageText.setText("You're in the dining room.");
    }

    public void callroom5() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(true); //
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.messageText.setText("You're in the study.");
    }

    public void callroom6() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(true); //
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.messageText.setText("You're in the entrance.");
    }

    public void callroom7() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(true); //
        gm.ui.bgPanel[8].setVisible(false);
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.messageText.setText("You're in the bedroom.");
    }

    public void callroom8() {
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(false);
        gm.ui.bgPanel[3].setVisible(false);
        gm.ui.bgPanel[4].setVisible(false);
        gm.ui.bgPanel[5].setVisible(false);
        gm.ui.bgPanel[6].setVisible(false);
        gm.ui.bgPanel[7].setVisible(false);
        gm.ui.bgPanel[8].setVisible(true); //
        gm.ui.bgPanel[9].setVisible(false);
        gm.ui.messageText.setText("You're in the attic.");
    }
}

