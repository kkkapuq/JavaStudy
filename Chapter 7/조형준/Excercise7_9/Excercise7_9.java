package Chapter7.Excercise.Excercise7_9;

import java.awt.*;
import java.awt.event.*;
class Exercise7_9 {
    public static void main(String[] args)
    {
        Frame f = new Frame();
        f.addWindowListener(new EventHandler());
    }
}
class EventHandler extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}



