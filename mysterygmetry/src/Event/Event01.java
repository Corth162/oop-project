package Event;

import Main.GameManager;

public class Event01 {
    GameManager gm;

    public Event01(GameManager gm) {
        this.gm = gm;
    }

    public void this_cup() {
        gm.ui.messageText.setText("This is a cup!");
    }

    public void closer_cup() {
        gm.ui.messageText.setText("This has been knocked over!\n"
                + "The ice is spilling out of it.\n"
                + "There is a weird purple substance inside.\n"
                + "Maybe you should search for a clue in another room...\n");
    }

    public void pick_up_cup() {
        gm.ui.messageText.setText("You picked up the cup!");
    }

    public void this_plant() {
        gm.ui.messageText.setText("This is plant, blooming beautiful purple flowers\n"
                + "you’ve never seen before but appears to have some\n"
                + "stems cut off.\n"
                + " How odd...\n");
    }

    public void closer_plant() {
        gm.ui.messageText.setText("Upon closer look, you see it's a poison plant!\n"
                + "You should check the study for a clue in a book to\n"
                + "uncover what it means!\n");
    }

    public void pick_up_plant() {
        gm.ui.messageText.setText("You picked up the Plant!");
    }

    public void this_soap() {
        gm.ui.messageText.setText("This is a men's body soap.");
    }

    public void closer_soap() {
        gm.ui.messageText.setText("This soap smells awfully familiar.\n"
                + "You remember that Kyle smells exactly like this.\n"
                + "What a weird coicidence, you guess...\n");
    }

    public void pick_up_soap() {
        gm.ui.messageText.setText("You picked up the soap to glance at it, but\n"
                + "it's not very useful. You put it back.");
    }

    public void this_portrait() {
        gm.ui.messageText.setText("This is a portrait of yourself.");
    }

    public void closer_portrait() {
        gm.ui.messageText.setText("This was your grandmother's favorite picture of you\n"
                + "but it looks like someone drew a moustache and crossed out\n"
                + "your eyes. Looks like something Barf, or sorry, Garth,\n"
                + "your brother does.");
    }

    public void pick_up_portrait() {
        gm.ui.messageText.setText("You picked up the portrait only to roll your eyes\n"
                + "and put it back. How ridiculous.");
    }

    public void this_book() {
        gm.ui.messageText.setText("This is a Book.");
    }

    public void closer_book() {
        gm.ui.messageText.setText("This is a book on rare poisonous plants!\nThe picture on the cover looks awfully familiar.");
    }

    public void pick_up_book() {
        gm.ui.messageText.setText("You picked up the Book! You flip inside to find\n"
                + "that there's a page with a picture like the plant you saw.\n"
                + "The description says it's a plant to put people to sleep\n"
                + "and causes a laspe in memory. This was in your cup.\n"
                + "But who did this to you? And why? \n"
                + "You need to investigate.");
    }

    public void this_note() {
        gm.ui.messageText.setText("This is a an opened envelope with a note.");
    }

    public void closer_note() {
        gm.ui.messageText.setText("This is a copy of a background research done \n"
                + "on Daisy Mae! It appears her family was \n"
                + "in tons of debt.");
    }

    public void pick_up_note() {
        gm.ui.messageText.setText("You picked up the note! You see that your \n"
                +"grandmother did a background check on her. \n"
                + "It seems like she's been in debt for a very long time. \n"
                + "Could she have been after your ring \n"
                + "for the money?");
    }

    public void this_shirt() {
        gm.ui.messageText.setText("This is a men's shirt.");
    }

    public void closer_shirt() {
        gm.ui.messageText.setText("You see that looks very similar to a shirt Kyle wears...");
    }

    public void pick_up_shirt() {
        gm.ui.messageText.setText("You picked up the shirt to find a tag that says Kyle.\n"
                + "Why would this be here??\n"
                + "Maybe Kyle and your grandmother were much closer than you thought.\n"
                + "Did he get close to her for her money?\n"
                + "You put the shirt back to keep investigating.");
    }
    public void this_bottle() {
        gm.ui.messageText.setText("This is a whiskey bottle.");
    }

    public void closer_bottle() {
        gm.ui.messageText.setText("You see that it's part of a large case of other bottles.");
    }

    public void pick_up_bottle() {
        gm.ui.messageText.setText("You picked up the bottle to find it like one of Myrtle's.\n"
                + "She loves to drink this kind of whiskey.\n"
                + "Your late grandmother hated it though.\n"
                + "So why are cases of it up here?\n"
                + "Is your great-aunt Myrtle trying to move in in secret?\n"
                + "You did get the inheritance and she didn't.\n"
                + "Maybe she's up to something...");
    }
}
